package com.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ashik
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.POST)
    protected String requestMapping(
            Model model,
            @RequestParam(value = "username", defaultValue = "") String username,
            @RequestParam(value = "password", defaultValue = "") String password) {

        try {

            boolean isUserEmpty = "".equals(username);
            boolean isPasswordEmpty = "".equals(password);
            if (isPasswordEmpty && isUserEmpty) {

                model.addAttribute("errorMessage", "Username and Password is empty!");
                return "index";
            } else if (isPasswordEmpty) {

                model.addAttribute("errorMessage", "Password is empty!");
                return "index";
            } else if (isUserEmpty) {

                model.addAttribute("errorMessage", "Username is empty!");
                return "index";
            } else {

                model.addAttribute("message0", "Wecome to Home Page!");
                model.addAttribute("message1", "Your username is " + username);
                model.addAttribute("message2", "Your password is " + password);
            }
        } catch (Exception e) {

            model.addAttribute("errorMessage", e.toString());
        }

        return "home";
    }
}
