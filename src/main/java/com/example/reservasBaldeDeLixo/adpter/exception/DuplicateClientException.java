package com.example.reservasBaldeDeLixo.adpter.exception;

public class DuplicateClientException extends RuntimeException{

    public DuplicateClientException(String message){ //Criado excessão de duplicata
        super(message);
    }
}
