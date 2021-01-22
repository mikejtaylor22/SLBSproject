package org.wecancodeit.reviews.Storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.CakeItemRepository;
import org.wecancodeit.reviews.Models.CakeType;
import org.wecancodeit.reviews.Models.ReviewCakeItem;

import java.util.Optional;


@Service
public class CakeItemStorage {
        // Map<Long, ReviewCakeItem> reviewCakeItemMap = new HashMap<>();
        protected CakeItemRepository cakeItemRepository;

        public CakeItemStorage(CakeItemRepository cakeItemRepository) {
            this.cakeItemRepository = cakeItemRepository;
        }

        public void addReviewCakeItem(ReviewCakeItem reviewCakeItem) {
            cakeItemRepository.save(reviewCakeItem);
        }

        public Iterable<ReviewCakeItem> getCakeItem() {
            return cakeItemRepository.findAll();
        }

        public ReviewCakeItem getReviewCakeItemByID(Long id) {
            Optional<ReviewCakeItem> retrievedOptional = cakeItemRepository.findById(id);
            if (retrievedOptional.isPresent()) {
                ReviewCakeItem foundCakeItem = retrievedOptional.get();
                return foundCakeItem;
            }
            return null;

        }

        public ReviewCakeItem getReviewCakeItem(Long id){
            return cakeItemRepository.findById(id).get();
        }



    public void addComment(CakeType addedComment) {
    }
}
