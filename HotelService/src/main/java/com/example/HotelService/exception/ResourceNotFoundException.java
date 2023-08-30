package com.example.HotelService.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(){
        super("User not found on the server!!");
    }

    public ResourceNotFoundException(String message){
        super(message);
    }
}
