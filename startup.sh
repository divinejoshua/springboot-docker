#!/bin/sh

mvn clean install
docker-compose up --build -d