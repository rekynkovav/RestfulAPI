Restful API.

контролеры работают только с  DTO.
Между уровнем контроллеров и сервисов уровень фасадов. 
Методы фасадов принимают и возвращают только DTO.
Внутри фасадов используются сервисы.
В контроллерах только фасады. 

Stack:
- Java 21
- Maven
- SQL DB (PostgreSQL)
- Spring Boot
- Spring Data JPA (Hibernate)
- Flyway
- Rest Assured (тестирование контроллеров)




