package com.knoldus.ExceptionTask1;

public class CustomException extends Exception {
    public CustomException(String message) {
        // calling the constructor of parent Exception
        super(message);
    }
}
