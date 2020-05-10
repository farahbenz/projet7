package com.P7.microserviceouvrages.dao;

import com.P7.microserviceouvrages.model.Ouvrage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OuvrageDao extends JpaRepository<Ouvrage, Long> {

    @Override
    List<Ouvrage> findAll();

}
