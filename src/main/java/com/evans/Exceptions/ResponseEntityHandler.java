package com.evans.Exceptions;

import com.evans.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
@ResponseStatus
public class ResponseEntityHandler extends ResponseEntityExceptionHandler {

@ExceptionHandler(InvalidCredentialsException.class)
    public ResponseEntity<ErrorMessage> invalid(InvalidCredentialsException exception,
                                                WebRequest request){
    ErrorMessage message=new ErrorMessage(HttpStatus.UNAUTHORIZED,exception.getMessage());
    return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
            .body(message);
}
}
