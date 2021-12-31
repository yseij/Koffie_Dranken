package com.example.java.controller;

import com.example.java.model.Koffie;
import com.example.java.repository.KoffieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@RestController
public class MainController {
    @Autowired
    private KoffieRepository koffieRepository;

    @GetMapping ({"/AlleKoffie"})
    public List<Koffie> GetAll() {
        return koffieRepository.findAll();
    }

    @GetMapping ({"/AlleKoffie/naam={naam}"})
    public List<Koffie> GetKoffieWithName(@PathVariable String naam) {
        return koffieRepository.findByNameContaining(naam);
    }

    @GetMapping ({"/AlleKoffie/soort={soort}/name={name}"})
    public Koffie GetKoffieBySoort(@PathVariable String soort, @PathVariable String name) {
        return koffieRepository.findBySoortContainingAndAndNameContaining(soort, name);
    }

    @PostMapping("/PostKoffie")
    public Koffie addKoffie(@RequestBody Koffie newKoffie)
    {
        Long maxid = koffieRepository.getMaxId();
        newKoffie.setId(maxid + 1);
        koffieRepository.save(newKoffie);
        return newKoffie;
    }

    @PutMapping ("/PutKoffie")
    public Koffie updateKoffie(@RequestBody Koffie updateKoffie)
    {
        Koffie koffie = koffieRepository.getByName(updateKoffie.getName());
        koffie.setName(updateKoffie.getName());
        koffie.setSoort(updateKoffie.getSoort());
        koffie.setMeaning(updateKoffie.getMeaning());
        koffie.setWhen_made(updateKoffie.getWhen_made());
        koffie.setWhere_made(updateKoffie.getWhere_made());
        koffie.setImportants_ingredient(updateKoffie.getImportants_ingredient());
        koffieRepository.save(koffie);
        return updateKoffie;
    }

    @DeleteMapping("/DeleteKoffie/{name}")
    public ResponseEntity deleteKoffie(@PathVariable String name)
    {
        Koffie koffie = koffieRepository.getByName(name);

        if (koffie != null){
            koffieRepository.delete(koffie);
            return ResponseEntity.ok().build();
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

    @PostConstruct
    public void fillDB(){
        if (koffieRepository.count() == 0){
            koffieRepository.save(new Koffie(100L,"Espresso", "Italië","1900", "Koffie", "Koffie", "PureVorm"));
            koffieRepository.save(new Koffie(101L,"Caffè macchiato", "VS","1995", "Beetje melkschuim", "Beetje melkschuim", "MelkEnRoomVorm"));
            koffieRepository.save(new Koffie(102L,"Barraquito", "Spanje","1900", "laag gecondenseerde melk", "", "AlcoholischeVorm"));
        }
    }
}
