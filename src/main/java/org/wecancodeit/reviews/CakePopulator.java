package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CakePopulator implements CommandLineRunner {
    CakeStorage cakeStorage;
    CakeItemStorage cakeItemStorage;

    public CakePopulator(CakeStorage inCakeStorage,CakeItemStorage inCakeItemStorage) {
        cakeStorage = inCakeStorage;
        cakeItemStorage = inCakeItemStorage;
    }

    @Override
    public void run(String... args) throws Exception {
        CakeType sampleCakeType1 = new CakeType("wedding cake");
        CakeType sampleCakeType2 = new CakeType("Birthday Cake");
        cakeStorage.addCakeType(sampleCakeType1);
        cakeStorage.addCakeType(sampleCakeType2);
        ReviewCakeItem sampleCakeItem = new ReviewCakeItem(sampleCakeType1, "chocolate", "cream cheese", 20.00, "round", "good");
        cakeItemStorage.addReviewCakeItem(sampleCakeItem);
    }


}
