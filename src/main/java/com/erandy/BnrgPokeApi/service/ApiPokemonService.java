/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *  public PokemonExternal getPokemonCloud(int pokemonId) throws PokemonException;
 */
package com.erandy.BnrgPokeApi.service;

import com.erandy.BnrgPokeApi.external.dto.RaizAbility;
import com.erandy.BnrgPokeApi.external.dto.Abilities;
import com.erandy.BnrgPokeApi.external.dto.Ability;
import com.erandy.BnrgPokeApi.external.dto.BaseExperience;
import com.erandy.BnrgPokeApi.external.dto.HeldItemRoot;
import com.erandy.BnrgPokeApi.external.dto.HeldItems;
import com.erandy.BnrgPokeApi.external.dto.IdPokemon;
import com.erandy.BnrgPokeApi.external.dto.LocationArea;
import com.erandy.BnrgPokeApi.external.dto.NamePokemon;
import com.erandy.BnrgPokeApi.external.service.ApiExternalPokemonService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author w10
 */
@Service
public class ApiPokemonService {

    @Autowired
    private ApiExternalPokemonService apiExternalPokemonService;

    public RaizAbility getAbilities(String nombre) throws Exception {

        RaizAbility abilities = new RaizAbility();

        String body = apiExternalPokemonService.getPokemonCloud(nombre);
        if (body == null) {
            return null;
        }

        Gson gson = new Gson();
        abilities = gson.fromJson(body, RaizAbility.class);

        return abilities;
    }

    public BaseExperience getBaseExperiences(String nombre) throws Exception {

        BaseExperience baseExperience = new BaseExperience();

        String body = apiExternalPokemonService.getPokemonCloud(nombre);
        if (body == null) {
            return null;
        }

        Gson gson = new Gson();
        baseExperience = gson.fromJson(body, BaseExperience.class);

        return baseExperience;
    }

    public HeldItemRoot getHeldItems(String nombre) throws Exception {
        HeldItemRoot heldItems = new HeldItemRoot();

        String body = apiExternalPokemonService.getPokemonCloud(nombre);
        if (body == null) {
            return null;
        }

        Gson gson = new Gson();
        heldItems = gson.fromJson(body, HeldItemRoot.class);

        return heldItems;
    }

    public IdPokemon getId(String nombre) throws Exception {
        IdPokemon idPokemon = new IdPokemon();

        String body = apiExternalPokemonService.getPokemonCloud(nombre);
        if (body == null) {
            return null;
        }

        Gson gson = new Gson();
        idPokemon = gson.fromJson(body, IdPokemon.class);

        return idPokemon;
    }

    public NamePokemon getName(String nombre) throws Exception {
        NamePokemon namePokemon = new NamePokemon();

        String body = apiExternalPokemonService.getPokemonCloud(nombre);
        if (body == null) {
            return null;
        }

        Gson gson = new Gson();
        namePokemon = gson.fromJson(body, NamePokemon.class);

        return namePokemon;
    }
    
        public LocationArea getLocationArea(String nombre) throws Exception {
        LocationArea locationArea = new LocationArea();

        String body = apiExternalPokemonService.getPokemonCloud(nombre);
        if (body == null) {
            return null;
        }

        Gson gson = new Gson();
        locationArea = gson.fromJson(body, LocationArea.class);

        return locationArea;
    }
}
