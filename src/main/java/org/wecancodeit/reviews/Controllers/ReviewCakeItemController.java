package org.wecancodeit.reviews.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.reviews.Models.CakeType;
import org.wecancodeit.reviews.Models.Comment;
import org.wecancodeit.reviews.Models.Hashtag;
import org.wecancodeit.reviews.Storage.CakeItemStorage;
import org.wecancodeit.reviews.Storage.CakeStorage;
import org.wecancodeit.reviews.Storage.CommentRepository;
import org.wecancodeit.reviews.Storage.HashtagStorage;

@Controller
public class ReviewCakeItemController {

    @Autowired
    CommentRepository commentRepository;

    @Autowired
    CakeStorage cakeStorage;

    @Autowired
    HashtagStorage hashtagStorage;

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

    @PostMapping("Comment/{id}")
        public String addComment(@RequestParam String newComment,@PathVariable Long id) {
            Comment addedComment = new Comment(newComment,cakeItemStorage.getReviewCakeItemByID(id));
            commentRepository.save(addedComment);
            return "redirect:/single-cake-review/{id}";
        }

        @PostMapping("addHashtag/{id}")
        public String addHashtag(@RequestParam String newHashtag,@PathVariable Long id){
            Hashtag addedHashtag = new Hashtag(newHashtag,cakeItemStorage.getReviewCakeItemByID(id));
            hashtagStorage.addHashtag(addedHashtag);

            return "redirect:/single-cake-review/{id}";
        }
    }













