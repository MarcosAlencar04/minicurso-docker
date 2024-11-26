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


#comandos docker

#build
#docker build -t my-app-image .

#roda o container my-container da imagem my-app-image
#docker run -d -o portadesaida:portaquetarodando --name my-container my-app-image

#lista os containers que estao rodando
#docker ps

#para o container
#docker stop my-container

#remove o container
#docker rm my-container

#remove a imagem
#docker rmi my-app-image