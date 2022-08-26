package com.example.planetprojekt.Customer.Repository;

import com.example.planetprojekt.Customer.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
