package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{3+5}")
private int x;
	@Value("#{20+10}")
private int y;
	
	@Value("#{T(java.lang.Math).sqrt(20)}")
private double z;
	@Value("#{T(java.lang.Math).E}")
	private double e;
	
	@Value("#{T(java.lang.Math).PI}")
	private double pi;
	@Value("#{new java.lang.String('Atif Abid')}")
private String name;
@Value("#{6>4}")
	private boolean isActive;
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}


public double getZ() {
	return z;
}

public void setZ(double z) {
	this.z = z;
}

public double getE() {
	return e;
}

public void setE(double e) {
	this.e = e;
}
public double getPi() {
	return pi;
}
public void setPi(double pi) {
	this.pi = pi;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public boolean isActive() {
	return isActive;
}
public void setActive(boolean isActive) {
	this.isActive = isActive;
}
@Override
public String toString() {
	return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", pi=" + pi + ", name=" + name + ", isActive="
			+ isActive + "]";
}




}
