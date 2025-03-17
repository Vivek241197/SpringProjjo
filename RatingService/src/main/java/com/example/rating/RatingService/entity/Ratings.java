package com.example.rating.RatingService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Rating")
@Entity
public class Ratings {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long ratingId;
	private String hotelId;
	private String userId;
	private int rating;
	private String feedback;
	
	

}
