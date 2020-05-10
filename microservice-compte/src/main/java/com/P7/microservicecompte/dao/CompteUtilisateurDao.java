package com.P7.microservicecompte.dao;

import com.P7.microservicecompte.model.CompteUtilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteUtilisateurDao extends JpaRepository<CompteUtilisateur, Long> {
}
