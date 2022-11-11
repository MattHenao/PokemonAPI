package com.pokemon.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pokemon.dao.PokemonDao;
import com.pokemon.exception.PokemonNotFoundException;
import com.pokemon.model.Pokemon;

@Service
public class PokemonServiceImp implements PokemonService{
	@Autowired
	private PokemonDao pokemonDao;
	
	@Override
	@Transactional(readOnly = false)
	public Pokemon save(Pokemon pokemon) {
		if(pokemon.getIdPokedex() == null)
			throw new PokemonNotFoundException("Nope");
			
		return pokemonDao.save(pokemon);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Pokemon> findAll(){
		if(((List<Pokemon>) pokemonDao.findAll()).isEmpty())
			throw new PokemonNotFoundException("There is no Pokemon object");
		return (List<Pokemon>) pokemonDao.findAll();
	}

	@Override
	@Transactional(readOnly = false)
	public void delete(Integer id) {
		if(pokemonDao.findById(id).isEmpty())
			throw new PokemonNotFoundException("Requested Pokemon does not exist");

		pokemonDao.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Pokemon findById(Integer id) {
		if(pokemonDao.findById(id).isEmpty())
			throw new PokemonNotFoundException("Requested Pokemon does not exist");

		return pokemonDao.findById(id).orElse(null);
	}
}