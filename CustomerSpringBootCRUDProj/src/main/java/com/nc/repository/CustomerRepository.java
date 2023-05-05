package com.nc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nc.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
