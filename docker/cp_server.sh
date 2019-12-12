#!/bin/bash

mvn -f ../user-server clean install
cp ../user-server/target/swagger-spring-1.0.0.jar images/java_server_1/tmp
mv images/java_server_1/tmp/swagger-spring-1.0.0.jar images/java_server_1/tmp/java-server-1.0.0.jar

mvn -f ../trail-server clean install
cp ../trail-server/target/swagger-spring-1.0.0.jar images/java_server_2/tmp
mv images/java_server_2/tmp/swagger-spring-1.0.0.jar images/java_server_2/tmp/java-server-1.0.0.jar
