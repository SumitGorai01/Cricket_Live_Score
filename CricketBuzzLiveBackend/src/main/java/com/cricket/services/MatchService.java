package com.cricket.services;

import java.util.List;

import com.cricket.entities.Match;

public interface MatchService {
	// get all the matches
	List<Match> getAllMatches();
	
	
	//get live match
	List<Match> getLiveMatchs();
	
	//get cwc point table
	List<List<String>> getPointTable();
	
	
}
