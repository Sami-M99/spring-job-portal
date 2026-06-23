# ⚙️ Section 4 — Spring Boot Essentials

This section focuses on improving Spring Boot development experience by enhancing project structure, introducing API versioning, improving logging, enabling DevTools for productivity, and integrating H2 Database for development and testing.

---

## 🎯 Topics Covered

- 🏗️ Clean project architecture (Feature-based vs Layer-based)
- 🌐 REST API design & API Versioning
- 🧭 Global API prefix configuration
- 📝 Logging customization
- ⚡ Spring Boot DevTools & HotSwap
- 🗄️ H2 Database integration
- 📊 SQL initialization (schema & data scripts)

---

## 🏢 REST API & Project Structure

### 🧱 Architecture Styles

#### ❌ Layer-Based Architecture
- Organized by technical layers (controller, service, repository)
- Simple but not scalable for large systems

#### ✅ Feature-Based Architecture (Recommended)
- Organized by business features (company, job, user)
- Each feature contains its own layers
- Easier to scale and maintain

---

### 📦 Naming Conventions

| Type | Rule | Example |
|------|------|--------|
| Package | Singular lowercase | `company`, `job` |
| API | Plural resources | `/api/companies` |

---

### 🌐 Global API Prefix

Instead of repeating `/api` in every controller:

```java
configurer.addPathPrefix("/api", _ -> true);
```

✔ Result:
```
/api/companies
```

---

### 🔖 API Versioning

Example:
```
Accept: application/vnd.sami+json;v=1.0
```

Default version is used if not specified.

---

## 📝 Logging in Spring Boot

### 🎯 Why Customize Logs?

- Improve readability
- Add colors
- Make debugging easier

### ⚙️ Console Pattern

```properties
logging.pattern.console=${CONSOLE_LOG_PATTERN:%d{HH:mm:ss.SSS} %-5level [%thread] %logger{15} - %msg%n}
```

---

## ⚡ Spring Boot DevTools

### 🎯 Purpose

- Auto restart
- Fast development cycle

### ❌ Without DevTools
Edit → Build → Restart → Test

### ✅ With DevTools
Edit → Save → Auto Restart

---

### ⚡ HotSwap

- Instant changes without restart
- Limited to small code edits

---

## 🗄️ H2 Database

### 💡 Overview

- In-memory lightweight database
- Used for development/testing only

---

### 🌐 Console

http://localhost:8080/h2-console

Default:
- username: sa
- password: (empty)

---

### ⚙️ Config

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.h2.console.enabled=true
spring.sql.init.mode=embedded
```

---

### 🧱 SQL Initialization

- schema.sql → create tables
- data.sql → insert data

Order:
schema.sql → data.sql

---

### 💾 File-Based Mode

```properties
spring.datasource.url=jdbc:h2:file:~/jobportal
```

Data persists after restart.

---

### ⚠️ Important

Using:
spring.sql.init.mode=always

may cause duplicate data issues.

---

## 🚀 Summary

- Clean architecture design
- REST API versioning
- Logging customization
- DevTools productivity boost
- H2 Database integration
