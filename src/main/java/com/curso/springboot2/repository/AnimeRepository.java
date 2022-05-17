/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.springboot2.repository;

import com.curso.springboot2.domain.Anime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author lucas
 */
public interface AnimeRepository extends JpaRepository<Anime, Long> {
    
    List<Anime> findByName(String name);
    
}
