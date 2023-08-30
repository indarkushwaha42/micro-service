package com.example.HotelService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "hotels")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Hotel {
    @Id
    private String hotelId;
    private String name;
    private String location;
    private String about;
}
