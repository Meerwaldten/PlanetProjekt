package com.example.planetprojekt.Planet.Model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="planet")
public class Planet{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="planetname")
    private String planetName;

    @Column(name="mass")
    private double mass;

    @Column(name="diameter")
    private double diameter;

    @Column(name="numberofmoons")
    private int numberOfMoons;

    @Column(name="density")
    private int density;

    @Column(name="gravity")
    private double gravity;

    @Column(name="lengthofday")
    private double lengthOfDay;

    @Column(name="averagetemperature")
    private double averageTemperature;

    @Column(name="distancefromsun")
    private double distanceFromSun;

    public Planet(String planetName, double mass, double diameter, int numberOfMoons, int density, double gravity, double lengthOfDay, double averageTemperature, double distanceFromSun) {
        this.planetName = planetName;
        this.mass = mass;
        this.diameter = diameter;
        this.numberOfMoons = numberOfMoons;
        this.density = density;
        this.gravity = gravity;
        this.lengthOfDay = lengthOfDay;
        this.averageTemperature = averageTemperature;
        this.distanceFromSun = distanceFromSun;
    }
}
