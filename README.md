# Web-Quize-Engine
Simple RESTful service for working with quizzes


#### Run application

./mvnw spring-boot:run

#### Register a user

URL: /register

Request-Type: POST

Content-Type: application json

Example: curl -H "Content-Type: application/json" -d '{"username": "test_user", "password": "test_password"}' -X POST http://localhost:8080/register


### Create a quiz

URL : /api/quizzes

Request-Type: POST

Content-Type: application/json

Example: curl --user test_user:test_password -H "Content-Type: application/json" -d '{"title": "Java Logo", "text": "What is pictured on the Java logo ?", "options": ["Cup of coffee", "Elephant", "Snake"], "answer":0}' -X POST http://localhost:8080/api/quizzes


### Get all quizzes

URL : /api/quizzes

Request-Type: GET


### Get a quiz by id

URL : /api/quizzes/{id}

Request-Type: GET


### Solve a quiz

To solve a quiz you need to send POST request with request param named answer

URL : /api/quizzes/{id}/solve

Request-Type: POST

Request-Params: answer

Request example: curl --user test_user:test_password -d "answer=0" -X POST http://localhost:8080/api/quizzes/0/solve
Response example: {"success":true,"feedback":"Congratulations, you're right!"}
