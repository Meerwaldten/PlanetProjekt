package com.example.planetprojekt.Planet.Repository;

import com.example.planetprojekt.Planet.Model.PlanetType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanetTypeRepository extends JpaRepository<PlanetType, Long> {
}
