package org.wecancodeit.reviews.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.Storage.CakeItemStorage;
import org.wecancodeit.reviews.Storage.CakeStorage;
import org.wecancodeit.reviews.Storage.CommentRepository;
import org.wecancodeit.reviews.Storage.HashtagStorage;

@Controller
public class CakeTypeController {
    @Autowired
    CommentRepository commentRepository;

    @Autowired
    HashtagStorage hashtagStorage;

    CakeStorage cakeStorage;

    @Autowired
    private CakeItemStorage cakeItemStorage;

    public CakeTypeController(CakeStorage inCakeStorage) {
        cakeStorage = inCakeStorage;
    }

    @RequestMapping("sample-cake-type/{id}")
    public String getCakeItem(Model model, @PathVariable long id) {
        model.addAttribute("CakeType", cakeStorage.getCakeTypeByID(id));
        return "categories-template";
    }

    @RequestMapping("single-cake-review/{id}")
    public String getSingleReview(Model model, @PathVariable long id) {
        model.addAttribute("comments",cakeItemStorage.getReviewCakeItem(id).getComments());
        model.addAttribute("CakeReview", cakeItemStorage.getReviewCakeItemByID(id));
        model.addAttribute("hashtags",cakeItemStorage.getReviewCakeItemByID(id).getHashtags());
    return "single-cake-review-template";
    }
}


