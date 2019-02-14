package testpack;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createUser();
	}
	
	public static void createUser() {
		RequestSpecification request = RestAssured.with();
		HashMap<String,String> headers=new HashMap<String,String>();
		headers.put("Content-Type", "application/json");
		
		User user1 = new User();
		user1.setId(98761);
		user1.setFirstName("greens");
		user1.setLastName("tech");
		user1.setUsername("greenstech");
		user1.setEmail("test@gmail.com");
		user1.setPassword("test@123");
		user1.setPhone("76543212");
		user1.setUserStatus(0);
		Response response = request.baseUri("https://petstore.swagger.io/v2/").headers(headers).body(user1).post("user");
	
		System.out.println(response.getStatusCode());
	}

}
