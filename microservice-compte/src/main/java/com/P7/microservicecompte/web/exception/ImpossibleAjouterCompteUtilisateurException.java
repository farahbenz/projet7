package com.P7.microservicecompte.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class ImpossibleAjouterCompteUtilisateurException extends RuntimeException  {

        public ImpossibleAjouterCompteUtilisateurException(String message) {
            super(message);
        }

}
