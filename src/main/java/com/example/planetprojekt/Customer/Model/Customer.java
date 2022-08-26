package com.example.planetprojekt.Customer.Model;


import com.example.planetprojekt.Reservation.Model.Reservation;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sun.istack.NotNull;
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
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name="firstname")
    private String firstName;

    @NotNull
    @Column(name="lastname")
    private String lastName;

    @JsonBackReference
    @ManyToMany(cascade = {
            CascadeType.MERGE
    })
    @JoinTable(
            name="customer_reservations",
            joinColumns = @JoinColumn(name="customer_id"),
            inverseJoinColumns = @JoinColumn(name="reservation_id")
    )
    private List<Reservation> reservations = new ArrayList<>();



    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
