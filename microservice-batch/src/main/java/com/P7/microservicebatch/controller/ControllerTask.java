package com.P7.microservicebatch.controller;

import com.P7.microservicebatch.bean.EmpruntBean;
import com.P7.microservicebatch.bean.UserBean;
import com.P7.microservicebatch.proxies.MicroserviceEmpruntProxy;
import com.P7.microservicebatch.proxies.MicroserviceUserProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
@RestController
@EnableScheduling
public class ControllerTask {

    @Autowired
    MicroserviceUserProxy microserviceUserProxy;

    @Autowired
    MicroserviceEmpruntProxy microserviceEmpruntProxy;

    @Scheduled(cron = "* * * * * *")
    public void planifier(List<EmpruntBean> emprunts){

        Date aujourdhui = new Date();
        for (EmpruntBean empruntBean : emprunts) {
            long diff = aujourdhui.getTime() - empruntBean.getDateEmprunt().getTime();
            float res = (diff / (1000 * 60 * 60 * 24));
            System.out.println(res);

            if (res >= 20.0) {
                Long id = empruntBean.getId();
                UserBean userBean = microserviceUserProxy.UserFindById(id);
                String email = userBean.getEmail();
                SimpleMailMessage message = new SimpleMailMessage();
                message.setFrom("noreply@baeldung.com");
                message.setTo(email);
                message.setSubject("test");
                message.setText("Hello");

            }
        }
    }
}
