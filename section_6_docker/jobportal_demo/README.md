# 🐳 Section 6 — Databases with Docker

This section introduces Docker fundamentals for backend developers and demonstrates how to run and manage databases inside containers. You'll learn how to connect Spring Boot applications to MySQL running in Docker, manage persistent storage, and automate environment setup using Docker Compose.

---

## 📚 Topics Covered

### 🐳 Docker Fundamentals

* What Docker is and why it is used
* Solving environment consistency problems
* Docker architecture and workflow
* Containerization concepts
* Docker lifecycle overview

### 📦 Core Docker Concepts

* Docker Images
* Docker Containers
* Docker Volumes
* Dockerfile
* Docker Hub & Registries
* Port Mapping

### 🐬 Running MySQL with Docker

* Pulling and running MySQL containers
* Environment variables configuration
* Port exposure and connectivity
* Creating databases inside containers
* Connecting database clients to Dockerized MySQL

### 🗄️ Spring Boot + MySQL Integration

* Replacing H2 Database with MySQL
* Configuring JDBC connection properties
* Environment-based database configuration
* SQL logging and Hibernate configuration
* Connecting Spring Data JPA to MySQL

### 💾 Persistent Storage with Volumes

* Understanding container data persistence
* Data loss when containers are removed
* Using Docker Volumes
* Bind Mounts vs Named Volumes
* Database persistence best practices

### 📝 Database Initialization

* Creating database schemas
* Executing SQL scripts
* Loading sample data
* Managing tables and records

### 🚀 Docker Compose

* Multi-container application management
* Creating `compose.yml`
* Defining services and configurations
* Environment variables management
* Volume and network configuration

### ⚙️ Spring Boot Docker Compose Support

* Spring Boot Docker Compose integration
* Automatic container startup and shutdown
* Lifecycle management configuration
* Compose commands and workflows

---

## 🎯 Key Learning Outcomes

By completing this section, you will be able to:

* Understand Docker fundamentals and containerization concepts
* Run MySQL databases inside Docker containers
* Configure Spring Boot applications to use MySQL
* Persist database data using Docker Volumes
* Manage application environments with Docker Compose
* Automate local development setup
* Build portable and reproducible backend environments

---

## 🛠️ Technologies & Tools

* Docker
* Docker Compose
* MySQL
* Spring Boot
* Spring Data JPA
* Hibernate
* JDBC
* SQL Scripts

---

## 📁 Source Code

This section contains practical examples demonstrating Docker-based database environments, MySQL container management, persistent storage configuration, and Spring Boot integration using Docker Compose.
