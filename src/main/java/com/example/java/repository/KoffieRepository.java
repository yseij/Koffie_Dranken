package com.example.java.repository;

import com.example.java.model.Koffie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KoffieRepository extends JpaRepository<Koffie, Long> {
    List<Koffie> findByNameContaining(String naam);
    Koffie findBySoortContainingAndAndNameContaining(String soort, String name);
    @Query("SELECT coalesce(max(ks.id), 0) FROM Koffie ks")
    Long getMaxId();
    Koffie getByName(String naam);
}
