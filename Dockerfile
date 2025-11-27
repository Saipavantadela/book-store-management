FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY . .

# ✔ Make mvnw executable
RUN chmod +x mvnw

RUN ./mvnw clean package -DskipTests

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "target/book-store-management-0.0.1-SNAPSHOT.jar"]




