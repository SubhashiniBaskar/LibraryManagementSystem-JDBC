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

## Screenshots

## Main Menu
<img width="362" height="202" alt="main-menu" src="https://github.com/user-attachments/assets/780de521-a03d-4655-81fc-01db1cbaf699" />

## View Books
<img width="405" height="107" alt="view-books" src="https://github.com/user-attachments/assets/cb0036ac-1418-471d-a55b-d3a687ba1cb0" />

## View Members
<img width="450" height="110" alt="view-members" src="https://github.com/user-attachments/assets/4322ca2a-cb85-4d39-b18d-c49200bbd8f5" />

## Issue Book
<img width="276" height="96" alt="issue-book" src="https://github.com/user-attachments/assets/eb7ee41a-d026-40e2-8efe-4d36173112ff" />

## Database Tables 
<img width="506" height="297" alt="database-tables" src="https://github.com/user-attachments/assets/a69d6949-6f12-4ef8-8119-5b21c3d1cc95" />


