package com.intern.identityreconciliation.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

// Entity class representing Contact information
@Entity
@Data
public class Contact {

	// Primary key with auto-increment strategy
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	// Contact's phone number
	private String phoneNumber;
	// Contact's email address
	private String email;

	// Many-to-one relationship with another Contact entity
	@ManyToOne
	@JoinColumn(name = "linkedId")
	private Contact linkedContact;

	// Enumerated field for link precedence status
	@Enumerated(EnumType.STRING)
	private LinkPrecedence linkPrecedence;

	// Timestamp for record creation
	private LocalDateTime createdAt;
	// Timestamp for record updates
	private LocalDateTime updatedAt;
	// Timestamp for soft deletion
	private LocalDateTime deletedAt;
	
	

	// Enum defining possible link precedence values
	public enum LinkPrecedence {
		PRIMARY, SECONDARY
	}
}