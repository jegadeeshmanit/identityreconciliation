# identityreconciliation
This project implements a Spring Boot REST API to handle identity reconciliation by consolidating contact information. It identifies primary and secondary contacts based on incoming requests containing email and phone number details.

Features
1. REST Endpoint: /api/identify
 .Accepts email and phoneNumber in the request.
 .Consolidates contacts into primary and secondary relationships.
2. Database Integration: Uses MySQL for persistent storage.
3. Dynamic Contact Linking: Automatically updates or creates new contact entries based on the incoming request.
4. Scalable Design: Handles complex relationships between contacts seamlessly

Technologies Used:
 -> Spring Boot: Backend framework.
 -> MySQL: Database for persistent storage.
 ->Spring Data JPA: ORM for database interaction.
 -> Lombok: Simplifies boilerplate code.
 -> Postman: For API testing.

 Project Structure

 src/main/java/com/example/identityreconciliation
├── controller
│   └── IdentifyController.java
├── model
│   └── Contact.java
├── repository
│   └── ContactRepository.java
├── service
│   └── IdentifyService.java
├── dto
│   └── IdentifyRequest.java
│   └── IdentifyResponse.java
└── IdentityReconciliationApplication.java
