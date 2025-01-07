package com.intern.identityreconciliation.exceptionhandle;

public class InternalServerErrorException extends RuntimeException {
    
	private static final long serialVersionUID = 1L;

	public InternalServerErrorException(String message) {
        super(message);
    }
}