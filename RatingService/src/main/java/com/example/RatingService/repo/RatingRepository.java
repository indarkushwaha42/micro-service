package com.example.RatingService.repo;

import com.example.RatingService.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating, String> {
}
