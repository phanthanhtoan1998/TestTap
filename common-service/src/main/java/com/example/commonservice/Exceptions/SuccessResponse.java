package com.example.commonservice.Exceptions;

public class SuccessResponse extends RuntimeException{

        public SuccessResponse(String message) {
            super(message);
        }

}