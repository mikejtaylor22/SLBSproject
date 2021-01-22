package org.wecancodeit.reviews;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.Models.CakeType;

public interface CakeTypeRepository extends CrudRepository<CakeType, Long> {
}
