package com.intern.identityreconciliation.repository;


import com.intern.identityreconciliation.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ContactRepository extends JpaRepository<Contact, Long> {

	 Optional<Contact> findByEmailOrPhoneNumber(String email, String phoneNumber);
}
