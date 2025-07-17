package com.ratingservice.rs.Services;

import java.util.List;


import com.ratingservice.rs.Entities.Rating;

public interface RatingService {
    
    Rating createRating(Rating rating);

    List<Rating> getAllRating();

    List<Rating> getRatingByUserId(String userId);

    List<Rating> getRatingByHotelId(String hotelId);
}
