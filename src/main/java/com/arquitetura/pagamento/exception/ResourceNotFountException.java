package com.arquitetura.pagamento.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFountException extends RuntimeException{

    private static final long serialVersionUID = 1L;
    
    public ResourceNotFountException(String exception){
        super(exception);
    }
}