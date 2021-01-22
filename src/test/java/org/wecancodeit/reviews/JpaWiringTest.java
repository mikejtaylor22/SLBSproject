package org.wecancodeit.reviews;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.wecancodeit.reviews.Models.CakeType;
import org.wecancodeit.reviews.Models.ReviewCakeItem;

import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
public class JpaWiringTest {

    @Autowired
    private CakeTypeRepository cakeTypeRepo;
    @Autowired
    private CakeItemRepository cakeItemRepo;
    @Autowired
    private TestEntityManager testEntityManager;

    @Test
    public void checkTypeHasManyItemsAndItemsHasSingleType() {
        CakeType wedding = new CakeType("Wedding");

        cakeTypeRepo.save(wedding);

        ReviewCakeItem task1 = new ReviewCakeItem((wedding),"chocolate","Frosted",524.00,"Round","Beautiful cake!");
        ReviewCakeItem task2 = new ReviewCakeItem((wedding),"Vanilla","Sprinkles",554.00,"Round","Funny looking cake!");

        cakeItemRepo.save(task1);
        cakeItemRepo.save(task2);

        testEntityManager.flush();
        testEntityManager.clear();

        CakeType retrievedWedding = cakeTypeRepo.findById(wedding.getId()).get();

        assertThat(retrievedWedding.getItems()).contains(task1, task2);
    }


    }


