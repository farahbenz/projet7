package com.P7.microserviceclient.bean;

public class OuvrageBean {

    private Long id;
    private String nom;
    private int nbExemplaire;

    public OuvrageBean() {
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

    @Override
    public String toString() {
        return "OuvrageBean{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbExemplaire=" + nbExemplaire +
                '}';
    }
}
