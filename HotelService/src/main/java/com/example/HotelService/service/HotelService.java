package com.example.HotelService.service;

import com.example.HotelService.model.Hotel;

import java.util.List;

public interface HotelService {
    Hotel saveHotel(Hotel hotel);
    List<Hotel> getAllHotel();
    Hotel getHotelById(String hotelId);
    Hotel updateHotel(String hotelId, Hotel hotel);
    void deleteHotel(String hotelId);
}
