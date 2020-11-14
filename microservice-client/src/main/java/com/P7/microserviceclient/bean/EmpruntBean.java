package com.P7.microserviceclient.bean;

import java.util.Date;

public class EmpruntBean {

    private Long id;
    private Long ouvrageId;
    private Date dateEmprunt;
    private Long userId;

    public EmpruntBean() {
    }

    public EmpruntBean(Long id, Long ouvrageId, Date dateEmprunt, Long userId) {
        this.id = id;
        this.ouvrageId = ouvrageId;
        this.dateEmprunt = dateEmprunt;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOuvrageId(Long id) {
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

    public Long getUserId(Long idUser) {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
