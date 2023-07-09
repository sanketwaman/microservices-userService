package com.userservice;

import com.userservice.entities.Rating;
import com.userservice.external.services.RatingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceApplicationTests {

	@Autowired
	RatingService ratingService;


	@Test
	void contextLoads() {
	}

//	@Test
//	void createRating(){
//		Rating rating=Rating.builder().rating(10).userId("").hotelId("").feedback("This is create using feign client").build();
//		Rating saveRating = ratingService.createRating(rating);
//
//		System.out.println("new rating created ");
//	}

}
