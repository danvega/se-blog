# What's new in Spring Framework 6

This is a demo to walk through some of the new features in Spring Framework 6 and Spring Boot 3. In this tutorial we will walk through a sample blog application that works with blog `Posts`s. This demo will cover the following features: 

- Java 17
- Jakarta EE 9/10
- Spring Data 2022
- Http Interfaces
- Spring for GraphQL 1.1.0
- Spring Security 6

## Agenda

This is an outline of the agenda for this demo: 

- start.spring.io
  - web,validation,spring data jdbc,validation
- Run the application 
  - Tomcat 10.1 & Servlet 6.0
- Model
  - Create a new Post Record
  - Validation Constraint (Jakarta Namespace) 
- Repository
  - Spring Data 2022
  - CrudRepository,ListCrudRepository,PagingAndSortingRepository
- REST Controller
  - Simple REST API that uses the Post Repository 
- CommandLineRunner
  - Functional Interfaces & Lambda's
  - Insert a single `Post`
  - View H2 Console (DB) & `/api/posts` endpoint
- Http Interfaces
  - JsonPlaceholderService
  - Creating a `HttpServiceProxyFactory`
  - load posts
- GraphQL
  - Add `spring-boot-starter-graphql` starter
  - Spring for GraphQL 1.1.0 builds on Spring Boot 3
- Spring Security changes
  - WebSecurityConfigurerAdapter
  - authorizeRequests -> authorizeHttpRequests 
  - antMatchers/mvcMatchers/regexMatchers -> requestMatchers