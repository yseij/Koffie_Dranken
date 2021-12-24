package com.example.java.controller;

import com.example.java.model.Koffie;
import com.example.java.repository.KoffieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {
    @Autowired
    private KoffieRepository koffieRepository;

    @GetMapping ({"/AlleKoffie"})
    public List<Koffie> getKoffie() {;
        return koffieRepository.findAll();
    }

    @GetMapping ({"/AlleKoffie/naam={naam}"})
    public List<Koffie> GetKoffieWithName(@PathVariable String naam) {
        return koffieRepository.findByNameContaining(naam);
    }

    @GetMapping ({"/AlleKoffie/soort={soort}"})
    public List<Koffie> GetKoffieByDate(@PathVariable String soort) {
        return koffieRepository.findBySoortContaining(soort);
    }

    @PostMapping("/PostKoffie")
    public Koffie add(@RequestBody Koffie newKoffie)
    {
        Long maxid = koffieRepository.getMaxId();
        newKoffie.setId(maxid + 1);
        koffieRepository.save(newKoffie);
        return newKoffie;
    }

    @PutMapping ("/PutKoffie/{id}")
    public Koffie updateKoffie(@RequestBody Koffie updateKoffie, @PathVariable Long id)
    {
        Koffie koffie = koffieRepository.getById(id);
        System.out.println(koffie);
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
