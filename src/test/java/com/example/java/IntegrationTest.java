package com.example.java;

import com.example.java.model.Koffie;
import com.example.java.repository.KoffieRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class IntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private KoffieRepository koffieRepository;

    private Koffie koffie1 = new Koffie(500L, "test1",
            "test1",
            "test1",
            "test1",
            "test1",
            "test1");
    private Koffie koffie2 = new Koffie(501L,"test2",
            "test2",
            "test2",
            "test2",
            "test2",
            "test2");
    private Koffie koffie3 = new Koffie(502L,"test3",
            "test3",
            "test3",
            "test3",
            "test3",
            "test3");
    private Koffie koffieForDelete = new Koffie(503L,"AllesOke4",
            "test4",
            "test4",
            "test4",
            "test4",
            "test4");
    private Koffie koffieForPost = new Koffie(504L, "test5",
            "test5",
            "test5",
            "test5",
            "test5",
            "test5");

    @BeforeEach
    public void beforeAllTests(){
        koffieRepository.save(koffie1);
        koffieRepository.save(koffie2);
        koffieRepository.save(koffie3);
        koffieRepository.save(koffieForDelete);
    }

    @AfterEach
    public void afterAllTests(){
        koffieRepository.delete(koffie1);
        koffieRepository.delete(koffie2);
        koffieRepository.delete(koffie3);
        koffieRepository.delete(koffieForPost);
        koffieRepository.delete(koffieForDelete);
    }

    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void givenKoffie_whenGetAllKoffiesByName_thenReturnJsonKoffies() throws Exception{

        mockMvc.perform(get("/AlleKoffie/naam={name}", "test"))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(3)))
                .andExpect(jsonPath("$[0].name", is("test1")))
                .andExpect(jsonPath("$[0].when_made", is("test1")))
                .andExpect(jsonPath("$[0].where_made", is("test1")))
                .andExpect(jsonPath("$[0].importants_ingredient", is("test1")))
                .andExpect(jsonPath("$[0].meaning", is("test1")))
                .andExpect(jsonPath("$[0].soort", is("test1")));
    }


    @Test
    public void givenKoffie_getAllKoffiesBySortAndName_thenReturnJsonKoffies() throws Exception{
        mockMvc.perform(get("/AlleKoffie/soort={soort}/name={name}", "test3", "test3"))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is("test3")))
                .andExpect(jsonPath("$.when_made", is("test3")))
                .andExpect(jsonPath("$.where_made", is("test3")))
                .andExpect(jsonPath("$.importants_ingredient", is("test3")))
                .andExpect(jsonPath("$.meaning", is("test3")))
                .andExpect(jsonPath("$.soort", is("test3")));
    }

    @Test
    public void givenKoffie_whenPostKoffie_thenReturnJsonKoffies() throws Exception {
        mockMvc.perform(post("/PostKoffie")
                .content(mapper.writeValueAsString(koffieForPost))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is("test5")))
                .andExpect(jsonPath("$.when_made", is("test5")))
                .andExpect(jsonPath("$.where_made", is("test5")))
                .andExpect(jsonPath("$.importants_ingredient", is("test5")))
                .andExpect(jsonPath("$.meaning", is("test5")))
                .andExpect(jsonPath("$.soort", is("test5")));
    }

    @Test
    public void givenKoffie_whenPutKoffie_thenReturnJsonKoffies() throws Exception {
        Koffie updateKoffie = new Koffie(501L,"test2",
                "test2",
                "test2",
                "test2Update",
                "test2",
                "test2");

        mockMvc.perform(put("/PutKoffie")
                .content(mapper.writeValueAsString(updateKoffie))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is("test2")))
                .andExpect(jsonPath("$.when_made", is("test2")))
                .andExpect(jsonPath("$.where_made", is("test2")))
                .andExpect(jsonPath("$.importants_ingredient", is("test2Update")))
                .andExpect(jsonPath("$.meaning", is("test2")))
                .andExpect(jsonPath("$.soort", is("test2")));
    }

    @Test
    public void givenKoffie_whenDeleteKoffie_thenStatusOk() throws Exception {
        mockMvc.perform(delete("/DeleteKoffie/{id}", 503)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}
