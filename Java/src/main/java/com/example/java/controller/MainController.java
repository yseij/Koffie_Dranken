package com.example.java.controller;

import com.example.java.model.Koffie;
import com.example.java.repository.KoffieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MainController {
    @Autowired
    private KoffieRepository koffieRepository;

    @GetMapping ({"/{id}"})
    public Koffie GetById(@PathVariable Long id) {
        return koffieRepository.getById(id);
    }

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
        Koffie koffie = koffieRepository.getById(updateKoffie.getId());
        koffie.setName(updateKoffie.getName());
        koffie.setSoort(updateKoffie.getSoort());
        koffie.setMeaning(updateKoffie.getMeaning());
        koffie.setWhen_made(updateKoffie.getWhen_made());
        koffie.setWhere_made(updateKoffie.getWhere_made());
        koffie.setImportants_ingredient(updateKoffie.getImportants_ingredient());
        koffieRepository.save(koffie);
        return updateKoffie;
    }

    @DeleteMapping("/DeleteKoffie/{id}")
    public void deleteKoffie(@PathVariable Long id)
    {
        koffieRepository.deleteById(id);
    }
}
