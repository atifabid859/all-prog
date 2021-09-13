package com.springcore.autowair;

public class Employe {
	
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
