package com.intern.identityreconciliation.dto;

import lombok.Data;

// Data Transfer Object (DTO) for handling contact information requests
@Data
public class ContactRequest {
    // Email address of the contact
    private String email;
    
    // Phone number of the contact
    private String phoneNumber;

    
}

