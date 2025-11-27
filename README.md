📚 Book Store Management System

A simple and efficient Spring Boot application to manage books, customers, and orders using MySQL, Thymeleaf, and Spring Data JPA.

🚀 Features

📘 Add, Update, Delete Books

🔍 Search Books by title, author, or category

🧾 View Book Details

🗃️ Manage Book Inventory

🎨 Frontend using Thymeleaf Templates

🗄️ Database Integration with MySQL

🔄 CRUD operations using Spring Data JPA

🛠️ Technologies Used
Technology	Purpose
Spring Boot	Backend framework
Spring MVC	Request handling
Spring Data JPA	ORM & database access
Thymeleaf	Frontend templates
MySQL	Database
Bootstrap (optional)	UI styling
🗂️ Project Structure
book-store-management/
│
├── src/
│   ├── main/
│   │   ├── java/com/bookstore/
│   │   │   ├── controller/
│   │   │   ├── entity/
│   │   │   ├── repository/
│   │   │   └── service/
│   │   └── resources/
│   │       ├── templates/
│   │       ├── static/
│   │       └── application.properties
│
├── pom.xml
└── README.md

⚙️ Setup Instructions
1️⃣ Clone the Repository
git clone https://github.com/Saipavantadela/book-store-management.git

2️⃣ Configure MySQL

Create a database:

CREATE DATABASE bookstore;


Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/bookstore
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

▶️ Run the Application

Use Maven command:

mvn spring-boot:run


Or run from STS/IntelliJ.

📁 API / URL Endpoints
Method	Endpoint	Description
GET	/	Home page
GET	/books	View all books
GET	/books/add	Add book form
POST	/books	Save new book
GET	/books/edit/{id}	Edit book
POST	/books/{id}	Update book
GET	/books/delete/{id}	Delete book
👨‍💻 Author

Saipavan Tadela
📧 Your email :saipavanyadav26@gmail.com
⭐ If you like this project, give it a star on GitHub!