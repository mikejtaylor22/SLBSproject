package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class CakeStorage {
    // Map<Long, ReviewCakeItem> reviewCakeItemMap = new HashMap<>();
    private CakeTypeRepository cakeTypeRepository;

    public CakeStorage(CakeTypeRepository cakeTypeRepository) {
        this.cakeTypeRepository = cakeTypeRepository;
    }

    public void addReviewCakeItem(CakeType inCakeType) {
        cakeTypeRepository.save(inCakeType);
    }

    public Iterable<CakeType> getCakeType() {
        return cakeTypeRepository.findAll();
    }

    public CakeType getCakeTypeByID(Long id) {
        Optional<CakeType> retrievedTodoOwnerOptional = cakeTypeRepository.findById(id);
        if (retrievedTodoOwnerOptional.isPresent()) {
            CakeType foundCakeType = retrievedTodoOwnerOptional.get();
            return foundCakeType;
        }
        return null;


    }
}