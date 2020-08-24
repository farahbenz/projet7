package com.P7.emailbatch.config;

import com.P7.emailbatch.model.User;
import com.sun.mail.imap.protocol.UIDSet;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.hibernate.sql.Template;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.database.HibernateCursorItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class ApplicationConfig {
    @Autowired
    private JobBuilderFactory jobBuilderFactory;
    @Autowired
    private StepBuilderFactory stepBuilderFactory;


    @Bean
   public HibernateCursorItemReader<User> reader(){
        HibernateCursorItemReader<User> reader = new HibernateCursorItemReader<>();
        reader.setQueryName("{}");
        reader.setQueryProvider();
        return reader;
    }


}
