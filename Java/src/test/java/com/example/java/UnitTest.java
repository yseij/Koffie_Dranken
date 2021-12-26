package com.example.java;


import com.example.java.controller.MainController;
import com.example.java.model.Koffie;
import com.example.java.repository.KoffieRepository;
import org.checkerframework.checker.units.qual.K;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

@SpringBootTest
public class UnitTest {

//    @Autowired
//    private MainController mainController;
//    private KoffieRepository koffieRepository;
//
//    @Test
//    void TestGetWithName() {
//        List<Koffie> testKoffie = mainController.GetKoffieWithName("Espresso");
//        assertEquals("Espresso", testKoffie.get(0).getName());
//        assertEquals("onder druk", testKoffie.get(0).getMeaning());
//        assertEquals("PureVorm", testKoffie.get(0).getSoort());
//        assertEquals("1900", testKoffie.get(0).getWhen_made());
//        assertEquals("Italië", testKoffie.get(0).getWhere_made());
//        assertEquals("Koffie", testKoffie.get(0).getImportants_ingredient());
//    }
//
//    @Test
//    void TestGetWithSoort() {
//        Koffie testKoffie = mainController.GetKoffieBySoort("PureVorm", "Groene Koffie");
//        assertEquals("Groene Koffie", testKoffie.getName());
//        assertEquals("Arabische Koffie", testKoffie.getMeaning());
//        assertEquals("PureVorm", testKoffie.getSoort());
//        assertEquals("1100", testKoffie.getWhen_made());
//        assertEquals("Arabië", testKoffie.getWhere_made());
//        assertEquals("Groene bonen", testKoffie.getImportants_ingredient());
//    }
//
//    @Test
//    void TestPostKoffie(){
//        Koffie newKoffie = new Koffie("test100", "test100", "test100", "test100", "test100", "test100");
//        Koffie newKoffie2 = mainController.addKoffie(newKoffie);
//        assertEquals("test100", newKoffie2.getName());
//        assertEquals("test100", newKoffie2.getMeaning());
//        assertEquals("test100", newKoffie2.getSoort());
//        assertEquals("test100", newKoffie2.getWhen_made());
//        assertEquals("test100", newKoffie2.getWhere_made());
//        assertEquals("test100", newKoffie2.getImportants_ingredient());
//    }
//
//    @Test
//    void TestPutKoffie(){
//        Koffie newKoffie = new Koffie();
//        newKoffie.setMeaning("test");
//        Koffie newKoffie2 = mainController.updateKoffie(newKoffie, 4L);
//        assertEquals("test", newKoffie2.getMeaning());
//    }
}
