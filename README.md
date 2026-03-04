

# Java Database Engineering

This repository documents my exploration of database interaction from a backend engineering perspective using Java, JDBC, and MySQL.

**Goal**: Understand how backend systems communicate with relational databases at a lower level before relying on higher-level frameworks like Spring Data or ORM tools.

***

## Objectives

- Understand relational schema design
- Work with MySQL using raw JDBC
- Manage database connections in Java applications
- Structure database access using the repository pattern
- Keep database schema and seed data under version control

***

## Tech Stack

- **Java 21**
- **JDBC**
- **MySQL**
- **Maven**

***

## Project Structure

```
java-database-engineering
│
├── src/main/java
│   ├── config
│   │   └── DatabaseConnection.java
│   │
│   ├── model
│   │
│   ├── repository
│   │
│   └── examples
│       └── TestConnection.java
│
├── sql
│   ├── schema.sql
│   └── seed_data.sql
│
├── pom.xml
├── .env.example
└── .gitignore
```

***

## Database Setup

The database schema and initial data are version-controlled inside the `sql/` directory.

### Create Schema

Run:
```sql
source sql/schema.sql
```

### Insert Sample Data

Run:
```sql
source sql/seed_data.sql
```

***

## Environment Configuration

Database credentials are configured through environment variables.

**.env.example**:
```
DB_URL=jdbc:mysql://localhost:3306/company_db
DB_USER=your_username
DB_PASSWORD=your_password
```

**Note**: Create a local `.env` file (not committed to Git) with your actual credentials.

***

## Current Status

 **Implemented**:
- Maven project setup
- MySQL schema creation
- JDBC driver configuration
- Database connection layer
- Environment variable based configuration
- Repository-oriented project structure

***

## Next Steps

- Implement domain models mapped from database tables
- Build repository classes using `PreparedStatement`
- Implement CRUD operations
- Explore transactions and query optimization

***

