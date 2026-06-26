# 📬 Section 7 — Contact API Development

This section focuses on building a complete REST API feature from scratch by implementing a **Contact Us** module. You'll learn how to design application layers, create database entities, persist data using Spring Data JPA, generate database schemas automatically with Hibernate, and test APIs from both backend and frontend perspectives.

---

## 📚 Topics Covered

### 🏗️ REST API Architecture

* Designing feature-based application structure
* Layered architecture implementation:

  * Controller Layer
  * Service Layer
  * Repository Layer
  * Entity Layer
* Request processing workflow

### 🧬 Entity Development

* Creating JPA entities
* Database table mapping
* Working with:

  * `@Entity`
  * `@Table`
  * `@Column`
  * `@Id`
  * `@GeneratedValue`
  * `@Lob`
* Managing entity metadata and audit fields

### 📦 DTO Pattern

* Request DTO creation
* Separating API contracts from database entities
* Using Java Records for data transfer
* Clean API design principles

### 🗄️ Repository Layer

* Creating JPA repositories
* CRUD operations with Spring Data JPA
* Database access abstraction
* Repository integration with services

### ⚙️ Service Layer Implementation

* Business logic organization
* Entity transformation and mapping
* Data persistence workflows
* Dependency injection with Lombok

### 🎮 REST Controllers

* Creating REST endpoints
* Handling HTTP POST requests
* Request body processing
* ResponseEntity usage
* HTTP status code management

### 🏛️ Hibernate Schema Generation

* Automatic database schema creation
* Understanding Hibernate DDL Auto
* Working with:

  * `create`
  * `create-drop`
  * `create-only`
  * `update`
  * `validate`
  * `none`
* Development vs Production considerations

### 🧪 API Testing

* Testing endpoints with Postman
* Request and response validation
* Database verification
* End-to-end testing workflow

### 🖥️ Frontend Integration

* Connecting UI forms to REST APIs
* Request submission workflow
* Backend persistence verification
* Full-stack feature testing

### ⚡ Productivity Tools

* Generating Entities using JPA Buddy
* Repository generation
* DTO generation
* IntelliJ IDEA database tools

---

## 🎯 Key Learning Outcomes

By completing this section, you will be able to:

* Build complete REST API features from scratch
* Design clean layered Spring Boot applications
* Create and manage JPA entities
* Implement repositories, services, and controllers
* Generate database schemas automatically using Hibernate
* Apply DTO-based API design
* Test APIs using Postman and frontend applications
* Understand the full request lifecycle from UI to database

---

## 🛠️ Technologies & Tools

* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* REST APIs
* Lombok
* Postman
* JPA Buddy
* IntelliJ IDEA

---

## 📁 Source Code

This section contains a complete Contact Us feature implementation, demonstrating REST API development, Hibernate schema generation, database persistence, and end-to-end testing in a real-world Spring Boot application.
