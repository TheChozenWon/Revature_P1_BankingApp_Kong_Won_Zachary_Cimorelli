# P1_BankingApp_Kong_Won_Zachary_Cimorelli
Revature paid training first team project

Due/presents on 12/4/2026

This README.md will explain:

1. The application purpose
2. Features (customer and employee)
3. Technologies used
4. Project architecture
5. PostgreSQL database design (with schema or ER diagram)
6. MongoDB database design (collections, sample documents, indexes)
7. Why each type of data is stored in the database it is
8. How cross-database references and consistency are handled
9. Configuration process
10. How employee accounts are created or seeded
11. Setup and run instructions (including starting both databases)
12. Test instructions
13. DAO implementation
14. Known limitations
15. Optional enhancements completed
    
There are no commits on passwords, credentials, or private database connection values to the repository.

Key notes:
1. A backend-focused project to build a console-based banking application using Java
2. After finishing the project, we test and make screenshots and take key notes of our project.
3. 5 layers to go through and check with when building our project
4. We will use maven, push/commit changes every 2 days
5. For moongoDB, it that stores employee notes and activity logs.
6. Connection URLs, usernames, and passwords must come from configuration and not source code
7. We'll do command line for user interations


Steps to finish (break down the work from beginning to end):
1. Set up the jave maven project and put in the classes and models
2.
3.
4.
5.

Kong's roles:
1. Application models
2.MongoDB (via the MongoDB Java Driver)
3.
4.
5.

Zach's roles:
1. Setup project (Maven)
2.
3.
4.
5.


Project Requirements Checklist:
1. Project is built as a Java application using Maven or Gradle and follows a clean, organized package structure with appropriate separation of concerns. (When each requirement is met, do (check) to know that part is done)
2. Application implements appropriate object-oriented design using well-defined model classes and follows the layered architecture (Presentation, Service, Data Access, Model, and Configuration). ()
3. Application uses PostgreSQL (via JDBC) for customers, employees, accounts, and transactions, and MongoDB (via the MongoDB Java Driver) for employee account notes and activity logs, with each accessed only through DAO interfaces. ()
4. Application supports two roles (customer and employee) and enforces role-based access to features and data. ()
5. Employee features include customer/account lookup, wire transfers with a required note, freezing/unfreezing accounts, creating and filtering account notes, flagging suspicious activity, and viewing activity logs. ()
6. Significant employee actions are automatically recorded in MongoDB activity logs. ()
7. Operations spanning both databases follow a defined, documented consistency strategy in which PostgreSQL remains the system of record. ()
8.Application implements all user stories while enforcing appropriate business rules, validation, and exception handling. ()
9. Application uses secure and appropriate database practices, including prepared statements and JDBC transactions (PostgreSQL), appropriate indexes (MongoDB), proper resource management, securely hashed credentials, and externalized configuration values. ()
10. Console interface provides a clear, intuitive user experience with role-appropriate menus, navigation, input validation, and user-friendly error messages. ()
11. Application demonstrates clean, maintainable, and well-documented code that follows established Java coding standards and best practices. ()
12. Application includes a comprehensive suite of automated tests covering the application's business logic, role permissions, note/logging rules, and critical functionality, runnable without live databases. ()
13. Project includes a complete README with setup instructions, architecture overview, both database designs, configuration, and execution steps. ()
14. Project is maintained in a Git repository with meaningful commit history demonstrating consistent development throughout the project. ()
