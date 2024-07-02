package com.org.restassured;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Sample {

	public static void main(String[] args) {
		
		
//		GET--LIST USERS
//		RestAssured.baseURI="https://reqres.in/";
//		RequestSpecification requestSpecification = RestAssured.given();
//		requestSpecification.queryParam("page", "2");
//		Response response = requestSpecification.request(Method.GET,"api/users");
//		int statusCode = response.getStatusCode();
//		System.out.println(statusCode);
//		String asPrettyString = response.getBody().asPrettyString();
//		System.out.println(asPrettyString);
		
//  GET--SINGLE USERS
//		RestAssured.baseURI="https://reqres.in/";
//		RequestSpecification requestSpecification = RestAssured.given();
//		requestSpecification.pathParam("id", "2");
//		Response response = requestSpecification.request(Method.GET,"api/users/{id}");
//		int statusCode = response.getStatusCode();
//		System.out.println(statusCode);
//		String asPrettyString = response.getBody().asPrettyString();
//		System.out.println(asPrettyString);
	
//	GET---SINGLE USER NOT FOUND
//		RestAssured.baseURI="https://reqres.in/";
//		RequestSpecification requestSpecification = RestAssured.given();
//		requestSpecification.pathParam("id", "23");
//		Response response = requestSpecification.request(Method.GET,"api/users/{id}");
//		int statusCode = response.getStatusCode();
//		System.out.println(statusCode);
//		String asPrettyString = response.getBody().asPrettyString();
//		System.out.println(asPrettyString);
//	
//		GET---LIST <RESOURCE>
		
//		RestAssured.baseURI="https://reqres.in/";
//		RequestSpecification requestSpecification = RestAssured.given();
//		
//		Response response = requestSpecification.request(Method.GET,"api/unknown");
//		int statusCode = response.getStatusCode();
//		System.out.println(statusCode);
//		String asPrettyString = response.getBody().asPrettyString();
//		System.out.println(asPrettyString);
	
		
//		GET---SINGLE <RESOURCE>
//		RestAssured.baseURI="https://reqres.in/";
//		RequestSpecification requestSpecification = RestAssured.given();
//		requestSpecification.pathParam("id", "2");
//		Response response = requestSpecification.request(Method.GET,"api/unknown/{id}");
//		int statusCode = response.getStatusCode();
//		System.out.println(statusCode);
//		String asPrettyString = response.getBody().asPrettyString();
//		System.out.println(asPrettyString);
	
		
//		GET---SINGLE <RESOURCE> NOT FOUND
		
//		RestAssured.baseURI="https://reqres.in/";
//		RequestSpecification requestSpecification = RestAssured.given();
//		requestSpecification.pathParam("id", "23");
//		Response response = requestSpecification.request(Method.GET,"api/unknown/{id}");
//		int statusCode = response.getStatusCode();
//		System.out.println(statusCode);
//		String asPrettyString = response.getBody().asPrettyString();
//		System.out.println(asPrettyString);
//		
//		GET---DELAYED RESPONSE
//		RestAssured.baseURI="https://reqres.in/";
//		RequestSpecification requestSpecification = RestAssured.given();
//		requestSpecification.queryParam("delay", "3");
//		Response response = requestSpecification.request(Method.GET,"api/users");
//		int statusCode = response.getStatusCode();
//		System.out.println(statusCode);
//		String asPrettyString = response.getBody().asPrettyString();
//		System.out.println(asPrettyString);
//		
		
//	POST---Create	
//		RestAssured.baseURI="https://reqres.in/";
//		RequestSpecification requestSpecification = RestAssured.given();
//		JSONObject jsonObject=new JSONObject();
//		jsonObject.put("name", "morpheus");
//		jsonObject.put("job", "leader");
//		requestSpecification.body(jsonObject.toJSONString());
//		Response response = requestSpecification.request(Method.POST,"api/users");
//		int statusCode = response.getStatusCode();
//		System.out.println(statusCode);
//		String asPrettyString = response.getBody().asPrettyString();
//		System.out.println(asPrettyString);
		
/**		POST---Register successful	
			RestAssured.baseURI="https://reqres.in/";
			RequestSpecification requestSpecification = RestAssured.given();
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("email", "eve.holt@reqres.in");
			jsonObject.put("password", "pistol");
			requestSpecification.body(jsonObject.toJSONString());
			Response response = requestSpecification.request(Method.POST,"api/register");
			int statusCode = response.getStatusCode();
			System.out.println(statusCode);
			String asPrettyString = response.getBody().asPrettyString();
			System.out.println(asPrettyString);
	**/
		
//		PUT---Register successful	
//		RestAssured.baseURI="https://reqres.in/";
//		RequestSpecification requestSpecification = RestAssured.given();
//		requestSpecification.pathParam("id", "2");
//		JSONObject jsonObject=new JSONObject();
//		jsonObject.put("name", "morpheus");
//		jsonObject.put("job", "zion resident");
//		requestSpecification.body(jsonObject.toJSONString());
//		Response response = requestSpecification.request(Method.PUT,"api/users/{id}");
//		int statusCode = response.getStatusCode();
//		System.out.println(statusCode);
//		String asPrettyString = response.getBody().asPrettyString();
//		System.out.println(asPrettyString);
//		
		
//		DELETE---Delete
//		RestAssured.baseURI="https://reqres.in/";
//		RequestSpecification requestSpecification = RestAssured.given();
//		requestSpecification.pathParam("id", "2");
//		Response response = requestSpecification.request(Method.DELETE,"api/users/{id}");
//		int statusCode = response.getStatusCode();
//		System.out.println(statusCode);
//		String asPrettyString = response.getBody().asPrettyString();
//		System.out.println(asPrettyString);
		
		
		
	//	POST---Register unsuccessful	
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification requestSpecification = RestAssured.given();
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("email", "sydney@fife");
		requestSpecification.body(jsonObject.toJSONString());
		Response response = requestSpecification.request(Method.POST,"api/register");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		String asPrettyString = response.getBody().asPrettyString();
		System.out.println(asPrettyString);
	}
	
}
