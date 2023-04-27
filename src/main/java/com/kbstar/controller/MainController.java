package com.kbstar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String main() {
        return "index";
    }

    @RequestMapping("/singlepost")
    public String singlepost(Model model) {
        model.addAttribute("center", "singlepost");
        return "index";
    }

    @RequestMapping("/category")
    public String category(Model model) {
        model.addAttribute("center", "category");
        return "index";
    }


    @RequestMapping("/about")
    public String about(Model model) {
        model.addAttribute("center", "about");
        return "index";
    }
    @RequestMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("center", "contact");
        return "index";
    }
}

