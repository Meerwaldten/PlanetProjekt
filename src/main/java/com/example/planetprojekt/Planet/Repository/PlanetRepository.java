package com.example.planetprojekt.Planet.Repository;

import com.example.planetprojekt.Planet.Model.Planet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanetRepository extends JpaRepository<Planet, Long> {
}
