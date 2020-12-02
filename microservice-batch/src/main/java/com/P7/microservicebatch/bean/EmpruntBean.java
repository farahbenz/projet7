package com.P7.microservicebatch.bean;

import java.util.Date;

public class EmpruntBean {
    private Long id;
    private Long ouvrageId;
    private Date dateEmprunt;
    private Long userId;
    private String nomOuvrage;

    public EmpruntBean() {
    }

    public EmpruntBean(Long ouvrageId, Date dateEmprunt, Long userId, String nomOuvrage) {
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
