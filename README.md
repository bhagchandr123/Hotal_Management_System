### Hotel_Management_System

This project is a Hotel Management System built using Spring Boot. It allows you to perform CRUD (Create, Read, Update, Delete) operations on user data through a set of RESTful endpoints.

## Project Description

The Hotel Management System project provides the following user attributes

    RoomId
    Room Number
    Room Type
    Room Available
    Room Price
    
## Endpoints

The project offers the following RESTful endpoints for managing rooms:

    POST /room: Add a new room.
    POST /rooms : Add a list of new room.
    GET /rooms/id/{id} : Get room By RoomId.
    GET /rooms/price/{price} : Get room By price.
    GET /rooms/price/{price}/And/available : Get available room below price.
    GET /rooms/price/{price}/or/available : Get available room or below price.
    GET /rooms/AC/or/available : Get available room or AC sorted by price.
    DELETE /rooms/ids : Delete room by RoomId.

## Usege    

Once the application is running, you can use a tool like Postman or curl to test the provided endpoints for adding, retrieving, updating, and deleting user information.

![Screenshot 2023-10-23 220601](https://github.com/bhagchandr123/Hotal_Management_System/assets/142751557/d084e139-1771-405b-8f4a-767e9cc97627)



    

