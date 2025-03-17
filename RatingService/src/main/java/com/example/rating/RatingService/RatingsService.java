package com.example.rating.RatingService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rating.RatingService.Repository.RatingRepo;
import com.example.rating.RatingService.entity.Ratings;

@Service
public class RatingsService {
	
	@Autowired
	private RatingRepo rro;

	
	public Ratings saveRatings(Ratings ra) {
		return rro.save(ra);
	}
	
	public List<Ratings> findAll() {
		return rro.findAll();
	}
	
}
