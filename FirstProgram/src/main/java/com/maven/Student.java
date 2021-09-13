package com.maven;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Student {
	@Id
	private int id;
	private String name;
	private String cityString;
	private Certifcate certi;
	public Student(int id, String name, String cityString) {
		super();
		this.id = id;
		this.name = name;
		this.cityString = cityString;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCityString() {
		return cityString;
	}
	public void setCityString(String cityString) {
		this.cityString = cityString;
	}
	
	public Certifcate getCerti() {
		return certi;
	}
	public void setCerti(Certifcate certi) {
		this.certi = certi;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cityString=" + cityString + "]";
	}
	

}
