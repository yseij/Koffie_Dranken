package com.example.java;


import com.example.java.model.Koffie;
import com.example.java.repository.KoffieRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.MediaType;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest
@AutoConfigureMockMvc
public class UnitTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private KoffieRepository koffieRepository;

    private ObjectMapper mapper = new ObjectMapper();


    @Test
    public void givenKoffie_whenGetKoffieBySortAndName_thenReturnJsonKoffie() throws Exception {
        Koffie koffie1 = new Koffie(500L, "test1",
                "test1",
                "test1",
                "test1",
                "test1",
                "test1",
                100);

        given(koffieRepository.findBySoortContainingAndAndNameContaining("test1","test1")).willReturn(koffie1);

        mockMvc.perform(get("/AlleKoffie/soort={soort}/name={name}","test1","test1"))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is("test1")))
                .andExpect(jsonPath("$.when_made", is("test1")))
                .andExpect(jsonPath("$.where_made", is("test1")))
                .andExpect(jsonPath("$.importants_ingredient", is("test1")))
                .andExpect(jsonPath("$.meaning", is("test1")))
                .andExpect(jsonPath("$.soort", is("test1")));
    }

    @Test
    public void givenKoffies_whenGetKoffieByName_thenReturnJsonKoffies() throws Exception {
        Koffie koffie1 = new Koffie(500L, "test1",
                "test1",
                "test1",
                "test1",
                "test1",
                "test1",
                101);
        Koffie koffie2 = new Koffie(501L,"test2",
                "test2",
                "test2",
                "test2",
                "test2",
                "test2",
                102);

        List<Koffie> koffieList = new ArrayList<>();
        koffieList.add(koffie1);
        koffieList.add(koffie2);

        given(koffieRepository.findByNameContaining("test")).willReturn(koffieList);

        mockMvc.perform(get("/AlleKoffie/naam={naam}","test"))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].name", is("test1")))
                .andExpect(jsonPath("$[0].when_made", is("test1")))
                .andExpect(jsonPath("$[0].where_made", is("test1")))
                .andExpect(jsonPath("$[0].importants_ingredient", is("test1")))
                .andExpect(jsonPath("$[0].meaning", is("test1")))
                .andExpect(jsonPath("$[0].soort", is("test1")));
    }

    @Test
    public void givenKoffie_whenPostKoffie_thenReturnJsonKoffies() throws Exception {
        Koffie koffieForPost = new Koffie(504L, "test5",
                "test5",
                "test5",
                "test5",
                "test5",
                "test5",
                103);

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
    public void givenKoffie_whenPutKoffie_thenReturnJsonKoffie() throws Exception{
        Koffie Koffie = new Koffie(501L,"test2",
                "test2",
                "test2",
                "test2",
                "test2",
                "test2",
                104);

        given(koffieRepository.getByName("test2")).willReturn(Koffie);

        Koffie updateKoffie = new Koffie(501L,"test2",
                "test2",
                "test2",
                "test2Update",
                "test2",
                "test2",
                1005);

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
    public void givenKoffie_whenDeleteKoffie_thenStatusOk() throws Exception{
        Koffie koffieForDelete = new Koffie(599L,"test599",
                "test599",
                "test599",
                "test599",
                "test599",
                "test599",
                106);

        given(koffieRepository.getByName("test599")).willReturn(koffieForDelete);

        mockMvc.perform(delete("/DeleteKoffie/{name}","test599")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void givenKoffie_whenDeleteKoffie_thenStatusNotFound() throws Exception{
        given(koffieRepository.getByName("test599")).willReturn(null);

        mockMvc.perform(delete("/DeleteKoffie/{name}", "test599")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }

}
