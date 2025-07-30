package com.uefa.uefa_kings_league.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uefa.uefa_kings_league.model.Team;
import com.uefa.uefa_kings_league.repository.TeamRepositoryInterface;

@Service
public class TeamService {

    @Autowired
    private TeamRepositoryInterface teamRepository;

    public Team createTeam(Team team) {
        return teamRepository.save(team);
    }

}
