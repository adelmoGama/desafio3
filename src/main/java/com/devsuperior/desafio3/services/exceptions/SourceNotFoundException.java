package com.devsuperior.desafio3.services.exceptions;

public class SourceNotFoundException extends RuntimeException{
    public SourceNotFoundException(String msg) {
        super(msg);
    }
}
