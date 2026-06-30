# 🔐 Section 10 — Spring Security Essentials

This section explains the internal authentication architecture of Spring Security and how authentication requests are processed before reaching your application. It introduces the core security components, their responsibilities, and the complete authentication lifecycle, providing the foundation needed for advanced topics such as JWT, OAuth2, and custom authentication.

---

## 📚 Topics Covered

### 🔄 Spring Security Authentication Flow

Understand how every secured request travels through Spring Security before reaching your controllers.

**Topics covered:**

- Authentication request lifecycle
- Public vs secured endpoints
- Authentication processing pipeline
- SecurityContext and session management
- Form Login vs HTTP Basic authentication

---

### 🛡️ Security Filters

Learn how Spring Security intercepts and processes incoming HTTP requests.

**Topics covered:**

- Security Filter Chain
- Request interception
- Authentication initiation
- Built-in security filters
- Filter responsibilities

---

### 🔑 Authentication Components

Explore the core interfaces responsible for authentication.

**Topics covered:**

- Authentication object
- AuthenticationManager
- ProviderManager
- AuthenticationProvider
- DaoAuthenticationProvider

---

### 👤 User Management

Understand how Spring Security loads and manages users.

**Topics covered:**

- UserDetails
- UserDetailsService
- UserDetailsManager
- Loading users from different sources
- User representation inside Spring Security

---

### 🔒 Password Security

Learn how passwords are securely stored and verified.

**Topics covered:**

- PasswordEncoder
- Password hashing
- Password verification
- Secure credential storage
- Hash-based authentication

---

### 🍪 SecurityContext & Session Management

Discover how authenticated users are maintained across requests.

**Topics covered:**

- SecurityContext
- Session-based authentication
- JSESSIONID
- Authentication persistence
- User identity management

---

### 🌐 Authentication Mechanisms

Compare the two most common authentication approaches supported by Spring Security.

**Topics covered:**

- Form Login flow
- HTTP Basic flow
- UsernamePasswordAuthenticationFilter
- BasicAuthenticationFilter
- Authentication workflow comparison

---

## 🛠️ Hands-on Practice

Throughout this section, you will build and explore:

- Spring Security authentication flow
- Security Filter Chain execution
- AuthenticationManager and AuthenticationProvider
- UserDetailsService integration
- PasswordEncoder implementation
- SecurityContext lifecycle
- Session-based authentication
- Form Login and HTTP Basic authentication

---

## 🎯 Learning Outcome

By the end of this section, you'll understand how Spring Security performs authentication internally, how its core components collaborate during every request, and how this architecture serves as the foundation for implementing custom authentication, JWT, OAuth2, and advanced security features in Spring Boot applications.