package com.P7.microserviceclient.proxies;

import com.P7.microserviceclient.bean.OuvrageBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "microservice-ouvrages", url = "localhost:8083")
public interface MicroserviceOuvrageProxy {

    @GetMapping(value = "/Ouvrages")
    List<OuvrageBean> listeDesOuvrages();

    @GetMapping( value = "/Ouvrages/{id}")
    OuvrageBean recupererUnProduit(@PathVariable("id") Long id);

    @GetMapping(value = "/rechercher/{nom}")
    List<OuvrageBean> getOuvrageByNom(@PathVariable("nom") String nom);


}
