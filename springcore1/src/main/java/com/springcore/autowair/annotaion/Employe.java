package com.springcore.autowair.annotaion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employe {
	@Autowired
	@Qualifier("address1")
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	public Employe(Address address) {
		super();
		this.address = address;
	}

	public Employe() {
		super();
		
	}

	@Override
	public String toString() {
		return "Employe [address=" + address + "]";
	}

}
