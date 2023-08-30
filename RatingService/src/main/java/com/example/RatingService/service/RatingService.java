package com.example.RatingService.service;

import com.example.RatingService.model.Rating;

import java.util.List;

public interface RatingService {
    Rating saveRating(Rating rating);
    List<Rating> getAllRatings();

}
