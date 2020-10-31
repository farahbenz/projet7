package com.p7.microserviceemprunt.dao;

import com.p7.microserviceemprunt.model.Emprunt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpruntDao extends JpaRepository<Emprunt, Long> {

    List<Emprunt> findByUserId(Long userId);
}
