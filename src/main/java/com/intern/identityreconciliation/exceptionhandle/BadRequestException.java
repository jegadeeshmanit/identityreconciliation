package com.intern.identityreconciliation.exceptionhandle;

//Custom exception class for handling bad requests
public class BadRequestException extends RuntimeException {
  
	//Serial version UID for serialization
	private static final long serialVersionUID = 1L;

	//Constructor that takes error message as parameter
	public BadRequestException(String message) {
        super(message);
    }
}
