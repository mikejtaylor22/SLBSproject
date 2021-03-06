package org.wecancodeit.reviews.Storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.Models.CakeType;
import org.wecancodeit.reviews.CakeTypeRepository;

import java.util.Optional;

@Service
public class CakeStorage {
    // Map<Long, ReviewCakeItem> reviewCakeItemMap = new HashMap<>();
    private CakeTypeRepository cakeTypeRepository;

    public CakeStorage(CakeTypeRepository cakeTypeRepository) {
        this.cakeTypeRepository = cakeTypeRepository;
    }

    public void addCakeType(CakeType inCakeType) {
        cakeTypeRepository.save(inCakeType);
    }

    public Iterable<CakeType> getCakeType() {
        return cakeTypeRepository.findAll();
    }

    public CakeType getCakeTypeByID(Long id) {
//        return cakeTypeRepository.findById(id).get();
        Optional<CakeType> retrievedCakeTypeOptional = cakeTypeRepository.findById(id);
        if (retrievedCakeTypeOptional.isPresent()) {
            CakeType foundCakeType = retrievedCakeTypeOptional.get();
            return foundCakeType;
        }
        return null;


    }

    public CakeType getCake(Long id){
        return cakeTypeRepository.findById(id).get();
    }
}