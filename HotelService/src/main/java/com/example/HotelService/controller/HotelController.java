package com.example.HotelService.controller;

import com.example.HotelService.model.Hotel;
import com.example.HotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;
    @PostMapping
    public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel){
        return new ResponseEntity<>(hotelService.saveHotel(hotel), HttpStatus.CREATED);
    }
    @GetMapping
    public List<Hotel> getAllHotel(){
        return hotelService.getAllHotel();
    }
    @GetMapping("{hotelId}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable("hotelId") String hotelId){
        return new ResponseEntity<>(hotelService.getHotelById(hotelId), HttpStatus.OK);
    }
    @PutMapping("{hotelId}")
    public ResponseEntity<Hotel> updateHotel(@PathVariable("hotelId") String hotelId, @RequestBody Hotel hotel){
        return new ResponseEntity<>(hotelService.updateHotel(hotelId, hotel), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteHotel(@PathVariable("hotelId") String hotelId){
        return new ResponseEntity<>("Hotel removed successfully!!!", HttpStatus.OK);
    }
}
