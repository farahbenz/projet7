package com.P7.microservicecompte.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CompteUtilisateur {
    @Id
    @GeneratedValue
    private Long id;
    private String nomUtilisateur;
    private String password;
    private Long empruntId;

    public CompteUtilisateur() {
    }

    public CompteUtilisateur(String nomUtilisateur, String password, Long empruntId) {
        this.nomUtilisateur = nomUtilisateur;
        this.password = password;
        this.empruntId = empruntId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getEmpruntId() {
        return empruntId;
    }

    public void setEmpruntId(Long empruntId) {
        this.empruntId = empruntId;
    }
}
