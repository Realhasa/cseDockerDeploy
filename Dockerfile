FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
# নিচের লাইনটি খুব সাবধানে খেয়াল করুন
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]