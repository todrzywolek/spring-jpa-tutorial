# Spring JPA Tutorial

My Spring fun project to learn Spring Data and Spring JPA

## Description
### Basic implementation
Add user entity to h2 in-memory database. To do that:
  * impelement UserService that talks to database
  * add user to database after application context is launched (achieved by commandLineRunner)

### Refactor
Use of Spring Data JPA:
 * create repository interface
 * add user to database with using of commandLineRunner