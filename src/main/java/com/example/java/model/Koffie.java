package com.example.java.model;

import javax.persistence.*;

@Entity
@Table(name = "`koffiesoorten`")
public class Koffie {
    @Column(name = "id", nullable = false)
    @Id
    private Long id;

    private String name;
    private String wheremade;
    private String whenmade;
    private String importantsingredient;
    private String meaning;
    private String soort;
    private String boonName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Koffie() {
    }

    public Koffie(Long id, String name, String wheremade, String whenmade, String importantsingredient, String meaning, String soort, String boonName) {
        this.id = id;
        this.name = name;
        this.wheremade = wheremade;
        this.whenmade = whenmade;
        this.importantsingredient = importantsingredient;
        this.meaning = meaning;
        this.soort = soort;
        this.boonName = boonName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWhere_made() {
        return wheremade;
    }

    public void setWhere_made(String where_made) {
        this.wheremade = where_made;
    }

    public String getWhen_made() {
        return whenmade;
    }

    public void setWhen_made(String when_made) {
        this.whenmade = when_made;
    }

    public String getImportants_ingredient() {
        return importantsingredient;
    }

    public void setImportants_ingredient(String importants_ingredient) {this.importantsingredient = importants_ingredient;}

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getSoort() {
        return soort;
    }

    public void setSoort(String soort) {
        this.soort = soort;
    }

    public String getBoonName() {return boonName;}

    public void setBoonName(String boonName) {this.boonName = boonName;}
}
