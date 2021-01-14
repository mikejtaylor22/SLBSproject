package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class HashtagStorage {



    private HashtagRepository hashtagRepository;

    public HashtagStorage(HashtagRepository hashtagRepository) {
        this.hashtagRepository = hashtagRepository;
    }

    public void addHashtag(Hashtag inHashtag) {
        hashtagRepository.save(inHashtag);
    }

    public Iterable<Hashtag> getHashtag() {
        return hashtagRepository.findAll();
    }

    public Hashtag getHashtagByID(Long id) {
        Optional<Hashtag> retrievedHashtagOptional = hashtagRepository.findById(id);
        if (retrievedHashtagOptional.isPresent()) {
            Hashtag foundHashtag = retrievedHashtagOptional.get();
            return foundHashtag;
        }
        return null;


    }
}
