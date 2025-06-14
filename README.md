﻿# Quotes API (My first Spring Boot project)

A simple Spring Boot REST API for managing inspirational quotes, with CRUD operations.

## 📝 Description
Educational project to create my first API that consists of a CRUD, in SpringBoot, creating a collection, in Postman, able of visualizing, adding, editing and delete philosophical texts.

## 🛠️ Technologies

- Java 21 [![Java](https://img.shields.io/badge/Java-%23ED8B00.svg?logo=openjdk&logoColor=white)](#)
- SpringBoot [![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?logo=springboot&logoColor=fff)](#)
- Git [![Git](https://img.shields.io/badge/Git-F05032?logo=git&logoColor=fff)](#)
- IntelliJ IDEA [![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?logo=intellij-idea&logoColor=white)](#)
- MySQL [![MySQL](https://img.shields.io/badge/MySQL-4479A1?logo=mysql&logoColor=fff)](#)
- Postman ![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)

## 🚀 Installation

1. Clone the repository:
```
git clone 
https://github.com/thaisrqueiroz/quotes.git
```
2. Configure database:

Create a MySQL database named quotes_db

Update application.properties:
```
spring.application.name=quotes

spring.datasource.url= ${DB_URL}
spring.datasource.username=${DB_USER}
spring.datasource.password=${DB_PASSWORD}

spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.show-sql=true
```
Update environment variables:
```
DB_URL=jdbc:mysql://localhost:3306/quotes_db
DB_USER=your-user
DB_PASSWORD=your-password
```

3. Run the application:
```
./mvnw spring-boot:run
```

## 📍 API Endpoints

| Method	 |   Endpoint	| Description |
|---------| ------- | ---- |
| GET     |   /quotes |   Get all quotes |
| GET     | /quotes/{id} | Get a single quote by ID |
| POST    | /quotes | Create a new quote |
| PUT     | /quotes/{id} | Update an existing quote |
| PATCH | /quotes/{id} | Partial update an existing quote |
| DELETE | /quotes/{id} | Delete a quote |

Example Request (POST /quotes)
```
{
"phrase": "Be the change you wish to see in the world",
"author": "Mahatma Gandhi"
}
```

## 🛠️ Project Structure
```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── example/
│   │           └── quotes/
│   │               ├── controllers/  # QuoteController
│   │               ├── dtos/        # QuoteDto
│   │               ├── models/       # Quote
│   │               ├── repositories/  # QuoteRepository
│   │               └── services/     # QuoteService
│   └── resources/
│       └── application.properties
```
