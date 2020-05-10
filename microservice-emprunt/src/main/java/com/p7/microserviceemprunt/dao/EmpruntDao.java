package com.p7.microserviceemprunt.dao;

import com.p7.microserviceemprunt.model.Emprunt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpruntDao extends JpaRepository<Emprunt, Long> {
}
