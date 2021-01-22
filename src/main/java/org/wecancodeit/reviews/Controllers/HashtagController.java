package org.wecancodeit.reviews.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.Storage.HashtagStorage;

@Controller
public class HashtagController {

    HashtagStorage hashtagStorage;

    public HashtagController(HashtagStorage inHashtagStorage) {
        hashtagStorage = inHashtagStorage;
    }

    @RequestMapping("sample-cake-hashtag/{id}")
    public String getHashtag(Model model, @PathVariable long id) {

        model.addAttribute("Hashtag", hashtagStorage.getHashtagByID(id));
        //ask for
        return "hashtags-template";

    }

    @RequestMapping("/allhashtags")
    public String getAllHashtags(Model model){
        model.addAttribute("allHashtags",hashtagStorage.getHashtag());
        return "allhashtags-template";
    }
}
