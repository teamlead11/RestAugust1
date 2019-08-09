package rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PetRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getPetInformation();
	}

	public static void getPetInformation() {
		RequestSpecification request = RestAssured.with();
		HashMap<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		Response response = request.baseUri("https://petstore.swagger.io/v2").headers(headers).get("/pet/875659");
		Assert.assertEquals(200, response.getStatusCode());
		System.out.println(response.getBody().prettyPrint());
		Pet pet = response.as(Pet.class);
		Assert.assertEquals(875659, pet.getId());

	}

	public static void createUser() {

		RequestSpecification request = RestAssured.with();
		HashMap<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		headers.put("api_key", "test@123");
		headers.put("Username", "test");
		headers.put("Password ", "abc123");
		UserModel user = new UserModel();
		user.setFirstName("praveen");
		user.setLastName("smart");
		user.setEmail("praveen@gmail.com");
		user.setPassword("test@123");
		user.setPhone("1234");
		user.setUserStatus(0);
		user.setId(5656);
		user.setUsername("smartpraveen");
		Response response = request.headers(headers).post("https://petstore.swagger.io/v2/user");
		System.out.println(response.prettyPrint());
		Assert.assertEquals(200, response.getStatusCode());
		
		
	}

	public static void createPet() {
		RequestSpecification request = RestAssured.with();
		HashMap<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		headers.put("api_key", "test@123");
		headers.put("Username", "test");
		headers.put("Password ", "abc123");
		Pet pet = new Pet();
		//pet.setName("tommy");
		pet.setId(5656);
		pet.setStatus("pending");
		
		List<String> photoUrl = new ArrayList<String>();
		photoUrl.add("url1");
		photoUrl.add("url2");
		pet.setPhotoUrls(photoUrl);
		
		List<Tags> tagList = new ArrayList<Tags>();
		Tags tag1 = new Tags();
		tag1.setId(1);
		tag1.setName("tag1");
		Tags tag2 = new Tags();
		tag2.setId(2);
		tag2.setName("tag2");
		tagList.add(tag1);
		tagList.add(tag2);
		pet.setTags(tagList);
		Category cats = new Category();
		cats.setId(23);
		cats.setName("toy");
		
		pet.setCategory(cats);
		
		Response response = request.baseUri("https://petstore.swagger.io/v2/").headers(headers).body(pet).post("pet");
		System.out.println(response.getStatusCode());
		
	}
}
