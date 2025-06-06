# BookWorldEvents

This repository contains a simple microservice-based example for an event booking application.

## Services

- **Auth Service** – handles user authentication.
- **Booking Service** – manages event bookings and reservations.
- **Event Service** – stores events and schedules.

Each service is a lightweight Spring Boot application.

## Getting Started

1. Install [Docker](https://docs.docker.com/get-docker/) and Maven.
2. From the `infra` directory run `docker-compose up --build` to start all services.
3. Access each service at the following URLs:
   - `http://localhost:8080` – Auth Service
   - `http://localhost:8081` – Booking Service
   - `http://localhost:8082` – Event Service

You can also run any service locally with `mvn spring-boot:run` in its directory.
