package com.pokemon.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pokemon.dao.PokemonDao;
import com.pokemon.model.Pokemon;

@Service
public class PokemonServiceImp implements PokemonService{
	@Autowired
	private PokemonDao pokemonDao;
	
	@Override
	@Transactional(readOnly = false)
	public Pokemon save(Pokemon pokemon) {
		return pokemonDao.save(pokemon);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Pokemon> findAll(){
		return (List<Pokemon>) pokemonDao.findAll();
	}
}
