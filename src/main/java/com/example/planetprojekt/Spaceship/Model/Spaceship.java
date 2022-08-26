package com.example.planetprojekt.Spaceship.Model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="spaceship")
public class Spaceship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="shipname")
    private String shipName;

    @Column(name="seats")
    private int seatsAvailable;

    @Column(name="aircondition")
    private boolean aircondition;



    public Spaceship(String shipName, int seatsAvailable, boolean aircondition) {
        this.shipName = shipName;
        this.seatsAvailable = seatsAvailable;
        this.aircondition = aircondition;
    }


}
