package com.intern.identityreconciliation.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String phoneNumber;
	private String email;

	@ManyToOne
	@JoinColumn(name = "linkedId")
	private Contact linkedContact;

	@Enumerated(EnumType.STRING)
	private LinkPrecedence linkPrecedence;

	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private LocalDateTime deletedAt;
	
	

	public enum LinkPrecedence {
		PRIMARY, SECONDARY
	}
}
