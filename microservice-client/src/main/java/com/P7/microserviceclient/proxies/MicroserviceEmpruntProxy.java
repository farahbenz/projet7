package com.P7.microserviceclient.proxies;

import com.P7.microserviceclient.bean.EmpruntBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;


@FeignClient(name = "microservice-emprunt", url = "localhost:8087")
public interface MicroserviceEmpruntProxy {


    @PostMapping(value = "/save")
    void saveEmprunt(@RequestBody EmpruntBean emprunt);

}
