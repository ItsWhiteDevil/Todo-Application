# 📝 Spring Boot Todo Application

A lightweight, fully functional Todo Application built with **Spring Boot**, **Thymeleaf**, **Bootstrap 5**, and **MySQL**. This project demonstrates clean architecture using Spring Web MVC, Hibernate/JPA, and simple Java-based CRUD operations.

---

## ✨ Features

* **Create**: Add tasks instantly via the input form.
* **Read**: Display all pending and completed tasks dynamically.
* **Update (Status)**: Toggle tasks between *Done* and *Pending* with reactive strikethrough styling.
* **Update (Content)**: Edit task titles in real-time using a clean browser prompt window.
* **Delete**: Remove tasks from your database permanently.

---

## 🛠️ Tech Stack

* **Backend**: Java 17+, Spring Boot 3.x, Spring Data JPA, Lombok
* **Frontend**: HTML5, Thymeleaf, Bootstrap 5
* **Database**: MySQL

---

## 🚀 Setup & Installation

### 1. Prerequisites
Ensure you have the following installed on your machine:
* Java Development Kit (JDK 17 or higher)
* Maven 3.x+
* MySQL Server (Running on port `3306`)

### 2. Configure Database
Create a database in your local MySQL instance:
```sql
CREATE DATABASE todo_db;
