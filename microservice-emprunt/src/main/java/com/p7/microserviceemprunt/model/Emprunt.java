package com.p7.microserviceemprunt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Emprunt {
    @Id
    @GeneratedValue
    private Long id;
    private Long ouvrageId;
    private Date dateEmprunt;

    public Emprunt() {
    }

    public Emprunt(Long ouvrageId, Date dateEmprunt) {
        this.ouvrageId = ouvrageId;
        this.dateEmprunt = dateEmprunt;
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
}
