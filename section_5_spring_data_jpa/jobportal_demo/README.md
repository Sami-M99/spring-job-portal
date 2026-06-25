# 🗄️ Section 5 — Spring Data JPA

This section introduces modern database development with **Spring Data JPA**, covering ORM fundamentals, entity modeling, repositories, DTO pattern, Lombok, and CORS configuration.

Instead of writing repetitive JDBC code and manual SQL queries, Spring Data JPA enables developers to work with databases using Java objects and repository interfaces, significantly improving productivity and maintainability.

---

## 📚 Topics Covered

### 🏛️ Spring Data JPA Fundamentals

* Understanding the limitations of traditional JDBC
* Introduction to Spring Data and Spring Data JPA
* JPA vs Hibernate vs Spring Data JPA
* ORM (Object Relational Mapping) concepts
* Spring Data JPA architecture and workflow

### 🗄️ Entity Modeling

* Creating JPA Entities
* Mapping Java classes to database tables
* Working with:

  * `@Entity`
  * `@Table`
  * `@Column`
  * `@Id`
  * `@GeneratedValue`
  * `@Lob`
* Database-to-Java type mapping

### 📦 Repository Layer

* Repository architecture
* Understanding:

  * `Repository`
  * `CrudRepository`
  * `PagingAndSortingRepository`
  * `JpaRepository`
* CRUD operations using Spring Data JPA
* Pagination and sorting basics

### 🏗️ Service Layer Integration

* Service layer responsibilities
* Constructor-based dependency injection
* Clean application architecture:

  * Controller → Service → Repository

### 🚀 REST API Integration

* Returning database records through REST endpoints
* JSON serialization of entities
* End-to-end request flow from database to API response

### ⚡ Lombok

* Reducing boilerplate code
* Using:

  * `@Getter`
  * `@Setter`
  * `@RequiredArgsConstructor`
  * `@NoArgsConstructor`
  * `@AllArgsConstructor`
  * `@Data`
* Lombok with Spring Boot applications
* Annotation processing configuration

### 🔄 DTO Pattern

* Data Transfer Object (DTO) design
* Separating API contracts from database entities
* Protecting sensitive data
* Reducing response payload size
* Entity-to-DTO mapping
* Java Records for immutable DTOs
* Stream API mapping techniques

### 🌐 CORS Configuration

* Understanding Cross-Origin Resource Sharing (CORS)
* Same-Origin Policy
* Preflight Requests (`OPTIONS`)
* Using:

  * `@CrossOrigin`
  * Global CORS Configuration
  * `CorsFilter`
* CORS with Spring Security
* Production best practices

---

## 🎯 Key Learning Outcomes

By completing this section, you will be able to:

* Build database-driven applications using Spring Data JPA
* Design and map JPA entities correctly
* Create repositories with minimal code
* Implement service-oriented architecture
* Use Lombok to simplify Java classes
* Apply DTO pattern for clean API design
* Configure and manage CORS in Spring Boot applications
* Understand how Spring Data JPA, Hibernate, JDBC, and databases work together

---

## 🛠️ Technologies & Tools

* Spring Boot
* Spring Data JPA
* Hibernate
* H2 Database
* Lombok
* REST APIs
* Java Streams
* DTO Pattern
* CORS Configuration

---

## 📁 Source Code

This section contains practical examples demonstrating how to build modern Spring Boot applications using Spring Data JPA, clean architecture principles, DTO mapping, and REST API development.
