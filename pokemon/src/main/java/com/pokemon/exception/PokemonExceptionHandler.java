package com.pokemon.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PokemonExceptionHandler {
	
	@ExceptionHandler(value = {PokemonNotFoundException.class})
	public ResponseEntity<Object> handlePokemonNotFoundException(PokemonNotFoundException pokemonNotFoundException){
		PokemonException pokemonException = new PokemonException(
		pokemonNotFoundException.getMessage(),
		pokemonNotFoundException.getCause(),
		HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<>(pokemonException, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = {PokemonBadRequestException.class})
	public ResponseEntity<Object> handlePokemonBadRequestException(PokemonBadRequestException pokemonBadRequestException){
		PokemonException pokemonException = new PokemonException(
		pokemonBadRequestException.getMessage(),
		pokemonBadRequestException.getCause(),
		HttpStatus.BAD_REQUEST);
		
		return new ResponseEntity<>(pokemonException, HttpStatus.BAD_REQUEST);
	}
}