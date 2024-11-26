FROM maven:3.9.9-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline -X
COPY src ./src
RUN mvn clean package

FROM openjdk:21
WORKDIR /app
COPY --from=build /app/target/*.jar ./app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "./app.jar"]


# etapa de package
#FROM maven:3.9.9-eclipse-temurin-11 AS build
#WORKDIR /app
#COPY pom.xml .
#COPY src /src
#RUN mvn clean package

# etapa de execução
#FROM eclipse-temurin:21
#COPY --from=build /app/target/*.jar /app/app.jar
#WORKDIR /app
#EXPOSE 8080
#CMD ["java", "-jar", "app.jar"]