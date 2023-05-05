package com.p2plending.borrower.handler;

public class BorrowerNotFoundException extends RuntimeException{

    public BorrowerNotFoundException(String message){
        super(message);
    }

    public BorrowerNotFoundException(String message, Throwable cause){
        super(message, cause);
    }
}
