package com.nc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nc.entity.Customer;
import com.nc.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService service;

	// show welcome page
		@GetMapping("/")
		public String showWelcome() {
			return "welcome";
		}
	
	// show register page
	@GetMapping("/reg")
	public String showReg(Model map) {
		// form baking object
		map.addAttribute("employee", new Customer());
		return "register";
	}

	// save objectOfCustomer
	@PostMapping("/save")
	public String saveCustomer(Customer objectOfCustomer, Model map) {
		Integer id = service.saveCustomer(objectOfCustomer);
		map.addAttribute("msg", "Customer [" + id + "] added successfully");

		// clear form baking object
		map.addAttribute("employee", new Customer());

		return "register";
	}

	// get all objectOfCustomer
	@GetMapping("/all")
	public String showEmployee(Model map) {
		List<Customer> list = service.getAllCustomers();
		map.addAttribute("list", list);
		return "data";
	}

	// getOne objectOfCustomer for view page
	@GetMapping("/view")
	public String getOneCustomer(@RequestParam int id, Model map) {
		Customer objectOfCustomergt = service.getOneCustomer(id);
		if (objectOfCustomergt != null) {
			map.addAttribute("emp", objectOfCustomergt);
		} else {
			map.addAttribute("msg", "No Customer Found");
		}

		return "view";
	}

	// delete objectOfCustomer
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam Integer id, Model map) {
		service.deleteCustomer(id);
		map.addAttribute("msg", "Customer deleted Successfully");
		return "redirect:all";
	}

	// get Update objectOfCustomer
	@GetMapping("/getUpdate")
	public String getUpdateCustomerPage(@RequestParam Integer id, Model map) {
		map.addAttribute("employee", service.getOneCustomer(id));
		map.addAttribute("mode", "edit");
		return "register";
	}

	// update objectOfCustomer
	@PutMapping("/update")
	public String updateCustomer(@ModelAttribute Customer objectOfCustomerupP, Model map) {
		Customer objectOfCustomerupA = service.updateCustomer(objectOfCustomerupP);
		map.addAttribute("msg", "Customer updated successfully");

		// clear form baking object 
		map.addAttribute("employee",new Customer());
		return "redirect:view?id=" + objectOfCustomerupA.getid();
	}
	
	@PostMapping("/error")
	public String showError() {
		return "error";
}
	
}
