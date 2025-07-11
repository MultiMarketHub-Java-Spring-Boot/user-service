package com.example.userservice.Exception;


import com.example.userservice.utils.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorMessage> handleUserNotFoundException(UserNotFoundException u){
        ErrorMessage errorMessage = new ErrorMessage(u.getMessage() , false);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
    }

    @ExceptionHandler(UnableToUpdateUserException.class)
    public ResponseEntity<ErrorMessage> userUpdationException(UnableToUpdateUserException u) {
        ErrorMessage errorMessage = new ErrorMessage(u.getMessage(), false);
        return new ResponseEntity(errorMessage,HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
