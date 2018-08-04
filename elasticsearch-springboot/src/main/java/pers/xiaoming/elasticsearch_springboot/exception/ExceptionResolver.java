package pers.xiaoming.elasticsearch_springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class ExceptionResolver {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleResourceNotFoundException(Exception ex) {
        return new ResponseEntity<>("blog not found", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public String handleOtherException(Exception ex) {
        return ex.getMessage();
    }
}