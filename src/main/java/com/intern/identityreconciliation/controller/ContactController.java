package com.intern.identityreconciliation.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.intern.identityreconciliation.dto.ContactRequest;
import com.intern.identityreconciliation.dto.ContactResponse;
import com.intern.identityreconciliation.service.ContactService;

/**
 * Controller class for handling contact-related operations
 */
@RestController
@RequestMapping("/api")
public class ContactController {

    @Autowired
    private ContactService contactService;

    /**
     * Identifies and consolidates contact information based on email and phone number
     * @param contactRequest The request containing email and phone number
     * @return ResponseEntity containing the consolidated contact information
     */
    @PostMapping("/identify")
    public ResponseEntity<ContactResponse> identify(@RequestBody ContactRequest contactRequest) {
        ContactResponse response = contactService.identifyContact(contactRequest.getEmail(), contactRequest.getPhoneNumber());
        return ResponseEntity.ok(response);
    }
}


