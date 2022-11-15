package com.pokemon.exception;

public class PokemonBadRequestException extends RuntimeException{
	public PokemonBadRequestException(String message) {
		super(message);
	}

	public PokemonBadRequestException(String message, Throwable cause) {
		super(message, cause);
	}
	
	private static final long serialVersionUID = 1L;
}