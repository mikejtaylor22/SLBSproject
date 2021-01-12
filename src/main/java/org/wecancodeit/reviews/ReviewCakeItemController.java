package org.wecancodeit.reviews;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ReviewCakeItemController {
    CakeStorage cakeStorage;

    public ReviewCakeItemController(CakeStorage inCakeStorage) {
        cakeStorage = inCakeStorage;
    }

    @RequestMapping("sample-cake-item/{id}")
    public String getCakeItem(Model model, @PathVariable long id) {
        model.addAttribute("ReviewCakeItem", cakeStorage.getCakeType());
        return "wedding-cake-template";

    }

    @RequestMapping("sample-cake-item2/{id}")
    public String getBirthdayCake(Model model, @PathVariable long id) {
        model.addAttribute("ReviewCakeItem", cakeStorage.getCakeTypeByID(id));
        return "birthday-cake-template";

    }
}


















