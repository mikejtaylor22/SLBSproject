package org.wecancodeit.reviews.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.reviews.Models.CakeType;
import org.wecancodeit.reviews.Storage.CakeItemStorage;

@Controller
public class ReviewCakeItemController {
    CakeItemStorage cakeItemStorage;

    public ReviewCakeItemController(CakeItemStorage inCakeItemStorage) {
        cakeItemStorage = inCakeItemStorage;
    }

    @RequestMapping("/")
    public String reviewsLandingPage(Model model){

        return "homepage-template";
    }

    @RequestMapping("sample-cake-item/{id}")
    public String getCakeItem(Model model, @PathVariable Long id) {
        model.addAttribute("ReviewCakeItem", cakeItemStorage.getReviewCakeItemByID(id));
        return "all-reviews-template";
    }

    @RequestMapping("/all-reviews")
    public String getAllCakeReviews(Model model) {
        model.addAttribute("reviews", cakeItemStorage.getCakeItem());
        return "all-reviews-template";
    }

    @PostMapping("Comment")
        public String addComment(@RequestParam String newComment) {
            CakeType addedComment = new CakeType(newComment);
            cakeItemStorage.addComment(addedComment);
            return "redirect:/";
        }
    }













