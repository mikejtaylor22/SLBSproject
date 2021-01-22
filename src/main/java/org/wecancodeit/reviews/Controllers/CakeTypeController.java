package org.wecancodeit.reviews.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.Storage.CakeStorage;

@Controller
public class CakeTypeController {
    CakeStorage cakeStorage;

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
//    model.addAttribute("CakeReview", cakeStorage.getCakeTypeByID(id).getItems());
        System.out.println(cakeStorage.getCakeTypeByID(id).getItems());
    return "single-cake-review";
    }
}


