package com.foodKart.Services;

import com.foodKart.Entities.Rating;
import com.foodKart.Repository.RestaurantRatingRepository;

import java.util.List;

public class RatingService {
    public void addRating(String phoneNumber, String restaurantName, int rating){

        List<Rating> ratings = RestaurantRatingRepository.ratingMap.get(restaurantName);

        //Add the new rating
        //Calculate average
        //Update the average rating of restaurant in restaurant repository
    }
}
