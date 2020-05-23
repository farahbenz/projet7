package com.P7.microservicecompte.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CompteUtilisateur {
    @Id
    @GeneratedValue
    private Long id;
    private Long utilisateurId;
    private Long empruntId;

    public CompteUtilisateur() {
    }

    public CompteUtilisateur(Long utilisateurId, Long empruntId) {
        this.utilisateurId = utilisateurId;
        this.empruntId = empruntId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUtilisateurId() {
        return utilisateurId;
    }

    public void setUtilisateurId(Long utilisateurId) {
        this.utilisateurId = utilisateurId;
    }

    public Long getEmpruntId() {
        return empruntId;
    }

    public void setEmpruntId(Long empruntId) {
        this.empruntId = empruntId;
    }
}
