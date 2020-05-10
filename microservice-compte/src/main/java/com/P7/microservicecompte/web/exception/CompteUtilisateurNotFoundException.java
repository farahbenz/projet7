package com.P7.microservicecompte.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CompteUtilisateurNotFoundException extends RuntimeException {
    public CompteUtilisateurNotFoundException(String message) {
        super(message);
    }
}
