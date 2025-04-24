# Library_Management_System

This project is a **Library Management System** built with **Spring Boot** and **PostgreSQL**. The system allows users to manage books and borrow them. The system keeps track of the **borrowing history** and **book status**.

## Features
- User can **borrow books**.
- Book status is updated to **BORROWED** when borrowed.
- **No return functionality** (not implemented as per requirement).
- API is documented using **Swagger**.
- Secure access using **Spring Security** (optional, for future use).

## Tech Stack
- **Backend**: Java, Spring Boot
- **Database**: PostgreSQL
- **API Documentation**: Swagger (via Springdoc OpenAPI)
- **Persistence**: JPA with Hibernate

## Prerequisites

Before running the project, ensure that you have the following installed:

- **Java 17** or above
- **Maven** (for building the project)
- **PostgreSQL** (for the database)

## Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/library-management-system.git
   cd library-management-system
Run the application:
mvn spring-boot:run

Swagger API Documentation
The API documentation is available via Swagger UI:

Open your browser and visit: http://localhost:8080/swagger-ui/index.html