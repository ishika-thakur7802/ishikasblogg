# ✍️ ishikasblogg

A personal blogging platform built with **Spring Boot** and **React**, designed with simplicity and aesthetics in mind. It supports content creation, reading, and theme switching — with plans for robust role-based access, JWT authentication, and more.

---

## 🚀 Features Implemented

### 🔧 Backend (Spring Boot 3)
- RESTful APIs for blog operations
- MySQL database integration
- CORS configuration
- Deployed on Railway

### 🌐 Frontend (React)
- Dynamic blog listing and detail view
- Dark/Light theme toggle with persistent theme mode
- Hero section with a sticky IntelliJ-like terminal navbar

### 📦 Deployment
- Frontend and Backend deployed on [Railway](https://railway.app)
- MySQL hosted using Railway’s managed service

---

## 📌 Future Plans

- 🔐 **RBAC (Role-Based Access Control)**  
  Admins can create/update/delete posts, users can only read.

- 🛡️ **JWT Authentication**  
  Secure login/signup with token-based authentication.

- 📄 **Pagination & Search**
  Optimized blog browsing experience.

- ✍️ **Blog CMS**
  Dashboard for blog creation/editing via UI.

- 🗃️ **Comment System**
  Allow logged-in users to post and view comments.

---

## 🛠️ Tech Stack

| Layer       | Tech                         |
|-------------|------------------------------|
| Frontend    | React, Tailwind CSS, Axios   |
| Backend     | Spring Boot 3, Spring MVC, Spring Data JPA |
| Security    | (Planned) Spring Security, JWT |
| Database    | MySQL (hosted on Railway)    |
| Deployment  | Railway                      |

---

## 🧑‍💻 Local Setup

### Backend

```bash
cd backend
./mvnw spring-boot:run

