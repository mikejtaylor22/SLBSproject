package org.wecancodeit.reviews;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.Models.ReviewCakeItem;

public interface CakeItemRepository extends CrudRepository<ReviewCakeItem, Long> {
}
