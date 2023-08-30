package com.example.RatingService.controller;

import com.example.RatingService.model.Rating;
import com.example.RatingService.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;
    @PostMapping
    public ResponseEntity<Rating> saveRating(@RequestBody Rating rating){
        return new ResponseEntity<>(ratingService.saveRating(rating), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Rating> getAllRatings(){
        return ratingService.getAllRatings();
    }
}
