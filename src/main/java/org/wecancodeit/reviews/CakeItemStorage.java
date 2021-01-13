package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

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
    }
