package com.swagger.petstore;

import java.util.ArrayList;

import org.common.BaseClass;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Implementation extends BaseClass{

	@Test
	private void tc0() {
		requestObject("https://petstore.swagger.io/");
		//to attach header
		requestSpecification.headers("accept", "application/json");
		requestSpecification.headers("Content-Type", "application/json");
		
		Category category=new Category(0, "Java");
		ArrayList<String> photoUrls=new ArrayList();
		photoUrls.add("maven");
		photoUrls.add("api");
		ArrayList<Tags> tags=new ArrayList();
		Tags tags2=new Tags(0, "python");
		Tags tags3=new Tags(1, "C");
		tags.add(tags2);
		tags.add(tags3);
		Root root=new Root(0, category, "Selenium", photoUrls, tags, "available");
		requestSpecification.body(root);
		Response response = responseObject("POST", "v2/pet");
		getResponseCode(response);
		getResponseBody(response);
		

	}
	
}
