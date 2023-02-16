FROM gradle

WORKDIR /app

COPY /build/libs/frontend-orchestrator-0.0.1-SNAPSHOT.jar /app/lib/frontend-orchestrator-0.0.1-SNAPSHOT.jar

EXPOSE 8081

VOLUME ["/app/lib"]

CMD ["java", "-jar", "/app/lib/frontend-orchestrator-0.0.1-SNAPSHOT.jar"]

