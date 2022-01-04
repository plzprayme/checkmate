FROM eclipse-temurin:17-jre-alpine
EXPOSE 8080
RUN ["mkdir", "-p", "server"]
WORKDIR /home/ubuntu/server
COPY ./application.jar ./server/application.jar
CMD ["java", "-jar", "./server/application.jar"]