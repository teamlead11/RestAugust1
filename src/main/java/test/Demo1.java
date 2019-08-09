package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findByStatus();
	}

	public static void createPet() {
		RequestSpecification request = RestAssured.with();
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		headers.put("api_key", "test@123");
		headers.put("Username", "test");
		headers.put("Password", "abc123");
		Pet pet = new Pet();
		pet.setName("zzzz");
		pet.setId(22);
		pet.setStatus("sold");

		Category category = new Category();
		category.setId(11);
		category.setName("Toy");
		pet.setCategory(category);

		List<String> phurl = new ArrayList<String>();
		phurl.add("url1");
		phurl.add("url2");
		pet.setPhotoUrls(phurl);

		Tags tag1 = new Tags();
		tag1.setId(13);
		tag1.setName("tag1");

		Tags tag2 = new Tags();
		tag2.setId(14);
		tag2.setName("tag2");

		List<Tags> tagList = new ArrayList<Tags>();
		tagList.add(tag1);
		tagList.add(tag2);

		pet.setTags(tagList);

		Response response = request.headers(headers).baseUri("https://petstore.swagger.io/v2/").body(pet).post("pet");
		Assert.assertEquals(200, response.getStatusCode());
		
	}

	public static void findByPetId() {

		RequestSpecification request = RestAssured.with();
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		headers.put("api_key", "test@123");
		headers.put("Username", "test");
		headers.put("Password", "abc123");
		Response response = request.headers(headers).baseUri("https://petstore.swagger.io/v2/").get("pet/22");
		Pet petobj = response.as(Pet.class);
		System.out.println(petobj.getName());
		System.out.println(petobj.getId());
		System.out.println(petobj.getCategory().getId());
		System.out.println(petobj.getCategory().getName());
		Assert.assertEquals(22, petobj.getId());
		Assert.assertEquals("sold", petobj.getStatus());
	}

	public static void findByStatus() {

		RequestSpecification request = RestAssured.with();
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		headers.put("api_key", "test@123");
		headers.put("Username", "test");
		headers.put("Password", "abc123");
		Response response = request.headers(headers).baseUri("https://petstore.swagger.io/v2/").get("pet/findByStatus?status=sold");
		Pet[] petobj = response.as(Pet[].class);
		
		for(int i=0;i<petobj.length;i++) {
		Assert.assertEquals("sold", petobj[i].getStatus());
		System.out.println(petobj[i].getStatus());
		}
	}

}
