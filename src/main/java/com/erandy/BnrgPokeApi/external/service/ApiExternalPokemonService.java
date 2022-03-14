/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erandy.BnrgPokeApi.external.service;

import com.erandy.BnrgPokeApi.external.dto.RaizAbility;
import com.erandy.BnrgPokeApi.external.dto.Abilities;
import com.erandy.BnrgPokeApi.external.dto.Ability;
import com.google.gson.Gson;
import java.util.Arrays;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author w10
 */
@Component
public class ApiExternalPokemonService {

    public String getPokemonCloud(String nombre) throws Exception {

        String url = "https://pokeapi.co/api/v2/pokemon/" + nombre;
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        //HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        RestTemplate restTemplate = new RestTemplate();

        HttpEntity<Void> request = new HttpEntity<>(headers);

        try {
            ResponseEntity<String> result = restTemplate.exchange(url, HttpMethod.GET, request, String.class);
            if (result.getStatusCode() == HttpStatus.OK) {
                return result.getBody();
            }
        } catch (RestClientException e) {
            throw new Exception(e.getMessage());
        }
        return null;
    }
}
