# 1️⃣ Build stage
FROM eclipse-temurin:22-jdk-alpine AS builder

WORKDIR /app

# copy everything to the container
COPY . .

# give mvnw permission
RUN chmod +x mvnw

# build the project
RUN ./mvnw clean package -DskipTests

# 2️⃣ Run stage
FROM eclipse-temurin:22-jre-alpine

WORKDIR /app

COPY --from=builder /app/target/*.jar app.jar

EXPOSE 8001

ENTRYPOINT ["java", "-jar", "app.jar"]






