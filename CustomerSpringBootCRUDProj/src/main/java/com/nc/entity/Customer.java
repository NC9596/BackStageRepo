package com.nc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer_table")
public class Customer {

	@Id
	@GeneratedValue
	@Column(name = "Customer_id")
	private Integer id;

	@Column
	private String name;

	@Column
	private Long phNum;

	@Column
	private String email;

	public Customer() {

	}

	public Customer(Integer id, String name, Long phNum, String email) {
		this.id = id;
		this.name = name;
		this.phNum = phNum;
		this.email = email;
	}

	public Integer getid() {
		return id;
	}

	public void setEmpId(Integer id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public Long getphNum() {
		return phNum;
	}

	public void setphNum(Long phNum) {
		this.phNum = phNum;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

}
