package com.nc.service;

import java.util.List;

import com.nc.entity.Customer;

public interface CustomerService {

	public Integer saveCustomer(Customer objectOfCustomer);
	public Customer updateCustomer(Customer objectOfCustomer);
	public void deleteCustomer(int id);
	public Customer getOneCustomer(int id);
	public List<Customer> getAllCustomers();
	
}
