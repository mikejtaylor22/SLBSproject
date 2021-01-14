package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CakeTypeController {
    CakeStorage cakeStorage;

    public CakeTypeController(CakeStorage inCakeStorage) {
        cakeStorage = inCakeStorage;
    }

    @RequestMapping("sample-cake-type/{id}")
    public String getCakeItem(Model model, @PathVariable long id) {

        model.addAttribute("CakeType", cakeStorage.getCakeTypeByID(id));
        //ask for


        return "categories-template";

    }
}
