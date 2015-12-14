package com.tutorial.controller;

import java.util.Map;
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

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    protected String requrstMapping2(Model model) {

        try {

            model.addAttribute("message", "Wecome to Spring Framework!!!!!");
        } catch (Exception e) {

            model.addAttribute("errorMessage", e.toString());
        }

        return "index";
    }
    
    
//    @RequestMapping(value = "/{index0}/{index1}/{index2}", method = RequestMethod.GET)
//    protected String requrstMapping(Model model,
//            @PathVariable Map<String,String> url) {
//
//        try {
//            
//            String username0 = url.get("index0");
//            String username1 = url.get("index1");
//            String username2 = url.get("index2");
//
//            model.addAttribute("message0", "Hello Mr. " + username0 + ", Wecome to Spring Framework!!!!!");
//            model.addAttribute("message1", "Hello Mr. " + username1 + ", Wecome to Spring Framework!!!!!");
//            model.addAttribute("message2", "Hello Mr. " + username2 + ", Wecome to Spring Framework!!!!!");
//        } catch (Exception e) {
//
//            model.addAttribute("errorMessage", e.toString());
//        }
//
//        return "index";
//    }
}
