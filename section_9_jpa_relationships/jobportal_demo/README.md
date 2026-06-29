# 🔗 Section 9 — JPA Entity Relationships

This section introduces Entity Relationships in Spring Data JPA, covering how to model real-world database associations using JPA annotations. It explores relationship mapping, ownership, fetching strategies, cascading operations, and best practices for designing efficient and maintainable data models.

---

## 📚 Topics Covered

### 🔗 JPA Relationship Mapping

Learn how to model associations between entities and map database relationships using Spring Data JPA.

**Topics covered:**

* Why entity relationships are important
* Foreign Keys and relational databases
* Relationship ownership (Owner vs Inverse Side)
* Bidirectional relationships
* Automatic SQL generation with Hibernate

---

### 🏢 One-to-Many & Many-to-One Relationships

Implement the most common relationship used in enterprise applications through a practical **Company ↔ Job** example.

**Topics covered:**

* `@OneToMany`
* `@ManyToOne`
* `@JoinColumn`
* `mappedBy`
* Relationship navigation
* Parent–child entity mapping

---

### ⚡ Fetch Strategies

Understand how Hibernate loads related entities and how fetch strategies affect application performance.

**Topics covered:**

* Lazy Loading (`FetchType.LAZY`)
* Eager Loading (`FetchType.EAGER`)
* Default fetch types in JPA
* Performance considerations
* Avoiding unnecessary database queries

---

### 🔄 Cascade Operations & Orphan Removal

Manage related entities automatically using JPA cascade operations and orphan removal.

**Topics covered:**

* `CascadeType.PERSIST`
* `CascadeType.MERGE`
* `CascadeType.REMOVE`
* `CascadeType.ALL`
* `orphanRemoval`
* Entity lifecycle management

---

### 🗑️ Database-Level Delete Rules

Explore how database constraints work alongside JPA relationship management.

**Topics covered:**

* `@OnDelete`
* `OnDeleteAction.CASCADE`
* Database-level cascading
* Differences between:

    * `CascadeType`
    * `@OnDelete`
    * `orphanRemoval`

---

## 🛠️ Technologies Used

* ☕ Java
* 🌱 Spring Framework
* 🚀 Spring Boot
* 🗄️ Spring Data JPA
* 🔍 Hibernate ORM
* 🏛️ MySQL

---

## 🎯 Learning Outcomes

After completing this section, you will be able to:

* Design relational data models using JPA entity relationships.
* Implement One-to-Many and Many-to-One associations correctly.
* Understand relationship ownership and bidirectional mappings.
* Optimize entity loading using Lazy and Eager fetching strategies.
* Manage related entities with cascading operations and orphan removal.
* Apply database-level delete behaviors alongside Hibernate mappings.
* Build cleaner, more efficient, and scalable persistence layers for Spring Boot applications.
