package com.userservice.external.services;

import com.userservice.entities.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@FeignClient(name = "RATING-SERVICE")
public interface RatingService {
    //get
    @GetMapping("/ratings")
    Rating getRating();


    //post
    @PostMapping("/ratings")
     Rating createRating(Rating values);

     //put
    @PutMapping("ratings/{ratingId}")
    Rating updateRating(@PathVariable("ratingId") String ratingId, Rating values);

    @DeleteMapping("ratings/{ratingId}")
    public void deleteRating(@PathVariable("ratingId") String ratingId);

}
