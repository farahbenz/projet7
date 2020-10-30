package com.P7.microserviceclient.proxies;
import com.P7.microserviceclient.bean.UserBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="microservice-user", url = "localhost:8085")
public interface MicroserviceUserProxy {

    @GetMapping( value = "/Name/{name}")
    UserBean recupererUnUtilisateur(@PathVariable("name") String name);

    @GetMapping(value = "User/{id}")
    UserBean UserFindById(@PathVariable("id") Long id);

}
