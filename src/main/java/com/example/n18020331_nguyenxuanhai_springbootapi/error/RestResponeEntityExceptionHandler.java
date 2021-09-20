package com.example.n18020331_nguyenxuanhai_springbootapi.error;

import com.example.n18020331_nguyenxuanhai_springbootapi.entity.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class RestResponeEntityExceptionHandler extends ResponseEntityExceptionHandler {
    ResponseEntity<ErrorMessage> departmentNotFoundException(StudentNotFoundException exception, WebRequest request){
        ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
    }
}
