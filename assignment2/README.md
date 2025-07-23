## Problem Statement

Maharishi International University has asked you to design and develop a platform that enable them to create, share, and engage with content effortlessly. However, many available blogging systems are either too complex, lack customization capabilities, or fail to provide clean, scalable architecture suitable for learning or real-world projects.

This project aims to build a **full-stack blogging platform from scratch**, similar in concept to Medium.com, with the goal of delivering a clean, modular, and extensible codebase that supports modern web development practices.

### Core Problems to Solve:
- There is no lightweight, developer-friendly backend template that combines **JWT-based security**, **clean RESTful API design**, and proper **domain-layer separation**.
- Developers often struggle with integrating user authentication, article management, and social features (like comments and follows) in a unified, testable architecture.
- **Frontend applications often lack reactive integration with RESTful APIs and real-time UI feedback.**

### Proposed Solution:
We propose developing a **social blogging platform** that includes:

-  Secure user registration, login, and JWT-based session handling
-  Full article lifecycle: create, update, delete, and favorite
-  Follow/unfollow functionality between users
-  **Commenting system with nested retrieval per article**
-  Personalized article feed
-  Role-based access and input validation
- **A scalable and maintainable code structure using Spring Boot (backend) and Angular (frontend)**

This project will serve both as:
- A **learning platform** for developers interested in building full-stack applications
- A **base project** that can be extended into larger editorial, content, or community platforms

### Technology Stack to be used:
- **Backend:** Java + Spring Boot (JPA, Hibernate, JWT)
- **Frontend:** Angular
- **Database:** MySQL
- **Build/Tooling:** Maven, Gradle (as needed)

**Note:** This project will emphasize clean architecture, design patterns (like Singleton, Factory where appropriate), DTO usage, and best practices in API security and modularity.


## Project Context Diagram
![Project Context Diagram](https://github.com/leone2016/miu-blog/blob/main/assignment2/assets/context-diagram.png)