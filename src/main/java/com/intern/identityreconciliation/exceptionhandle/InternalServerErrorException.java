// Package for exception handling
package com.intern.identityreconciliation.exceptionhandle;

// Custom exception class for internal server errors
public class InternalServerErrorException extends RuntimeException {
    
    // Serial version UID for serialization
	private static final long serialVersionUID = 1L;

    // Constructor that takes an error message
	public InternalServerErrorException(String message) {
        super(message);
    }
}