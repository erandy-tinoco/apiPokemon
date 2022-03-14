/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erandy.BnrgPokeApi.external.service;

import com.erandy.BnrgPokeApi.external.dto.RaizAbility;
import com.erandy.BnrgPokeApi.external.dto.Abilities;
import com.erandy.BnrgPokeApi.external.dto.Ability;
import com.google.gson.Gson;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
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
