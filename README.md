# Student Management REST API

## Project Description
A Student Management REST API developed using Java and Spring Boot. This project allows users to manage student records using REST API endpoints.

## Technologies Used
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Postman

## Features
- Add a new student
- View all students
- Update student details
- Delete a student
- Validate student name and course fields
- Store student records in a MySQL database

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/students` | View all students |
| POST | `/students` | Add a student |
| PUT | `/students/{id}` | Update student details |
| DELETE | `/students/{id}` | Delete a student |

## Sample Request

POST `/students`

```json
{
  "id": 101,
  "name": "Arun",
  "course": "Java"
}
```

## Database
MySQL is used to store student records. Spring Data JPA handles database operations.

## Testing
The REST API endpoints were tested using Postman.

## Learning Outcomes
- Building REST APIs using Spring Boot
- Implementing CRUD operations
- Connecting Spring Boot with MySQL
- Using Spring Data JPA
- Testing APIs using Postman
