package com.uefa.uefa_kings_league.repository;

import org.springframework.data.repository.CrudRepository;
import com.uefa.uefa_kings_league.model.Team;

public interface TeamRepositoryInterface extends CrudRepository<Team, Long> {

}
