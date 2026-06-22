# Library Management System using Java, JDBC and MySQL

## Overview

A backend-driven Library Management System developed using Core Java, JDBC, and MySQL. The application manages books, members, and issue records through a menu-driven interface with persistent database storage.

## Features

* Add, View, Update, and Delete Books
* Add and View Members
* Issue Books to Members
* Track Book Availability
* Store Data Persistently in MySQL
* Menu-Driven Console Interface

## Technologies Used

* Java
* JDBC
* MySQL
* Eclipse IDE
* Git & GitHub

## Architecture

The project follows a layered architecture:

* DAO Layer
* Service Layer
* Utility Layer
* Model Layer

  ## Workflow

1. Add Books to the Library
2. Register Members
3. Issue Books to Members
4. Track Issued Books
5. Update Book Availability

   ## Database Schema

Tables:
- books
- members
- issue_records

Relationships:
- issue_records.book_id → books.book_id
- issue_records.member_id → members.member_id

## Database Tables

* books
* members
* issue_records

## Key Highlights

* Developed a backend-driven library management system with real-time data persistence using JDBC and MySQL.
* Designed a normalized database schema for books, members, and issue records with relational mapping.
* Implemented complete CRUD functionality for managing books and members.
* Developed a book issue workflow with status tracking and database updates.
* Used PreparedStatement to prevent SQL injection and improve query performance.
* Structured the application using layered architecture (DAO, Service, Utility) for maintainability and scalability.

## Project Structure

src/
├── app
├── dao
├── model
├── service
└── util

## Author

Subhashini B
