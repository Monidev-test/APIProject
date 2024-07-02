package org.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {

	public static RequestSpecification requestSpecification;
//	Request Object
//	1. Write a user defined method
//	2. Write original logic inside method
//	3. Convert all input into arguments Output -Return Types

	public static void requestObject(String baseURI) {
		RestAssured.baseURI = baseURI;
		requestSpecification = RestAssured.given();

	}

//	Attach the query parameter
	public static void attachQueryParam(String parameterName, Object parameterValue) {
		requestSpecification.queryParam(parameterName, parameterValue);

	}

//	Attach the path parameter
	public static void attachPathParam(String parameterName, Object parameterValue) {
		requestSpecification.pathParam(parameterName, parameterValue);

	}

//Response Object
	public static Response responseObject(String requestType, String endPoint) {
		switch (requestType) {
		case "GET": {
			return requestSpecification.request(Method.GET, endPoint);
		}
		case "POST": {
			return requestSpecification.request(Method.POST, endPoint);
		}
		case "PUT": {
			return requestSpecification.request(Method.PUT, endPoint);
		}
		default:
			return requestSpecification.request(Method.DELETE, endPoint);
		}
	}

	public static void getResponseCode(Response response) {
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);

	}

	public static void getResponseBody(Response response) {
		String asPrettyString = response.getBody().asPrettyString();
		System.out.println(asPrettyString);

	}

//	Attach Authentication Code

	public static void attachToken(String userName, String passWord) {
		requestSpecification.auth().basic(userName, passWord);

	}

	public static void attachToken(String accessToken) {
		requestSpecification.auth().oauth2(accessToken);

	}

	
	public static String readFromExcel(int rowNum, int cellNum) throws FileNotFoundException, IOException {
		Workbook w=new XSSFWorkbook(new FileInputStream(new
				File("C:\\Users\\USER\\eclipse-workspace\\APITestingMonisha\\resource\\DataProvider.xlsx")));
		return w.getSheet("Sheet1").getRow(rowNum).getCell(cellNum).getStringCellValue();

	}
}
