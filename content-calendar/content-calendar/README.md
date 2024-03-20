# Content Calendar

This project is a content calendar application built using Spring Boot. It allows users to manage and schedule content for various platforms.

## Read Me First

The following was discovered as part of building this project:

- The original package name 'com.gayanukaa.content-calendar' is invalid and this project uses 'com.gayanukaa.contentcalendar' instead.

## Features

- User authentication: Users can create accounts and log in to the application.
- Content creation: Users can create and manage content items, including title, description, and publication date.
- Calendar view: Users can view their content items in a calendar format, making it easy to visualize and manage their publishing schedule.
- Notifications: Users can receive notifications for upcoming content publication dates.
- Search and filtering: Users can search for specific content items and filter them based on various criteria.

## Installation

1. Clone the repository: `git clone https://github.com/your-username/content-calendar.git`
2. Navigate to the project directory: `cd content-calendar`
3. Install dependencies: `mvn install`
4. Configure the database connection in `application.properties`.
5. Run the application: `mvn spring-boot:run`

## Prerequisites

Before running this application, make sure you have the following tools installed:

- Java Development Kit (JDK) 8 or later
- Apache Maven 3.6.1 or later

## Building and Running the Application

To build and run the application, follow these steps:

1. Open a terminal or command prompt.
2. Navigate to the project directory: `cd content-calendar`
3. Build the application: `mvn clean package`
4. Run the application: `java -jar target/content-calendar.jar`

## Usage

1. Open your web browser and navigate to `http://localhost:8080`.
2. Sign up for a new account or log in with your existing credentials.
3. Create content items by filling out the necessary fields and selecting a publication date.
4. View and manage your content items in the calendar view.
5. Use the search and filtering options to find specific content items.
6. Receive notifications for upcoming publication dates.

## Contributing

Contributions are welcome! If you'd like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch: `git checkout -b feature/your-feature-name`
3. Make your changes and commit them: `git commit -m 'Add some feature'`
4. Push to the branch: `git push origin feature/your-feature-name`
5. Submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

## Contact

If you have any questions or suggestions, please feel free to reach out to us at [email@example.com](mailto:email@example.com).

## Getting Started

### Reference Documentation

For further reference, please consider the following sections:

- [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
- [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.9/maven-plugin/reference/html/)
- [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.9/maven-plugin/reference/html/#build-image)
- [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.9/reference/htmlsingle/index.html#web)

### Guides

The following guides illustrate how to use some features concretely:

- [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
- [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
- [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Tutorial Video

[Spring Boot Tutorial for Beginners - 2023 Crash Course using Spring Boot 3](https://www.youtube.com/watch?v=UgX5lgv4uVM)

## Application Overview

The main class of the application is `Application.java`. This class is annotated with `@SpringBootApplication`, which enables Spring Boot auto-configuration and component scanning.

The application uses the following dependencies:

- Spring Boot Web: for creating a web application
- Spring Boot Data JPA: for managing database operations
- Spring Boot DevTools: for faster application restart times during development

The application also uses the following external libraries:

- RestTemplate: for making HTTP requests
- ContentCalendarProperties: for storing configuration properties
- ContentRepository: for managing content calendar entries

## Configuration

The application uses a configuration class, `ContentCalendarProperties.java`, to store configuration properties. This class is annotated with `@ConfigurationProperties` and is used to configure the following properties:

- api.url: the base URL for making API requests
- api.key: the API key for authentication

## Content Model

The application uses the following model classes to represent a content calendar entry:

- Content.java: represents a content calendar entry
- Status.java: represents the status of a content calendar entry
- Type.java: represents the type of a content calendar entry

## Content Repository

The application uses the `ContentRepository.java` interface to manage database operations related to content calendar entries. This interface extends the `JpaRepository` interface, which provides basic CRUD operations for managing entities.

## Command Line Runner

The `commandLineRunner` bean is used to perform bootstrapping tasks, such as inserting initial data into the database. This bean is defined using the `@Bean` annotation and is executed automatically when the application starts.

## Conclusion

This application provides a simple content calendar management system using Spring Boot and JPA. You can use this application as a starting point for building more complex content management systems.
