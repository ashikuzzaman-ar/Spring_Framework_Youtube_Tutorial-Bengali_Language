package com.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ashik
 */
@Controller
public class IndexController {
    
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    protected String requrstMapping(Model model) {

        try {

            model.addAttribute("message", "Wecome to Spring Framework!!!!!");
        } catch (Exception e) {

            model.addAttribute("errorMessage", e.toString());
        }

        return "index";
    }
}
