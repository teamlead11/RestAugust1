package testpack;

import java.util.HashMap;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getUser();
	}

	public static void getUser() {
		RequestSpecification request = RestAssured.with();
		HashMap<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		Response response = request.baseUri("https://petstore.swagger.io/v2").headers(headers).get("/user/Bala25");
		//System.out.println(response.getStatusCode());
		System.out.println(response.getBody().prettyPrint());
		UserModel user = response.as(UserModel.class);
		System.out.println(user.getUsername());
	}

	public static void createUser() {
		RequestSpecification request = RestAssured.with();
		UserModel user = new UserModel();
		user.setId(8754);
		user.setFirstName("Bala");
		user.setLastName("Modify");
		user.setEmail("test@gmail.com");
		user.setPassword("test@123");
		user.setPhone(123);
		user.setUsername("Bala25");
		user.setUserStatus(0);

		HashMap<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");

		Response response = request.baseUri("https://petstore.swagger.io/v2").headers(headers).body(user).put("/user/Bala25");
		System.out.println(response.getBody().prettyPrint());
		Assert.assertEquals(200, response.getStatusCode());
	}
}
