#!/bin/bash

while ! nc -z config-server 8888 ; do
    echo "Waiting for the Config Server"
    sleep 10
done

echo "Config Server is running - starting Eureka Server"

java -cp /app/resources:/app/classes:/app/libs/* com.example.eurekaserver.EurekaServerApplication
