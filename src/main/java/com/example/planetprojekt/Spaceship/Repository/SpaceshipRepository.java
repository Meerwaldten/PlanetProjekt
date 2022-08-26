package com.example.planetprojekt.Spaceship.Repository;

import com.example.planetprojekt.Spaceship.Model.Spaceship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpaceshipRepository extends JpaRepository<Spaceship, Long> {

}
