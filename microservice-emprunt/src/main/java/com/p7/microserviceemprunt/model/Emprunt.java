package com.p7.microserviceemprunt.model;

import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Emprunt implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private Long ouvrageId;
    @UpdateTimestamp
    @Temporal(TemporalType.DATE)
    private Date dateEmprunt;
    private Long userId;
    private String nomOuvrage;

    public Emprunt() {
    }

    public Emprunt(Long ouvrageId, Date dateEmprunt, Long userId, String nomOuvrage) {
        this.ouvrageId = ouvrageId;
        this.dateEmprunt = dateEmprunt;
        this.userId = userId;
        this.nomOuvrage = nomOuvrage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOuvrageId() {
        return ouvrageId;
    }

    public void setOuvrageId(Long ouvrageId) {
        this.ouvrageId = ouvrageId;
    }

    public Date getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(Date dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNomOuvrage() {
        return nomOuvrage;
    }

    public void setNomOuvrage(String nomOuvrage) {
        this.nomOuvrage = nomOuvrage;
    }
}
