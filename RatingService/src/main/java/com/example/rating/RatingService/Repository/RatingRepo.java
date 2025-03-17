package com.example.rating.RatingService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;

import com.example.rating.RatingService.entity.Ratings;

@Repository
public interface RatingRepo extends JpaRepository<Ratings,Long>{
	

}
