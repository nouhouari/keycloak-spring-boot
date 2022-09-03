# keycloak-spring-boot

Minimum project setup to use Keycloak and Spring boot together.

### Build
```
mvn clean install
```

### Configuration

You will need to setup keycloak url and client name in the _application.yaml_
```
keycloak:
  auth-server-url: ${KEYCLOAK_URL:http://localhost:8080/auth}
  realm: ${KEYCLOAK_REALM:demo}
  resource: backend
  public-client: false
  principal-attribute: preferred_id
```

### Run
```
mvn spring-boot:run
```

For demo purpose, the application will expose 2 endpoints:

- /demo/public <- 200 (OK)
- /demo/private <- 403 (Forbidden: Access denied)



