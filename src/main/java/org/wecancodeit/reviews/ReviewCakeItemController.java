package org.wecancodeit.reviews;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ReviewCakeItemController {
    Map<Long, ReviewCakeItem> reviewCakeItemMap = new HashMap<>();
    public ReviewCakeItemController() {
        CakeType sampleCakeType = new CakeType("wedding cake", Collections.EMPTY_LIST, 1L);
        ReviewCakeItem sampleCakeItem = new ReviewCakeItem(sampleCakeType, "chocolate", "cream cheese", 20.00, "round", "good", 1L);
        reviewCakeItemMap.put(1L, sampleCakeItem);

    }

    @RequestMapping("sample-cake-item/{id}")
    public String getCakeItem(Model model, @PathVariable long id) {-
        model.addAttribute("ReviewCakeItem", reviewCakeItemMap.get(id));
        return "review-cake-item-template";

    }

















}
