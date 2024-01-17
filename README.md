# UserProductManagement

## About the Project
This project is a simple Java application that includes user management and product inventory. It's developed using Spring Boot and managed with Maven.

## Features
- User Management
  - View the list of users
  - Add, delete, update users
- Product Management
  - View the list of products
  - View a specific product
  - Add, delete, update products

## Technologies Used
- Java
- Spring Boot
- Maven

## Installation
1. Clone the project to your computer.
2. Install project dependencies with Maven: `mvn clean install`
3. Run the application: `mvn spring-boot:run`
4. Open your browser and go to `http://localhost:8080`.

## API Endpoints
- Users: `/users/all`
- Products: `/products/all`, `/products/{productId}`

## Contributing
1. Fork this repository.
2. Create a new branch: `git checkout -b feature/new-feature`
3. Make your changes and commit them: `git commit -m 'Added a new feature'`
4. Push your branch to your fork: `git push origin feature/new-feature`
5. Create a pull request.
