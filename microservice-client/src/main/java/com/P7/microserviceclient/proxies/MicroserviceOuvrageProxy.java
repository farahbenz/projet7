package com.P7.microserviceclient.proxies;

import com.P7.microserviceclient.bean.OuvrageBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

// on crée une interface qui regroupe les requêtes que nous souhaitons passer au micro service
// c'est un proxy car elle se positionne comme une classe intermediaire qui fait le lien avec les Microservices
// exterieurs à appeler.

@FeignClient(name = "microservice-ouvrages", url = "localhost:9001")
public interface MicroserviceOuvrageProxy {

    @GetMapping(value = "/Ouvrages")
    List<OuvrageBean> listeDesOuvrages();

    @GetMapping( value = "/Ouvrages/{id}")
    OuvrageBean recupererUnProduit(@PathVariable("id") Long id);

}
