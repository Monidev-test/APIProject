package com.serialisation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Implementation {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		File f=new File("C:\\Users\\USER\\eclipse-workspace\\APITestingMonisha\\resource\\Example1.json");
		ObjectMapper objectMapper=new ObjectMapper();
		
		List<Batter> batter=new ArrayList<Batter>(); 
		
		
		Batter batter2=new Batter(1001, "Regular");
		Batter batter3=new Batter(1002, "Choc");
		Batter batter4=new Batter(1003, "Bluberry");
		Batter batter5=new Batter(1004, "Food");
		batter.add(batter2);
		batter.add(batter3);
		batter.add(batter4);
		batter.add(batter5);
		
		List<Topping> topping=new ArrayList<Topping>();
		topping.add(new Topping(11, "Hii"));
		topping.add(new Topping(105, "Hello"));
		topping.add(new Topping(154, "uuuu"));
		Batters batters=new Batters(batter);
		
				
				
		RootClass1 root=new RootClass1(0001, "donut", "cake", 0.55f, batters, topping);
		objectMapper.writeValue(f, root);
	}
	
}
