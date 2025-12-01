# 🎓 University Management System (UMS)

A complete **Spring Boot + MySQL backend application** to manage Students, Departments, Profiles, and Courses.  
Designed with real-time industry standards including layered architecture, DTOs, validation, exception handling, and JWT security.

---

## 🚀 Features

### 👨‍🎓 Student Management
- Create, update, delete students
- Assign department
- Add / remove courses
- Manage student profile (One-to-One)

### 🏢 Department Management
- Full CRUD operations
- Fetch all students in a department

### 📘 Course Management
- Create, update, delete courses
- Students can enroll in multiple courses (Many-to-Many)

### 🔗 Entity Relationships
- **One-to-One** → Student ↔ Profile  
- **Many-to-One** → Student ↔ Department  
- **One-to-Many** → Department ↔ Students  
- **Many-to-Many** → Student ↔ Course  

### 🛡️ Security (JWT)
- User registration & login
- Access token & refresh token
- Secure role-based endpoints

### ⚙️ Additional Features
- DTOs for cleaner API responses
- Global exception handling
- Bean validation
- Pagination & sorting
- Swagger API documentation

---

## 🧩 Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Data JPA (Hibernate)**
- **MySQL**
- **Lombok**
- **ModelMapper**
- **Spring Security + JWT**
- **Swagger / OpenAPI**
- **JUnit & Mockito**
- **Maven**

---

## 📁 Project Structure

```bash
com.ums
├── controller
├── service
│ └── impl
├── repository
├── entity
├── dto
│ ├── request
│ └── response
├── exception
├── config
└── UniversityManagementSystemApplication.java
---

## 🔧 Setup & Run

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/your-username/university-management-system.git
```

