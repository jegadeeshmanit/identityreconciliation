package com.intern.identityreconciliation.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.intern.identityreconciliation.dto.ContactRequest;
import com.intern.identityreconciliation.dto.ContactResponse;
import com.intern.identityreconciliation.service.ContactService;

// Controller class for handling contact information requests
@RestController
@RequestMapping("/api")
public class ContactController {

    @Autowired
    private ContactService contactService;

    
    // Endpoint for identifying a contact based on email and phone number
    // Returns a ContactResponse containing primary contact ID, emails, phone numbers, and secondary contact IDs if found
    // Returns 400 Bad Request if email or phone number is missing
    // Returns 500 Internal Server Error if an exception occurs during identification
    @CrossOrigin
    @PostMapping("/identify")
    public ResponseEntity<ContactResponse> identify(@RequestBody ContactRequest contactRequest) {
        ContactResponse response = contactService.identifyContact(contactRequest.getEmail(), contactRequest.getPhoneNumber());
        return ResponseEntity.ok(response);
    }
}


