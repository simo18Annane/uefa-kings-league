package com.uefa.uefa_kings_league.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uefa.uefa_kings_league.form.TeamForm;
import com.uefa.uefa_kings_league.model.Team;
import com.uefa.uefa_kings_league.service.ServiceInterface;

import jakarta.validation.Valid;

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

    @PostMapping("/create")
    public String createTeam(@Valid @ModelAttribute TeamForm teamForm, BindingResult results) {
        if (results.hasErrors()) {
            return "team-form";
        }
        Team team = new Team();
        team.setName(teamForm.getTeamName());
        team.setCity(teamForm.getTeamCity());
        team.setCountry(teamForm.getTeamCountry());
        team.setFoundation(teamForm.getTeamFoundation());
        team.setStadium(teamForm.getTeamStadium());
        team.setTitle(teamForm.getTeamTitle());
        service.createTeam(team);
        return "team-created";
    }

}
