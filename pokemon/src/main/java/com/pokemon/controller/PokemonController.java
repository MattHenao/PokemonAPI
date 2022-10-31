package com.pokemon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
		System.out.println("Heyyyyyyyyyyyyy");
		return pokemonService.save(pokemon);
	}
	
	@GetMapping()
	public ResponseEntity<String> getPokemon(){
		return ResponseEntity.ok("Hola");
	}
	
	
}
