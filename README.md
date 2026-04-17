# Product API

A RESTful API built with Spring Boot demonstrating core backend development concepts.

## Tech Stack
- Java 17
- Spring Boot 3.5
- Spring Data JPA
- H2 In-Memory Database
- Maven

## API Endpoints

| Method | URL | Description |
|--------|-----|-------------|
| GET | /products | Get all products |
| GET | /products/{id} | Get product by ID |
| POST | /products | Create a new product |
| DELETE | /products/{id} | Delete a product |

## How to Run

1. Clone the repository
2. Run `./mvnw spring-boot:run`
3. API will start at `http://localhost:8080`

## Sample Request

POST /products
```json
{
    "name": "Laptop",
    "price": 999.99
}
```

## About
Built as part of Java backend development practice.
Demonstrates REST API design, Spring Boot, JPA repository pattern and dependency injection.
