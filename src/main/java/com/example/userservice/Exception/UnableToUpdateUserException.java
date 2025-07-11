package com.example.userservice.Exception;

public class UnableToUpdateUserException extends  RuntimeException {

    public UnableToUpdateUserException(String  message){
        super(message);
    }

}
