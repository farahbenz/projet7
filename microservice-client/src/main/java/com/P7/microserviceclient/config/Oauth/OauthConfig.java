package com.P7.microserviceclient.config.Oauth;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableOAuth2Sso
@Configuration
public class OauthConfig extends WebSecurityConfigurerAdapter{


    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.antMatcher("/**")
                .authorizeRequests()
                .antMatchers("/js/**", "/css/**", "/img/**", "/scss/**", "/vendor/**").permitAll()
                .antMatchers("/acceuil").permitAll()
                .antMatchers("/", "/login**")
                .permitAll()
                .anyRequest()
                .authenticated();

    }
}
