package com.rkb.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rkb.models.Rating;
import com.rkb.models.UserRating;

@RestController
@RequestMapping("/ratings")
public class RatingResource {
	
	@GetMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 4);
	}
	
	@GetMapping("/users/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String userId) {
//		List<Rating> ratings = Arrays.asList( 
//				new Rating("1234",4),
//				new Rating("5678",3)
//				);
//		
//		UserRating userRating = new UserRating();
//		userRating.setUserRatings(ratings);
//		return userRating;
		
		UserRating userRating = new UserRating();
        userRating.initData(userId);
        return userRating;
		
	}
	

}
