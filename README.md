# Cafe Management System

Cafe Management System is a retail management system  that handles basic cafe operations efficiently.

Features/Functions
Admin/user sign in system using JWT authentication
Forgot password and user verification mailing system using Spring Mailer
Dashboard: displays summary of the categories, products, and bills
CRUD operations to manage categories, products, bills, and staff
Create and edit categories and products
Create customer orders and download them as a PDF bill
Create, download, and delete bills
All data is submitted in the front-end via forms, sent to the backend through POST/GET requests, and saved to corresponding tables in the SQL database. Error handling is implemented in the backend and all unauthorized access will be redirected to the home page through an Angular routing guard and interceptor.

Tech Stack
Front-end: Angular/Typescript with Material UI
Backend: Spring Boot/Java
Database: MySQL

