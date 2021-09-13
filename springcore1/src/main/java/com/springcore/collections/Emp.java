package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	
	private String name;
	private List<String> phone;
	private Set<String> addrsses;
	private Map<String, String> courses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAddrsses() {
		return addrsses;
	}
	public void setAddrsses(Set<String> addrsses) {
		this.addrsses = addrsses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Emp(String name, List<String> phone, Set<String> addrsses, Map<String, String> courses) {
		super();
		this.name = name;
		this.phone = phone;
		this.addrsses = addrsses;
		this.courses = courses;
	}
	public Emp() {
		super();
		
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", phone=" + phone + ", addrsses=" + addrsses + ", courses=" + courses + "]";
	}
	
	
}
