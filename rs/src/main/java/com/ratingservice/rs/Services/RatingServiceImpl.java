package com.ratingservice.rs.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ratingservice.rs.Entities.Rating;
import com.ratingservice.rs.Repositories.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService{
    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public Rating createRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getAllRating() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return ratingRepository.getRatingByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        return ratingRepository.getRatingByHotelId(hotelId);
    }
    
}
