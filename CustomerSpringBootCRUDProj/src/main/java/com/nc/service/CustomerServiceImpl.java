package com.nc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nc.entity.Customer;
import com.nc.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository repo;

	public Integer saveCustomer(Customer objectOfCustomer) {
		return repo.save(objectOfCustomer).getid();
	}

	public Customer updateCustomer(Customer objectOfCustomer) {
		return repo.save(objectOfCustomer);
	}

	public void deleteCustomer(int id) {
			repo.deleteById(id);
	}

	public Customer getOneCustomer(int id) {
		Optional<Customer> objectOfCustomergt = repo.findById(id);
		if(objectOfCustomergt.isPresent())
		{
			return objectOfCustomergt.get();
		}
		else return null;
	} 

	public List<Customer> getAllCustomers() {
		return repo.findAll();
	}

}
