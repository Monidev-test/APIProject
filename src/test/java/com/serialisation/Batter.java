package com.serialisation;

public class Batter {

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

	public Batter(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
	
}
