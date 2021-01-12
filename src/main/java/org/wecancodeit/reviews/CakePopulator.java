package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CakePopulator implements CommandLineRunner {
    CakeStorage cakeStorage;

    public CakePopulator(CakeStorage inCakeStorage) { cakeStorage = inCakeStorage;}

    @Override
    public void run(String... args) throws Exception {
        CakeType sampleCakeType = new CakeType("wedding cake");
        ReviewCakeItem sampleCakeItem = new ReviewCakeItem(sampleCakeType, "chocolate", "cream cheese", 20.00, "round", "good");
        cakeStorage.addReviewCakeItem(sampleCakeItem);
    }


}
