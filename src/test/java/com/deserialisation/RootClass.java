package com.deserialisation;

import java.util.ArrayList;
import java.util.List;

public class RootClass {

	private int id;
	
	private String type;
	
	private String name;
	
	private float ppu;
	
	private Batters batters;
	
	private List<Topping> topping=new ArrayList<Topping>();

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPpu() {
		return ppu;
	}

	public void setPpu(float ppu) {
		this.ppu = ppu;
	}

	public Batters getBatters() {
		return batters;
	}

	public void setBatters(Batters batters) {
		this.batters = batters;
	}

	public List<Topping> getTopping() {
		return topping;
	}

	public void setTopping(List<Topping> topping) {
		this.topping = topping;
	}
	
	
	
}
