# Inventory Management System

## Project Description
The Inventory Management System is a web application that allows users to manage inventory items, including categories, products, suppliers, and stock levels. The application is built using Spring Boot and provides a RESTful API for managing inventory data.

## Features
- Manage categories of products
- Add, update, and delete products
- Track suppliers and stock levels
- User authentication and authorization

## Technologies Used
- **Backend**: 
  - Java
  - Spring Boot
  - Spring Security
  - JPA (Hibernate)
- **Database**: 
  - MySQL
- **Testing**: 
  - JUnit
- **Development Tools**:
  - Maven
  - Git
  - Docker

## Launching the Inventory Management System with Docker

Follow these steps to launch the Inventory Management System using Docker:

### Prerequisites
- Ensure you have Docker installed on your machine. You can download it from [Docker's official website](https://www.docker.com/get-started).
- Clone the repository to your local machine.

### Steps to Launch

1. **Navigate to the Project Directory**:
   Open your terminal and navigate to the directory where the project is located:
   ```bash
   cd path/to/your/inventory-management-system
2. **Build the Docker Image**: 
    Use the following command to build the Docker image for  the application:
    ```bash
    docker build -t inventory-management-system .
3. **Run the Database Container Start a MySQL container**: 
    You can run the following command to create and start a MySQL container with a     specified database name
    ```bash
    docker run --name mysql-db -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=inventoryDB-p 3306:3306 -d mysql:8.0   
4. Run the Application Container After the MySQL container is running, you can start the Inventory Management System container using:
    ```bash
    docker run --name inventory-app --link mysql-db:mysql -p 8080:8080 -d inventory-management-system
5. Access the Application Once the application is running, you can access it at http://localhost:8080/api/categories. Use a tool like Postman or CURL to test the endpoints.
    ```bash 
    http://localhost:8080/api/categories
6. **Stop and Remove Containers (Optional)** If you want to stop and remove the containers after testing, you can run: 
    ```bash
    docker stop inventory-app
    docker rm inventory-app
    docker stop mysql-db
    docker rm mysql-db

### Note

Ensure that you have set up your Dockerfile correctly to include all necessary dependencies for your Spring Boot application.
The application is set to use MySQL with default credentials (root as username and password).

    




