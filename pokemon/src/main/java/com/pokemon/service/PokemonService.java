package com.pokemon.service;

import java.util.List;

import com.pokemon.model.Pokemon;

public interface PokemonService {
	public Pokemon save(Pokemon pokemon);
	public List<Pokemon> findAll();
}
