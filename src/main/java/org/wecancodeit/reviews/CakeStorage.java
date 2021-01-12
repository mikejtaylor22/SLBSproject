package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class CakeStorage {
    Map<Long, ReviewCakeItem> reviewCakeItemMap = new HashMap<>();

    public CakeStorage() {
        CakeType sampleCakeType = new CakeType("wedding cake");
        ReviewCakeItem sampleCakeItem = new ReviewCakeItem(sampleCakeType, "chocolate", "cream cheese", 20.00, "round", "good");
        reviewCakeItemMap.put(1L, sampleCakeItem);
    }

    public void addReviewCakeItem(ReviewCakeItem inReviewCakeItem) { reviewCakeItemMap.put(inReviewCakeItem.getId(), inReviewCakeItem);}

    public Collection<ReviewCakeItem> getCakeType() { return reviewCakeItemMap.values();}

    public ReviewCakeItem getCakeTypeByID(Long id) { return reviewCakeItemMap.get(id);}


}
