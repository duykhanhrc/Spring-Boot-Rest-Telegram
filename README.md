# Sample REST CRUD API with Spring Boot for Sending Message 

## Steps to Setup

**1. Clone the application**

**2. Create Mysql database**
```bash
create database user_database
```

**3. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`

+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

**4. Build and run the app using maven**

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8080>.

## Explore Rest APIs

The app defines following CRUD APIs.

    GET /api/v1/users
    
    POST /api/v1/users
    
    GET /api/v1/users/{userId}
    
    PUT /api/v1/users/{userId}
    
    DELETE /api/v1/users/{userId}

## For demonstration about creating api for sending message

Check this API:

    POST /api/v1/telegramBotSendtext

Refer code in: src\main\java\com\staxrt\tutorial\controller\TelegramController.java

Here is video for proof

![POC](ss\springbotmessage.gif)