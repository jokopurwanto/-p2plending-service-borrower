package com.p2plending.borrower.handler;

import com.p2plending.borrower.dto.BorrowerExceptionDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BorrowerExceptionHandler {

    @ExceptionHandler(value = {BorrowerNotFoundException.class})
    public ResponseEntity<Object> handleBorrowerNotFoundException (BorrowerNotFoundException borrowerNotFoundException){
        BorrowerExceptionDto borrowerExceptionDto = new BorrowerExceptionDto(
                HttpStatus.NOT_FOUND.value(),
                borrowerNotFoundException.getMessage(),
                borrowerNotFoundException.getCause()

        );
        return new ResponseEntity<>(borrowerExceptionDto, HttpStatus.NOT_FOUND);
    }
}
