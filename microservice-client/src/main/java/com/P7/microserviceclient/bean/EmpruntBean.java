package com.P7.microserviceclient.bean;

import java.util.Date;

public class EmpruntBean {

    private Long id;
    private Long ouvrageId;
    private Date dateEmprunt;
    private String email;

    public EmpruntBean() {
    }

    public EmpruntBean(Long id, Long ouvrageId, Date dateEmprunt, String email) {
        this.id = id;
        this.ouvrageId = ouvrageId;
        this.dateEmprunt = dateEmprunt;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "EmpruntBean{" +
                "id=" + id +
                ", ouvrageId=" + ouvrageId +
                ", dateEmprunt=" + dateEmprunt +
                ", email='" + email + '\'' +
                '}';
    }
}
