package com.P7.microserviceouvrages.dao;

import com.P7.microserviceouvrages.model.Ouvrage;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class SpotDaoImpl implements OuvrageDaoCustom {

    @Autowired
    EntityManager em;

    @Override
    public List<Ouvrage> findOuvrageByNom(String nom) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Ouvrage> cq = cb.createQuery(Ouvrage.class);

        Root<Ouvrage> ouvrage = cq.from(Ouvrage.class);
        List<Predicate> predicates = new ArrayList<>();

        if (nom != null && !nom.isEmpty()) {
            predicates.add(cb.equal(ouvrage.get("nom"), nom));
        }

        cq.where(predicates.toArray(new Predicate[0]));

        return em.createQuery(cq).getResultList();
    }

}
