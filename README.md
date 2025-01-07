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

controller
ContactController.java
model
Contact.java
repository
ContactRepository.java
service
IdentifyService.java
dto
IdentifyRequest.java
IdentifyResponse.java
IdentityReconciliationApplication.java



Setup Instructions:

1. Prerequisites
   - Java 11 or higher
   - MySQL 8.0 or higher
   - Maven

2. Database Configuration
   - Create a MySQL database named `identity_db`
   - Update application.properties with your database credentials:
     
     spring.datasource.url=jdbc:mysql://localhost:3306/identity_db
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     

3. Build and Run
   
   mvn clean install
   java -jar target/identity-reconciliation-0.0.1-SNAPSHOT.jar
   

API Usage:

1. Identify Contact
   - Endpoint: POST /api/identify
   - Request Body:
     
     {
       "email": "jegadeeshmani86@email.com",
       "phoneNumber": "8680882922"
     }
     
   - Response:
     
     {
       "contact": {
         "primaryContactId": 1,
         "emails": ["jegadeeshmani86@email.com"],
         "phoneNumbers": ["8680882922"],
         "secondaryContactIds": []
       }
     }

     - Request Body:
     
     {
       "email": "jegadeeshmani86@email.com",
       "phoneNumber": "6380829911"
     }
     
   - Response:
     
     {
       "contact": {
         "primaryContactId": 1,
         "emails": ["jegadeeshmani86@email.com"],
         "phoneNumbers": ["8680882922", "6380829911"],
         "secondaryContactIds": [2]
       }
     }
     

Error Handling:
- 400 Bad Request: Invalid input parameters
- 500 Internal Server Error: Server-side processing issues

Contributing:
1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

License:
This project is licensed under the MIT License.



