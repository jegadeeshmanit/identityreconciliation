# identityreconciliation
 
 Project Overview
 This Identity Reconciliation API is designed to manage and consolidate contact information efficiently. When users submit contact details through the API, the system intelligently determines whether to create new contacts or link them to existing ones, maintaining a clear hierarchy of primary and secondary contacts.
 
 ## Key Components:
 1. Contact Management
    - Creates and updates contact records
    - Maintains relationships between primary and secondary contacts
    - Handles duplicate detection and merging
 
 2. Data Storage
    - Persistent storage using MySQL database
    - Efficient querying and relationship mapping
    - Data integrity maintenance
 
 3. API Features
    - RESTful endpoint for contact identification
    - JSON request/response format
    - Comprehensive error handling
 
 4. System Requirements
    - Java 8 or higher
    - Maven for dependency management
    - MySQL database server
 
 5. Security Considerations
    - Input validation
    - Error handling
    - Data consistency checks
 
## Getting Started:
 1. Clone the repository
 2. Configure MySQL database settings
 3. Build using Maven
 4. Run the Spring Boot application
 5. Test using Postman or any API client
 


## Project Structure

1. controller
    * ContactController.java
2. model
    * Contact.java
3. dto
    * ContactRequest.java
    * ContactResponse.java
4. repository
    * ContactRepository.java
5. service
    * ContactService.java
6. IdentityReconciliationApplication.java



## Build and Run
  * mvn clean install
  * java -jar target/identity-reconciliation-0.0.1-SNAPSHOT.jar
   

## API Usage:

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
- 400 Bad Request: Secondary contact can't update
- 500 Internal Server Error: Server-side processing issues


License:
This project is licensed under the MIT License.



