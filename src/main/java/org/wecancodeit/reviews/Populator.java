package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.reviews.Models.CakeType;
import org.wecancodeit.reviews.Models.Hashtag;
import org.wecancodeit.reviews.Models.ReviewCakeItem;
import org.wecancodeit.reviews.Storage.CakeItemStorage;
import org.wecancodeit.reviews.Storage.CakeStorage;
import org.wecancodeit.reviews.Storage.HashtagStorage;

@Component
public class Populator implements CommandLineRunner {
    CakeStorage cakeStorage;
    CakeItemStorage cakeItemStorage;
    private HashtagStorage hashtagStorage;

    public Populator(CakeStorage inCakeStorage, CakeItemStorage inCakeItemStorage, HashtagStorage inHashtagStorage) {
        cakeStorage = inCakeStorage;
        cakeItemStorage = inCakeItemStorage;
        hashtagStorage = inHashtagStorage;
    }

    @Override
    public void run(String... args) throws Exception {
        CakeType sampleCakeType1 = new CakeType("Wedding Cake");
        CakeType sampleCakeType2 = new CakeType("Birthday Cake");
        cakeStorage.addCakeType(sampleCakeType1);
        cakeStorage.addCakeType(sampleCakeType2);

        Hashtag sampleHashtag1 = new Hashtag("tasty");
        Hashtag sampleHashtag2 = new Hashtag("delicious");
        hashtagStorage.addHashtag(sampleHashtag1);
        hashtagStorage.addHashtag(sampleHashtag2);

        ReviewCakeItem sampleCakeItem1 = new ReviewCakeItem(sampleCakeType1, "chocolate", "cream cheese", 20.00, "round", "good", sampleHashtag1, sampleHashtag2);
        ReviewCakeItem sampleCakeItem2 = new ReviewCakeItem(sampleCakeType2, "vanilla", "butter cream", 40.00, "square", "moist", sampleHashtag1, sampleHashtag2);

        cakeItemStorage.addReviewCakeItem(sampleCakeItem1);
        cakeItemStorage.addReviewCakeItem(sampleCakeItem2);

    }




}
