                                                                          🎬 Book My Ticket – Movie Ticket Booking Application

Book My Ticket is a full-stack movie ticket booking web application built using Spring Boot and Thymeleaf. The project allows users to browse movies, view shows, select seats, and book tickets. It also includes image management, temporary data handling, and persistent storage using modern backend technologies.

🚀 Features

User-friendly movie ticket booking flow

Browse movies and available shows

Seat selection and ticket booking

Image upload and management using Cloudinary

Temporary data storage using Redis

Persistent data storage using MySQL

Server-side rendering with Thymeleaf

Clean MVC architecture (Controller–Service–Repository)

Technologies Used
Backend

Java 17

Spring Boot

Spring MVC

Spring Data JPA

Redis Template

Frontend

Thymeleaf

HTML5

CSS3

Bootstrap (if used)

Database & Storage

MySQL – main relational database

Redis – temporary data storage (sessions / booking flow)

Cloudinary – image storage (movie posters, banners)

Tools

Maven – dependency management

Git & GitHub – version control

Postman – API testing (if applicable)

🏗️ Project Architecture

The application follows a layered architecture:

Controller Layer
Handles HTTP requests and responses, interacts with the service layer, and returns Thymeleaf views.

Service Layer
Contains business logic such as booking validation, seat availability checks, and Redis interactions.

Repository Layer
Communicates with the MySQL database using Spring Data JPA.

⚙️ Application Configuration
Database Configuration (MySQL)
spring.datasource.url=jdbc:mysql://localhost:3306/book_my_ticket
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Redis Configuration
spring.redis.host=localhost
spring.redis.port=6379
Cloudinary Configuration
cloudinary.cloud-name=YOUR_CLOUD_NAME
cloudinary.api-key=YOUR_API_KEY
cloudinary.api-secret=YOUR_API_SECRET

How to Run the Project

Clone the repository

git clone https://github.com/Atmanandina/Book-My-Ticket-SpringBoot-Project.git

Open the project in IntelliJ IDEA / Eclipse / VS Code

Configure:

MySQL database

Redis server

Cloudinary credentials

Run the application

mvn spring-boot:run

Open the browser and visit

http://localhost:8080
📂 Database Design (Overview)

User – stores user details

Movie – movie information

Show – show timings and screens

Seat – seat availability

Booking – ticket booking details

Future Enhancements

Online payment gateway integration

User authentication & authorization (Spring Security)

Admin dashboard for managing movies and shows

Email/SMS booking confirmation

REST API version of the application

Author

Atmanand Inamati
Computer Science Student
GitHub: https://github.com/Atmanandina

⭐ If you like this project, feel free to star the repository!
