package com.intern.identityreconciliation.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.intern.identityreconciliation.dto.ContactRequest;
import com.intern.identityreconciliation.dto.ContactResponse;
import com.intern.identityreconciliation.service.ContactService;

@RestController
@RequestMapping("/api")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping("/identify")
    public ResponseEntity<ContactResponse> identify(@RequestBody ContactRequest contactRequest) {
        ContactResponse response = contactService.identifyContact(contactRequest.getEmail(), contactRequest.getPhoneNumber());
        return ResponseEntity.ok(response);
    }
}


