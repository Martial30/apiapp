package com.apirest.apiapp.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bieres")
public class Biere {
    @Id
    private Integer idbi;
    private String nombiere;
    private Integer prixbi;
    private Integer nbredbtbi;
    private Integer nbrfnbi;
    private Integer total;

    public Biere(Integer idbi, String nombiere, Integer prixbi, Integer nbredbtbi, Integer nbrfnbi, Integer total) {
        this.idbi = idbi;
        this.nombiere = nombiere;
        this.prixbi = prixbi;
        this.nbredbtbi = nbredbtbi;
        this.nbrfnbi = nbrfnbi;
        this.total = total;
    }
    public Biere() {
    }
    public Integer calculerUneBoisson(Integer idbi, Integer nbredbtbi, Integer nbrfnbi, Integer total){
        return total = nbredbtbi-nbrfnbi;
    }
    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTotal() {
        return total;
    }

    public Integer getIdbi() {
        return idbi;
    }

    public void setIdbi(Integer idbi) {
        this.idbi = idbi;
    }

    public String getNombiere() {
        return nombiere;
    }

    public void setNombiere(String nombiere) {
        this.nombiere = nombiere;
    }

    public Integer getPrixbi() {
        return prixbi;
    }

    public void setPrixbi(Integer prixbi) {
        this.prixbi = prixbi;
    }

    public Integer getNbredbtbi() {
        return nbredbtbi;
    }

    public void setNbredbtbi(Integer nbredbtbi) {
        this.nbredbtbi = nbredbtbi;
    }

    public Integer getNbrfnbi() {
        return nbrfnbi;
    }

    public void setNbrfnbi(Integer nbrfnbi) {
        this.nbrfnbi = nbrfnbi;
    }
}
