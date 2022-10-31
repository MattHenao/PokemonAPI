package com.pokemon.exception;

public class ApiRequestException extends RuntimeException{
	public ApiRequestException(){
		
	}
	
	public ApiRequestException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public ApiRequestException(String message) {
		super(message);
	}
	
	public ApiRequestException(Throwable cause) {
		super(cause);
	}
	
	private static final long serialVersionUID = 1L;
	
}
