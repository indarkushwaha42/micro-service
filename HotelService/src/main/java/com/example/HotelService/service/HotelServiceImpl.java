package com.example.HotelService.service;

import com.example.HotelService.exception.ResourceNotFoundException;
import com.example.HotelService.model.Hotel;
import com.example.HotelService.repo.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public Hotel saveHotel(Hotel hotel) {
        String randomHotelId = UUID.randomUUID().toString();
        hotel.setHotelId(randomHotelId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotel() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotelById(String hotelId) {
        return hotelRepository.findById(hotelId).orElseThrow(()->new ResourceNotFoundException("Hotel not found with given hotel Id"+hotelId));
    }

    @Override
    public Hotel updateHotel(String hotelId, Hotel hotel) {
        Hotel existingHotel = hotelRepository.findById(hotelId).orElseThrow(()-> new ResourceNotFoundException("Hotel not found with given hotel id"+hotelId));
        existingHotel.setName(hotel.getName());
        existingHotel.setLocation(hotel.getLocation());
        existingHotel.setAbout(hotel.getAbout());
        hotelRepository.save(existingHotel);
        return existingHotel;
    }

    @Override
    public void deleteHotel(String hotelId) {

        hotelRepository.findById(hotelId).orElseThrow(()->new ResourceNotFoundException("Hotel not found with given hotel id"+hotelId));
        hotelRepository.deleteById(hotelId);

    }
}
