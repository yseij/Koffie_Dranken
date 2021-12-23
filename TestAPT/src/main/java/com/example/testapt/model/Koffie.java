package com.example.testapt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Koffie {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String achternaam;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Koffie() {

    }

    public Koffie(String naam, String afkorting) {
        this.name = naam;
        this.achternaam = afkorting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }
}
