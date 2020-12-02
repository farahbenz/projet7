package com.P7.microservicebatch.proxies;

import com.P7.microservicebatch.bean.EmpruntBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

@FeignClient(name = "microservice-emprunt", url = "localhost:8087")
public interface MicroserviceEmpruntProxy {

    @GetMapping(value = "/ListEmpruntsUserId/{userId}")
    List<EmpruntBean> listeDesEmprunts(@PathVariable Long userId);

    @GetMapping(value = "/emprunt/{id}")
    EmpruntBean recupererUnEmprunt(@PathVariable Long id);

}
