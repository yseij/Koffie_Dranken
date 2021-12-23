package com.example.testapt.controller;

import com.example.testapt.model.Koffie;
import com.example.testapt.repository.KoffieRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@RestController
public class MainController {
    ArrayList<Koffie> koffie = new ArrayList<>();

    private KoffieRepository koffieRepository;
    public MainController(KoffieRepository koffieRepository){
        this.koffieRepository = koffieRepository;
    }

    @PostConstruct
    public void set(){
        koffie.add(new Koffie("Applied Computer Science", "ACS"));
        koffie.add(new Koffie("Elektronica-ICT", "Elo-ICT"));
        koffie.add(new Koffie("Toegepaste Informatica", "TI"));
        System.out.println("2");
    }

    @RequestMapping({"/voorbeeldzondergegevens"})
    public String getKoffie() {
        System.out.println("test");
        return "voorbeeldzondergegevens";
    }
}
