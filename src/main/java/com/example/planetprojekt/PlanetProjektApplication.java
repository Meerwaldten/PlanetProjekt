package com.example.planetprojekt;

import com.example.planetprojekt.Customer.Model.Customer;
import com.example.planetprojekt.Customer.Repository.CustomerRepository;
import com.example.planetprojekt.Planet.Model.Planet;
import com.example.planetprojekt.Planet.Repository.PlanetRepository;
import com.example.planetprojekt.Reservation.Model.Reservation;
import com.example.planetprojekt.Reservation.Repository.ReservationRepository;
import com.example.planetprojekt.Spaceship.Model.Spaceship;
import com.example.planetprojekt.Spaceship.Repository.SpaceshipRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class PlanetProjektApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlanetProjektApplication.class, args);

    }

    @Bean
    CommandLineRunner commandLineRunner (
            CustomerRepository customerRepository,
            PlanetRepository planetRepository,
            SpaceshipRepository spaceshipRepository,
            ReservationRepository reservationRepository) {
        return args -> {
            final List<Customer> customers = new ArrayList<>();
            customers.add(new Customer("Simon","Eriksen"));
            customers.add(new Customer("Asger","Brik"));
            customers.add(new Customer("John","Zando"));
            customerRepository.saveAll(customers);

            final List<Planet> planets = new ArrayList<>();
            planets.add(new Planet("Earth", 5.97, 12.756, 1, 5514, 9.8, 24, 15, 149.6));
            planetRepository.saveAll(planets);

            final List<Spaceship> spaceships = new ArrayList<>();
            spaceships.add(new Spaceship("Zando", 10, false));
            spaceships.add(new Spaceship("Erikzando", 20, true));
            spaceships.add(new Spaceship("Meerwaldo", 100, true));
            spaceshipRepository.saveAll(spaceships);

            final List<Reservation> reservations = new ArrayList<>();
            reservations.add(new Reservation("Earth", 5));
            reservations.add(new Reservation("Earth", 2));
            reservations.add(new Reservation("Earth", 6));
            reservations.add(new Reservation("Earth", 4));
            reservationRepository.saveAll(reservations);


        };
    }
}

