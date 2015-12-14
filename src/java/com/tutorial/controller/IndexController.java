package com.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ashik
 */
@Controller
public class IndexController {
    
    @RequestMapping(value = "/{index}/{inedex2}", method = RequestMethod.GET)
    protected String requrstMapping(Model model,
            @PathVariable(value = "index")String username) {

        try {

            model.addAttribute("message", "Hello Mr. "+username+", Wecome to Spring Framework!!!!!");
        } catch (Exception e) {

            model.addAttribute("errorMessage", e.toString());
        }

        return "index";
    }
    
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    protected String requrstMapping2(Model model) {

        try {

            model.addAttribute("message", "Wecome to Spring Framework!!!!!");
        } catch (Exception e) {

            model.addAttribute("errorMessage", e.toString());
        }

        return "index";
    }
}
