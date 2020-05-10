package com.p7.microserviceemprunt.web.exception;

/*
Si on en arrive à cette exception, c'est qu'il y a eu une erreur interne
Si la requête était mal formée, elle aurait déclenché 400 Bad Request automatiquement
ici le code renvoyé est 500
**/

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class ImpossibleAjouterEmpruntException extends RuntimeException {

    public ImpossibleAjouterEmpruntException(String message) {
        super(message);
    }
}
