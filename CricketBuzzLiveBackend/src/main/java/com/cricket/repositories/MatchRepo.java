package com.cricket.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricket.entities.Match;

public interface MatchRepo extends JpaRepository<Match,Integer>{

	// fetch the details of the match
	
	// give teamHeading 
	
	Optional<Match> findByTeamHeading(String teamHeading);
}
