package com.intern.identityreconciliation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.intern.identityreconciliation.dto.ContactResponse;
import com.intern.identityreconciliation.model.Contact;
import com.intern.identityreconciliation.model.Contact.LinkPrecedence;
import com.intern.identityreconciliation.repository.ContactRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Transactional
    public ContactResponse identifyContact(String email, String phoneNumber) {
        Optional<Contact> existingContact = contactRepository.findByEmailOrPhoneNumber(email, phoneNumber);

        if (existingContact.isEmpty()) {
            Contact newContact = new Contact();
            newContact.setEmail(email);
            newContact.setPhoneNumber(phoneNumber);
            newContact.setLinkPrecedence(LinkPrecedence.PRIMARY);
            newContact.setCreatedAt(LocalDateTime.now());
            newContact.setUpdatedAt(LocalDateTime.now());
            contactRepository.save(newContact);

            return new ContactResponse(newContact.getId(), List.of(email), List.of(phoneNumber), new ArrayList<>());
        } else {
            Contact existing = existingContact.get();
            Contact secondaryContact = new Contact();
            secondaryContact.setEmail(email);
            secondaryContact.setPhoneNumber(phoneNumber);
            secondaryContact.setLinkPrecedence(LinkPrecedence.SECONDARY);
            secondaryContact.setLinkedContact(existing);
            secondaryContact.setCreatedAt(LocalDateTime.now());
            secondaryContact.setUpdatedAt(LocalDateTime.now());
            contactRepository.save(secondaryContact);

            List<String> emails = new ArrayList<>();
            emails.add(existing.getEmail());
            emails.add(email);

            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(existing.getPhoneNumber());
            phoneNumbers.add(phoneNumber);

            return new ContactResponse(existing.getId(), emails, phoneNumbers, List.of(secondaryContact.getId()));
        }
    }
}
