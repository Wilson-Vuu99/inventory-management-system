# Inventory Management System

## Overview
The Inventory Management System is a web application developed using **Spring Boot** and **Java** that enables efficient tracking and management of inventory levels. This application provides features for managing products, tracking stock levels, and user authentication, ensuring a seamless experience for users.

## Features
- **User Authentication**: Secure login and registration for different user roles (admin, user).
- **Inventory Management**: Add, update, delete, and view inventory items.
- **RESTful APIs**: Provides endpoints for seamless integration with front-end applications and third-party services.
- **Data Storage**: Utilizes a **MySQL** database for data persistence and management.
- **Testing**: Comprehensive unit and integration testing to ensure reliability and performance.

## Technologies Used
- **Backend**: 
  - Java
  - Spring Boot
  - Spring Security
  - JPA (Hibernate)
- **Database**: 
  - MySQL
- **Frontend**: 
  - Thymeleaf (or specify other technologies if used)
- **Testing**: 
  - JUnit
- **Development Tools**:
  - Maven
  - Git

## Getting Started
To get a local copy of the Inventory Management System up and running, follow these steps:

### Prerequisites
- Java 11 or higher
- MySQL server
- Maven

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/inventory-management-system.git
   
2. Navigate to the project directory
   cd inventory-management-system

3.Update your database connection settings in 
  ```bash
  src/main/resources/application.properties
  spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
  spring.datasource.username=your_username
  spring.datasource.password=your_password
4.Start the application:
  ```bash
  mvn spring-boot:run
