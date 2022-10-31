package com.pokemon.controller;

public class PokemonError extends RuntimeException{
	public PokemonError(String message) {
		super(message);
	}
	
	public PokemonError(String message, Throwable cause) {
		super(message, cause);
	}
	
	private static final long serialVersionUID = 1L;
}
