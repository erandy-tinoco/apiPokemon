/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *    @Autowired
    RestTemplate restTemplate;
 */
package com.erandy.BnrgPokeApi.controller;

import com.erandy.BnrgPokeApi.external.dto.RaizAbility;
import com.erandy.BnrgPokeApi.external.dto.BaseExperience;
import com.erandy.BnrgPokeApi.external.dto.HeldItemRoot;
import com.erandy.BnrgPokeApi.external.dto.IdPokemon;
import com.erandy.BnrgPokeApi.external.dto.LocationArea;
import com.erandy.BnrgPokeApi.external.dto.NamePokemon;
import com.erandy.BnrgPokeApi.service.ApiPokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author w10
 */
@RestController
@RequestMapping(path = "/api")
public class ApiPokemonController {

    @Autowired
    private ApiPokemonService pokemonService;

    @GetMapping("/abilities/{nombre}")
    private RaizAbility getAbilities(@PathVariable("nombre") String nombre) throws Exception {
        return pokemonService.getAbilities(nombre);
    }

    @GetMapping("/base-experiences/{nombre}")
    private BaseExperience getBaseExperiences(@PathVariable("nombre") String nombre) throws Exception {
        return pokemonService.getBaseExperiences(nombre);
    }
    
    @GetMapping("/held-items/{nombre}")
    private HeldItemRoot getHeldItems(@PathVariable("nombre") String nombre) throws Exception {
        return pokemonService.getHeldItems(nombre);
    }

    @GetMapping("/id/{nombre}")
    private IdPokemon getId(@PathVariable("nombre") String nombre) throws Exception {
        return pokemonService.getId(nombre);
    }

    @GetMapping("/name/{nombre}")
    private NamePokemon getName(@PathVariable("nombre") String nombre) throws Exception {
        return pokemonService.getName(nombre);
    }

    @GetMapping("/location-area-encounters/{nombre}")
    private LocationArea getLocation(@PathVariable("nombre") String nombre) throws Exception {
        return pokemonService.getLocationArea(nombre);
    }
}
