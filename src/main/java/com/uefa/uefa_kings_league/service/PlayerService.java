package com.uefa.uefa_kings_league.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uefa.uefa_kings_league.model.Player;
import com.uefa.uefa_kings_league.repository.PlayerRepositoryInterface;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepositoryInterface playerRepository;

    public Player createPlayer(Player player) {
        return playerRepository.save(player);
    }
    
}
