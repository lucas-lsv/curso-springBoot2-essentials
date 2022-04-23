/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.springboot2.service;

import com.curso.springboot2.domain.Anime;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author lucas
 */

@Service
public class AnimeService {
    
    public List<Anime> listAll() {
        return List.of(new Anime(1L, "Boku no Hero"), new Anime(2L, "Dr.Stone"));
    }
    
}
