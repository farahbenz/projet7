package com.P7.microserviceouvrages.model;

import javax.persistence.*;

@Entity
public class Ouvrage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private int nbExemplaire;

    public Ouvrage() {
    }

    public Ouvrage(String nom, int nbExemplaire) {
        this.nom = nom;
        this.nbExemplaire = nbExemplaire;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbExemplaire() {
        return nbExemplaire;
    }

    public void setNbExemplaire(int nbExemplaire) {
        this.nbExemplaire = nbExemplaire;
    }
}
