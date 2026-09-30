# Library Management System

A beginner-friendly Java web application using:

- Java 17
- Maven
- JSP
- Servlets
- MVC architecture
- JDBC
- MySQL
- Apache Tomcat 10.1+

## Architecture

Browser → JSP → Servlet → Service → DAO → JDBC → MySQL

## Features

- Admin login/logout
- Book management
- Member management
- Issue book
- Return book
- Fine calculation
- MySQL database

## Setup

1. Install JDK 17+, Maven, MySQL 8+, and Tomcat 10.1+.
2. Create the database by running `database/schema.sql`.
3. Edit the database username/password in:
   `src/main/java/com/library/util/DBConnection.java`
4. From the project folder run:

```bash
mvn clean package
```

5. Deploy `target/library.war` to Tomcat.
6. Open:

`http://localhost:8080/library/`

Demo login:

- Username: `admin`
- Password: `admin123`

> The demo password is stored as plain text only for learning. Use BCrypt/Argon2 before production use.

## GitHub

Do not upload passwords, IDE settings, `target/`, or compiled files.
