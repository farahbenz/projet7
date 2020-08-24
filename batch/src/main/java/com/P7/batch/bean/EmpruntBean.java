package com.P7.batch.config;

import java.util.Date;

public class EmpruntBean {
    private Long id;
    private Long ouvrageId;
    private Date dateEmprunt;
    private Long email;

    public EmpruntBean() {
    }

    public EmpruntBean(Long id, Long ouvrageId, Date dateEmprunt, Long email) {
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

    public Long getEmail() {
        return email;
    }

    public void setEmail(Long email) {
        this.email = email;
    }
}
