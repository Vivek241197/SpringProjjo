package com.example.rating.RatingService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rating.RatingService.RatingsService;
import com.example.rating.RatingService.entity.Ratings;

@RestController
@RequestMapping("/rating")
public class RatingController {
	
	@Autowired
	private RatingsService rs;

	
	@PostMapping
	public ResponseEntity<Ratings> saveRating(@RequestBody Ratings ra){
		return ResponseEntity.status(HttpStatus.OK).body(rs.saveRatings(ra));
	}
	
	@GetMapping("/re")
	public ResponseEntity<List<Ratings>> getAllRatings(){
		return ResponseEntity.status(HttpStatus.OK).body(rs.findAll());
	}
}
