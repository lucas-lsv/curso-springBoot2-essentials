/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.springboot2.util;

import com.curso.springboot2.domain.Anime;

/**
 *
 * @author lucas
 */
public class AnimeCreator {
    
    public static Anime createAnimeToBeSaved() {
        return Anime.builder()
                .name("Grand blue")
                .build();
    }
    
    public static Anime createValidAnime() {
        return Anime.builder()
                .name("Grand blue")
                .id(1L)
                .build();
    }
    
    public static Anime createValidUpdatedAnime() {
        return Anime.builder()
                .name("Fullmetal")
                .id(1L)
                .build();
    }
    
}
