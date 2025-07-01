package com.example.userservice.Exception;

public class NotFoundException extends  RuntimeException{

    public NotFoundException(String message){
        super(message);
    }
}
