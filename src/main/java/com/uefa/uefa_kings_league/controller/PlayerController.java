package com.uefa.uefa_kings_league.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uefa.uefa_kings_league.form.PlayerForm;
import com.uefa.uefa_kings_league.model.Player;
import com.uefa.uefa_kings_league.service.PlayerService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    private PlayerService service;

    public PlayerService getService() {
        return service;
    }

    public void setService(PlayerService service) {
        this.service = service;
    }

    @GetMapping("/player-form")
    public String displayPlayerForm(@ModelAttribute PlayerForm player) {
        return "player-form";
    }

    @PostMapping("/create")
    public String createPlayer(@Valid @ModelAttribute PlayerForm playerForm, BindingResult results) {
        if (results.hasErrors()) {
            return "team-form";
        }
        Player player = new Player();
        player.setFirstName(playerForm.getFirstName());
        player.setLastName(playerForm.getLastName());
        player.setNationality(playerForm.getNationality());
        player.setBirthday(playerForm.getBirthday());
        player.setPosition(playerForm.getPosition());
        player.setShirtNumber(playerForm.getShirtNumber());
        service.createPlayer(player);
        return "player-created";
    }

}
