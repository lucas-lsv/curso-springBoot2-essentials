/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.springboot2.client;

import com.curso.springboot2.domain.Anime;
import java.util.Arrays;
import java.util.List;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author lucas
 */
@Log4j2
public class SpringClient {

    public static void main(String[] args) {

        ResponseEntity<Anime> entity = new RestTemplate().getForEntity("http://localhost:8080/animes/{id}", Anime.class, 1);
        log.info(entity);

        Anime object = new RestTemplate().getForObject("http://localhost:8080/animes/{id}", Anime.class, 2);
        log.info(object);

        Anime[] animes = new RestTemplate().getForObject("http://localhost:8080/animes/all", Anime[].class);
        log.info(Arrays.toString(animes));

        ResponseEntity<List<Anime>> exchange = new RestTemplate().exchange("http://localhost:8080/animes/all", HttpMethod.GET, null, new ParameterizedTypeReference<>() {
        });
        log.info(exchange);

        Anime pokemon = Anime.builder().name("Pokémon").build();
        Anime pokemonSaved = new RestTemplate().postForObject("http://localhost:8080/animes/", pokemon, Anime.class);
        log.info("Saved anime {}", pokemonSaved);

        Anime deathNote = Anime.builder().name("Death Note").build();
        ResponseEntity<Anime> deathNoteSaved = new RestTemplate().exchange("http://localhost:8080/animes/", HttpMethod.POST, new HttpEntity<>(deathNote, createJsonHeader()), Anime.class);
        log.info("Saved anime {}", deathNoteSaved);

        Anime animeToBeUpdated = deathNoteSaved.getBody();
        animeToBeUpdated.setName("Death Note 2");

        ResponseEntity<Void> deathNoteUpdated = new RestTemplate().exchange(
                "http://localhost:8080/animes/",
                HttpMethod.PUT,
                new HttpEntity<>(animeToBeUpdated, createJsonHeader()),
                Void.class);
        
        log.info(deathNoteUpdated);

        ResponseEntity<Void> deathDeleted = new RestTemplate().exchange(
                "http://localhost:8080/animes/{id}",
                HttpMethod.DELETE,
                null,
                Void.class,
                animeToBeUpdated.getId());
        
        log.info(deathDeleted);
    }

    private static HttpHeaders createJsonHeader() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        return httpHeaders;
    }

}
