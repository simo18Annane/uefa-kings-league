package com.uefa.uefa_kings_league.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uefa.uefa_kings_league.form.TeamForm;
import com.uefa.uefa_kings_league.service.ServiceInterface;

@Controller
@RequestMapping("/team")
public class TeamController {

    @Autowired
    private ServiceInterface service;

    public ServiceInterface getService() {
        return service;
    }

    public void setService(ServiceInterface service) {
        this.service = service;
    }

    @GetMapping("/home")
    public String displayHome(Model model) {
        return "uefa-home";
    }

    @GetMapping("/team-form")
    public String displayTeamForm(@ModelAttribute TeamForm team) {
        return "team-form";
    }

}
