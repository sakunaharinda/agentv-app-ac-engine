./mvnw package && java -jar target/agentv-app-ac-engine-1.0.jar
docker build -t agentv-app-ac-engine .
docker run --name agentv-app-ac-engine -p 8081:8081 agentv-app-ac-engine
docker logs -f agentv-app-ac-engine