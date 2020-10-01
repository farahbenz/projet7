package com.P7.microserviceouvrages.dao;

import com.P7.microserviceouvrages.model.Ouvrage;

import java.util.List;

public interface OuvrageDaoCustom {
    List<Ouvrage> findOuvrageByNom(String nom);
}

