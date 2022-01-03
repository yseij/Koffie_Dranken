package com.example.java.controller;

import com.example.java.model.Koffie;
import com.example.java.model.KoffieDTO;
import com.example.java.repository.KoffieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
public class MainController {
    @Autowired
    private KoffieRepository koffieRepository;

    @PostConstruct
    public void fillDB(){
        if (koffieRepository.count() == 0){
            koffieRepository.save(new Koffie(100L,"Espresso", "Italië","1900", "Koffie", "onder druk", "PureVorm", "Coffea Arabica"));
            koffieRepository.save(new Koffie(101L,"Caffè machiato", "VS","1995", "Beetje melkschuim", "Gevlekte koffie", "MelkEnRoomVorm", "Coffea Robusta"));
            koffieRepository.save(new Koffie(102L,"Barraquito", "Spanje","1900", "laag gecondenseerde melk", "", "AlcoholischeVorm", "Coffea Liberica"));
        }
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
    public Koffie addKoffie(@RequestBody KoffieDTO koffieDTO)
    {
        Koffie koffie = convertKoffieDTOToKoffie(koffieDTO);
        Long maxid = koffieRepository.getMaxId();
        koffie.setId(maxid + 1);
        koffieRepository.save(koffie);
        return koffie;
    }

    @PutMapping ("/PutKoffie")
    public Koffie updateKoffie(@RequestBody KoffieDTO updateKoffieDTO)
    {
        Koffie updatedKoffie = convertKoffieDTOToKoffie(updateKoffieDTO);

        Koffie koffie = koffieRepository.getByName(updatedKoffie.getName());
        koffie.setName(updatedKoffie.getName());
        koffie.setSoort(updatedKoffie.getSoort());
        koffie.setMeaning(updatedKoffie.getMeaning());
        koffie.setWhen_made(updatedKoffie.getWhen_made());
        koffie.setWhere_made(updatedKoffie.getWhere_made());
        koffie.setImportants_ingredient(updatedKoffie.getImportants_ingredient());
        koffie.setBoonName(updatedKoffie.getBoonName());
        koffieRepository.save(koffie);
        return koffie;
    }

    @DeleteMapping("/DeleteKoffie/{name}")
    public ResponseEntity deleteKoffie(@PathVariable String name)
    {
        Koffie koffie = koffieRepository.getByName(name);
        if(koffie!=null){
            koffieRepository.delete(koffie);
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    private Koffie convertKoffieDTOToKoffie(KoffieDTO koffieDTO){
        Koffie koffie = new Koffie();
        koffie.setName(koffieDTO.getName());
        koffie.setSoort(koffieDTO.getSoort());
        koffie.setMeaning(koffieDTO.getMeaning());
        koffie.setWhen_made(koffieDTO.getWhen_made());
        koffie.setWhere_made(koffieDTO.getWhere_made());
        koffie.setImportants_ingredient(koffieDTO.getImportants_ingredient());
        koffie.setBoonName(koffieDTO.getBoonName());

        return koffie;
    }
}
