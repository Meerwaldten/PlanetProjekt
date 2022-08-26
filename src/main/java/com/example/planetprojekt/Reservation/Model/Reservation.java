package com.example.planetprojekt.Reservation.Model;


import com.example.planetprojekt.Customer.Model.Customer;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="planetname")
    private String planetName;

    @Column(name="numberofcustomers")
    private int numberOfCustomers;



    public Reservation(String planetName, int numberOfCustomers) {
        this.planetName = planetName;
        this.numberOfCustomers = numberOfCustomers;
    }

    @ManyToMany(mappedBy = "reservations")
    List<Customer> customers = new ArrayList<>();


}
