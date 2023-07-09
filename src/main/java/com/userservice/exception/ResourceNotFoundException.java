package com.userservice.exception;

public class ResourceNotFoundException extends RuntimeException{

    //extra properties that you want to manage

    public ResourceNotFoundException(){

        super("Resourse not found on server !!");
    }

    public ResourceNotFoundException(String msg){

        super(msg);

    }
}
