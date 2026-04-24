package com.diya.productapi;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(String message){
      super(message);
    }
}
