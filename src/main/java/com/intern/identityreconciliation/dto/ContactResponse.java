package com.intern.identityreconciliation.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

// Data class for contact response
@Data
@AllArgsConstructor
public class ContactResponse {
    // Primary contact identifier
    private Long primaryContactId;
    // List of email addresses
    private List<String> emails;
    // List of phone numbers
    private List<String> phoneNumbers;
    // List of secondary contact identifiers
    private List<Long> secondaryContactIds;
}
