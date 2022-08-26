package com.example.planetprojekt.Reservation.Repository;

import com.example.planetprojekt.Reservation.Model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
