package com.example.planetprojekt.Planet.Model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="planettype")
public class PlanetType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
