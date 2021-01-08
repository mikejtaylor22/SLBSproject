package org.wecancodeit.reviews;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ReviewCakeItemController {
    Map<String, ReviewCakeItem> reviewCakeItemMap = new HashMap<>();
    public ReviewCakeItemController() {
        CakeType sampleCakeType = new CakeType("wedding cake", Collections.EMPTY_LIST, 1L);
        ReviewCakeItem sampleCakeItem = new ReviewCakeItem(sampleCakeType, "chocolate", "cream cheese", 20.00, "round", "good");
        reviewCakeItemMap.put("wedding cake", sampleCakeItem);

    }

    @RequestMapping("sample-cake-item")
    public String getCakeItem(Model model){
        CakeType sampleCakeType = new CakeType("wedding cake", Collections.EMPTY_LIST, 1L);
        ReviewCakeItem sampleCakeItem = new ReviewCakeItem(sampleCakeType, "chocolate", "cream cheese", 20.00, "round", "good");
        model.addAttribute("ReviewCakeItem", sampleCakeItem);
        return "review-cake-item-template";







            }





}
