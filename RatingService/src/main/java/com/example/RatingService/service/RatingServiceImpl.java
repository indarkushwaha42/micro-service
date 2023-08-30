package com.example.RatingService.service;

import com.example.RatingService.model.Rating;
import com.example.RatingService.repo.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService{

    @Autowired
    private RatingRepository ratingRepository;
    @Override
    public Rating saveRating(Rating rating) {
        String randomRatingId = UUID.randomUUID().toString();
        rating.setRatingId(randomRatingId);
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }
}
