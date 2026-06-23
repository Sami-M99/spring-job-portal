# 🧩 Section 02 - Spring Beans Deep Dive

## 🎯 Overview

This section explores advanced Spring Bean management, including bean creation strategies, dependency injection, bean lifecycle management, scopes, autowiring techniques, and advanced bean registration mechanisms.

## 📚 Topics Covered

### 🏗️ Bean Creation & Registration

* Creating Beans using `@Bean`
* Creating Beans using `@Component`
* Component Scanning with `@ComponentScan`
* Programmatic Bean Registration
* Bean Naming & Aliasing

### 🎯 Bean Selection & Resolution

* Handling Multiple Beans of the Same Type
* `@Primary`
* `@Qualifier`
* Bean Ambiguity Resolution
* `NoUniqueBeanDefinitionException`

### 🔗 Dependency Injection & Wiring

* Bean Wiring Concepts
* Autowiring with `@Autowired`
* Field Injection
* Setter Injection
* Constructor Injection (Recommended)
* Optional Dependencies
* Circular Dependency Overview

### ⚙️ Bean Lifecycle Management

* Bean Initialization Process
* `@PostConstruct`
* `InitializingBean`
* `@PreDestroy`
* `DisposableBean`
* Bean Lifecycle Phases

### 📦 Bean Scopes

* Singleton Scope
* Prototype Scope
* Eager Initialization
* Lazy Initialization (`@Lazy`)
* Stateful vs Stateless Beans

### 🏛️ Spring Stereotype Annotations

* `@Component`
* `@Service`
* `@Repository`
* `@Controller`
* `@RestController`

### 🔄 Advanced Bean Configuration

* `@DependsOn`
* Bean Registration via `BeanRegistrar`
* Dynamic Bean Creation
* Environment-Based Bean Registration

## 🛠️ Technologies Used

* Java
* Spring Framework
* Spring Core
* Maven
* Jakarta Annotations

## 🚀 Learning Outcomes

After completing this section, you will be able to:

* Create and manage Spring Beans using multiple approaches.
* Configure dependency injection using industry best practices.
* Resolve bean conflicts with `@Primary` and `@Qualifier`.
* Understand the complete Spring Bean lifecycle.
* Apply Singleton and Prototype scopes appropriately.
* Implement clean and maintainable application architecture.
* Perform advanced bean registration and configuration.

## 📂 Source Code

The examples in this section demonstrate:

* Bean creation using `@Bean` and `@Component`.
* Component scanning and stereotype annotations.
* Dependency Injection and Autowiring techniques.
* Bean lifecycle callbacks.
* Bean scope management.
* Advanced bean registration and configuration patterns.

---

⭐ This section provides a deep understanding of Spring's IoC Container, Bean Management, Dependency Injection, and Lifecycle mechanisms, forming the foundation for building scalable Spring applications.
