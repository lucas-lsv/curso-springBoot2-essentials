/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.springboot2.repository;

import com.curso.springboot2.domain.Anime;
import java.util.List;

/**
 *
 * @author lucas
 */
public interface AnimeRepository {
    
    List<Anime> listAll();
    
}
