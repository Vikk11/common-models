FROM gradle:8.0-jdk17 AS build-common
WORKDIR /app
COPY . .
RUN gradle publish