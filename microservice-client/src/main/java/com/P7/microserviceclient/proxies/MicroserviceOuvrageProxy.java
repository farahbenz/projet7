package com.P7.microserviceclient.proxies;

import com.P7.microserviceclient.bean.EmpruntBean;
import com.P7.microserviceclient.bean.OuvrageBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "microservice-ouvrages", url = "localhost:8083")
public interface MicroserviceOuvrageProxy {

    @GetMapping(value = "/Ouvrages")
    List<OuvrageBean> listeDesOuvrages();

    @GetMapping( value = "/Ouvrages/{id}")
    OuvrageBean recupererUnOuvrage(@PathVariable("id") Long id);

    @GetMapping(value = "/rechercher/{nom}")
    List<OuvrageBean> getOuvrageByNom(@PathVariable("nom") String nom);

    @PostMapping(value = "/save")
    void saveOuvrage(@RequestBody OuvrageBean ouvrage);


}
