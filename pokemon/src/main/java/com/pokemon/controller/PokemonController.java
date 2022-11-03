package com.pokemon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pokemon.model.Pokemon;
import com.pokemon.service.PokemonService;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/pokemon")

public class PokemonController {
	@Autowired
	private PokemonService pokemonService;
	
	@PostMapping()
	public Pokemon savePokemon(@RequestBody Pokemon pokemon){
		return pokemonService.save(pokemon);
	}
	
	@GetMapping("/{id}")
	public Pokemon findByIdPokemon(@PathVariable Integer id) {
		return pokemonService.findById(id);
	}
	
	@PutMapping("/{id}")
	public Pokemon updatePokemon(@RequestBody Pokemon pokemon, @PathVariable Integer id) {
		Pokemon actualPokemon = pokemonService.findById(id);
		
		actualPokemon.setIdPokedex(pokemon.getIdPokedex());
		actualPokemon.setName(pokemon.getName());
		actualPokemon.setType(pokemon.getType());
		actualPokemon.setAttack(pokemon.getAttack());
		actualPokemon.setImageUrl(pokemon.getImageUrl());
		
		return pokemonService.save(actualPokemon);
	}
}