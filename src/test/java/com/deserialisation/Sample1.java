package com.deserialisation;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample1 {
	public static void main(String[] args) throws IOException {
		FileReader fileReader=new FileReader(new File("C:\\Users\\USER\\eclipse-workspace\\APITestingMonisha\\resource\\Example.json"));
		ObjectMapper objectMapper=new ObjectMapper();
		RootClass readValue = objectMapper.readValue(fileReader, RootClass.class);
	System.out.println(readValue.getId());
	System.out.println(readValue.getType());
	System.out.println(readValue.getName());
	System.out.println(readValue.getPpu());
	Batters batters = readValue.getBatters();
	List<Batter> batter = batters.getBatter();
	for (int i = 0; i < batter.size(); i++) {
		Batter batter2 = batter.get(i);
		System.out.println(batter2.getId());
		System.out.println(batter2.getType());
		
	}
	List<Topping> topping = readValue.getTopping();
	for (int i = 0; i < topping.size(); i++) {
		Topping topping2 = topping.get(i);
		System.out.println(topping2.getId());
		System.out.println(topping2.getType());
	}
	}
	
}
