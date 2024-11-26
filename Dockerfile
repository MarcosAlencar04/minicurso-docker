# etapa de package
FROM maven:3.9.9-eclipse-temurin-11 AS build
COPY src /app/src
COPY pom.xml /app
WORKDIR /app
RUN mvn clean package

# etapa de execução
FROM eclipse-temurin:21
COPY --from=build /app/targe/*.jar /app/app.jar
WORKDIR /app
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]