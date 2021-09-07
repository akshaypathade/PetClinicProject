# PetClinicProject
Implements Spring Boot and Micro Services to make a Spring Cloud project that acts as a Pet clinic with owners, pets, and appointments.

The Appointment Service holds the appointment date, time,  appointmentId, ownerId, and petId. This Service is able to complete all of the CRUD operations and was tested using postman.

The PetOwner service creates a table in the petclinic_db that contains the owner's id, first name, last name, phone number, and email.  This service also creates a list of pets that are stored in the Pet table from the PetService folder by using a Feign Client. This service is able to complete all of the crud operations.

The pet service contains the pet id, name, animal family, type, age, and owner id, and they are put into a table called pets in the petclinic_db. This also contains a list of appointments for each pet and can complete all of the crud operations.

Eureka Server is an application that holds information about all client-service applications. Every Microservice will register into the Eureka server and the Eureka server knows all the client applications running on each port and IP address.

It provides a flexible way of routing requests based on a number of criteria, as well as focuses on cross-cutting concerns such as security, resiliency, and monitoring.
An example of a request would be "localhost:7777/petowner-service/owner" and this is a get request.
