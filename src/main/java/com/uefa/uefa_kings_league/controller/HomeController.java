package com.uefa.uefa_kings_league.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/uefa")
public class HomeController {

    @GetMapping("/home")
    public String displayHome(Model model) {
        return "uefa-home";
    }

}
