package com.springcore.ci;

public class Persion {

	private String name;
	private int persionId;
	private Certi certi;

	public Persion(String name, int persionId, Certi certi) {
		super();
		this.name = name;
		this.persionId = persionId;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Persion [name=" + name + ", persionId=" + persionId + ", certi=" + certi + "]";
	}

}