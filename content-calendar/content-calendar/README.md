<p    >
  <img src="https://cdn-icons-png.flaticon.com/512/6295/6295417.png" width="100" />
</p>
<p>
    <h1>Content Calendar</h1>
</p>

<p>
 <img src="https://img.shields.io/github/license/Gayanukaa/Spring-Boot-Playground?style=flat&color=0080ff" alt="license">
 <img src="https://img.shields.io/github/last-commit/Gayanukaa/Spring-Boot-Playground?style=flat&logo=git&logoColor=white&color=0080ff" alt="last-commit">
 <img src="https://img.shields.io/github/languages/top/Gayanukaa/Spring-Boot-Playground?style=flat&color=0080ff" alt="repo-top-language">
 <img src="https://img.shields.io/github/languages/count/Gayanukaa/Spring-Boot-Playground?style=flat&color=0080ff" alt="repo-language-count">
<p>

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
- H2 Database: for storing content calendar entries

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

## Project Roadmap

- [x] `► Initialise`
- [x] `► Configure`
- [ ] `► Production`

## Contributing

<details closed>
    <summary>Contributing Guidelines</summary>

1. **Fork the Repository**: Start by forking the project repository to your GitHub account.
2. **Clone Locally**: Clone the forked repository to your local machine using a Git client.

   ```sh
   git clone https://github.com/Gayanukaa/Spring-Boot-Playground
   ```

3. **Create a New Branch**: Always work on a new branch, giving it a descriptive name.

   ```sh
   git checkout -b new-feature-x
   ```

4. **Make Your Changes**: Develop and test your changes locally.
5. **Commit Your Changes**: Commit with a clear message describing your updates.

   ```sh
   git commit -m 'Implemented new feature x.'
   ```

6. **Push to GitHub**: Push the changes to your forked repository.

   ```sh
   git push origin new-feature-x
   ```

7. **Submit a Pull Request**: Create a PR against the original project repository. Clearly describe the changes and their motivations.

Once your PR is reviewed and approved, it will be merged into the main branch.

</details>
