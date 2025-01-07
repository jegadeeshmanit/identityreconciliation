package com.intern.identityreconciliation.repository;


import com.intern.identityreconciliation.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//Repository interface for Contact entity that extends JpaRepository
public interface ContactRepository extends JpaRepository<Contact, Long> {

	 //Find a contact by email or phone number
	 Optional<Contact> findByEmailOrPhoneNumber(String email, String phoneNumber);
}
