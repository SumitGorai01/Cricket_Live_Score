package com.cricket.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.entities.Match;
import com.cricket.services.MatchService;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class MatchController {
	
	private MatchService matchService;
	
	//get live match
	public MatchController(MatchService matchService) {
		super();
		this.matchService = matchService;
	}

	//get live matches
	@GetMapping("/live")
	public ResponseEntity<List<Match>> getLiveMatches() {
		System.out.println("Live Matches");
		return new ResponseEntity<List<Match>>(this.matchService.getLiveMatchs(),HttpStatus.OK);
	}
	
	//get all matches
	@GetMapping("/")
	public ResponseEntity<List<Match>> getAllMatches(){
		return new ResponseEntity<List<Match>>(this.matchService.getAllMatches(),HttpStatus.OK);
	}
	
	//get point table
	@GetMapping("/point-table")
	public ResponseEntity<?> getPointTable(){
		return new ResponseEntity<>(this.matchService.getPointTable(),HttpStatus.OK);
	}
	
	public String CricketBuzz() {
		return "Welcome to CricketBuzz";
	}
}
