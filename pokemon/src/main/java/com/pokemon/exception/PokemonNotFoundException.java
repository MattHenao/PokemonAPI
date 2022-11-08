package com.pokemon.exception;

public class PokemonNotFoundException extends RuntimeException{
	public PokemonNotFoundException(String message) {
		super(message);
	}

	public PokemonNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	
	private static final long serialVersionUID = 1L;
}