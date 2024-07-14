# Users Project

## Table of Contents
-----------------
### 1. Description
### 2. Project Structure
### 3. Installation and Setup
### 4. Steps to Run
### 5. Endpoints
### 6. Technologies Used
### 7. License

## 1. Description
-------------
This project implements a RESTful API for managing user groups and events using Spring Boot and Hibernate. It provides endpoints for CRUD operations on user groups and their associated events.

## 2. Project Structure
---------------------
````bash
Users/
├── src/
│   ├── main/
│   │   ├── java/com/example/Users/
│   │   │   ├── model/
│   │   │   │   ├── User.java
│   │   │   │   ├── Group.java
│   │   │   │   ├── Event.java
│   │   │   │   └── GroupRepository.java
│   │   │   ├── web/
│   │   │   │   └── GroupController.java
│   │   │   ├── UsersApplication.java
│   │   │   └── Initializer.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── data.sql
├── target/
├── pom.xml
````

## 3. Installation and Setup
--------------------------
Prerequisites:
- Java Development Kit (JDK) 8 or higher
- Maven

## 4. Steps to Run
---------------
1. Clone the repository:
   git clone <repository_url>

2. Navigate to the project directory:
   cd Users

3. Build the project:
   mvn clean install

4. Run the application:
   java -jar target/Users-0.0.1-SNAPSHOT.jar

5. Access the application at http://localhost:8080

## 5. Endpoints
------------
Groups:
- GET /api/groups: Retrieves all groups.
- GET /api/group/{id}: Retrieves a group by ID.
- POST /api/group: Creates a new group.
- PUT /api/group/{id}: Updates an existing group.
- DELETE /api/group/{id}: Deletes a group by ID.

Events:
- GET /api/events: Retrieves all events.
- GET /api/event/{id}: Retrieves an event by ID.
- POST /api/event: Creates a new event.
- PUT /api/event/{id}: Updates an existing event.
- DELETE /api/event/{id}: Deletes an event by ID.

## 6. Technologies Used
---------------------
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database (for development)

## 7. License
----------
This project is licensed under the MIT License. See the LICENSE file for details.
