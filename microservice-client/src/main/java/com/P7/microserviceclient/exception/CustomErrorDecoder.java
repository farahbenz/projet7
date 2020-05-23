package com.P7.microserviceclient.exception;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder {

    private final ErrorDecoder defaultEErrorDecoder = new Default();
    @Override
    public Exception decode(String methodKey, Response response) {
        if(response.status() == 404) {
            return new OuvrageNotFoundException("Ouvrage non trouvé");
        }
        return defaultEErrorDecoder.decode(methodKey, response);
    }

}
