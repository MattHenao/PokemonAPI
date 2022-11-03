package com.pokemon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pokemon.model.Pokemon;
import com.pokemon.service.PokemonService;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/pokenon")

public class PokenonController {
	@Autowired
	private PokemonService pokemonService;
	
	@GetMapping()
	public List<Pokemon> getPokemon() {
		return pokemonService.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void deletePokemon(@PathVariable Integer id) {
		pokemonService.delete(id);
	}
}
