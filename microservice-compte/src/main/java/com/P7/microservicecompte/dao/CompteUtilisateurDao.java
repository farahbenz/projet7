package com.P7.microservicecompte.dao;

import com.P7.microservicecompte.model.CompteUtilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteUtilisateurDao extends JpaRepository<CompteUtilisateur, Long> {
}
