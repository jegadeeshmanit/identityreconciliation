package com.intern.identityreconciliation.exceptionhandle;

import lombok.Data;

// Lombok annotation to generate getters, setters, equals, hashCode and toString methods
@Data
public class ErrorDetails {
	
	// HTTP status code of the error
	private int status;
    // Error message description
    private String message;
    // Additional details about the error
    private String details;

    // Constructor to initialize all fields
    public ErrorDetails(int status, String message, String details) {
        this.status = status;
        this.message = message;
        this.details = details;
    }

}
