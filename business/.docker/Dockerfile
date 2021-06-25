FROM adoptopenjdk/openjdk11:alpine
COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn
COPY src ./src
RUN ./mvnw install -DskipTests
EXPOSE 8080
CMD ["./mvnw", "spring-boot:run"]