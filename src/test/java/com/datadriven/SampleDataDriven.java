package com.datadriven;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.common.BaseClass;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class SampleDataDriven extends BaseClass {

	@Test(dataProvider = "SampleData")
	private void tc0(String key1, String value1, String key2, String value2) {
		requestObject("https://reqres.in/");
		JSONObject jsonObject = new JSONObject();
		jsonObject.put(key1, value1);
		jsonObject.put(key2, value2);
		System.out.println(key1+":"+ value1+" "+ key2+":"+ value2);
		requestSpecification.body(jsonObject.toJSONString());
		Response response = responseObject("POST", "api/users");
		getResponseCode(response);
		getResponseBody(response);

	}

	@DataProvider(name = "SampleData")
	private Object[][] dataSupply() throws IOException {
		return new Object[][] {

				{ readFromExcel(0, 0), readFromExcel(1, 0), readFromExcel(0, 1), readFromExcel(1, 1) },
				{ readFromExcel(0, 0), readFromExcel(2, 0), readFromExcel(0, 1), readFromExcel(2, 1) },
				{ readFromExcel(0, 0), readFromExcel(3, 0), readFromExcel(0, 1), readFromExcel(3, 1) },
				{ readFromExcel(0, 0), readFromExcel(4, 0), readFromExcel(0, 1), readFromExcel(4, 1) }

		};
	}

}
