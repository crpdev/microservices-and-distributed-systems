Microservices and Distributed Systems
---
---
    Core Technologies
        Spring Cloud
        Kubernetes
---
    April 5, 2022

    - Created parent module: mds-app
        - Dependency Management for spring-boot-dependecies
        - Added global dependencies lombok and spring-boot-starter-test
        - Plugin Management: spring-boot-maven-plugin
        - Global properties defined for spring boot
    - Created customer sub-module
        - Added spring-boot-starter-web derived from the dependency management
        - Base setup with
            - Startup application class
            - Rest Controller: CustomerController, RequestMapping: /api/v1/customers, PostMapping: registerCustomer
            - Service for customer registration: CustomerService
            - Models: Customer and CustomerRegistrationRequest
    - Postgres Docker Compose
        - Defined the docker compose file that spins up postgres and pgAdmin instance