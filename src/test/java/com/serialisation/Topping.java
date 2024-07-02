package com.serialisation;

public class Topping {

	private int id;
	
	private String type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Topping(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
	
}
