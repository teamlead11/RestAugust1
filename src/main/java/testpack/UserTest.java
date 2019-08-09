package testpack;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getUesrDetails();
	}

	public static void getUesrDetails() {

		RequestSpecification request = RestAssured.with();
		request.baseUri("https://petstore.swagger.io/v2");
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		Response response = request.headers(headers).get("user/saravanan1");
		Assert.assertEquals(200, response.getStatusCode());
		UserModel userModel = response.as(UserModel.class);
		Assert.assertEquals(9781, userModel.getId());
		System.out.println(userModel.getId());
		Assert.assertEquals("saravanan1", userModel.getUsername());
		System.out.println(userModel.getUsername());
	}
	
	
}
