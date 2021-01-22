package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ReviewCakeItemController {
    CakeItemStorage cakeItemStorage;

    public ReviewCakeItemController(CakeItemStorage inCakeItemStorage) {
        cakeItemStorage = inCakeItemStorage;
    }

    @RequestMapping("sample-cake-item/{id}")
    public String getCakeItem(Model model, @PathVariable long id) {

        model.addAttribute("ReviewCakeItem", cakeItemStorage.getReviewCakeItemByID(id));
        //ask for


        return "reviews-template";

    }



    }







