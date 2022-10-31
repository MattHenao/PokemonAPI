package com.pokemon.dao;

import org.springframework.data.repository.CrudRepository;
import com.pokemon.model.Pokemon;

public interface PokemonDao extends CrudRepository<Pokemon, Integer>{
	
}
