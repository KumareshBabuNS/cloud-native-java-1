#!/usr/bin/env bash
mvn clean install
ttab -w java -Xmx384m -jar config-server/target/config-server-1.0.jar
ttab -w java -Xmx384m -jar eureka-server/target/eureka-server-1.0.jar
ttab -w java -Xmx384m -jar hello-service/target/hello-service-1.0.jar
ttab -w java -Xmx384m -jar edge-server/target/edge-server-1.0.jar