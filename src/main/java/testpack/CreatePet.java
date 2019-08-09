package testpack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreatePet {

	public static void main(String[] args) {
		getPetDetails();

	}

	public static void createPet() {
		RequestSpecification request = RestAssured.with();
		request.baseUri("https://petstore.swagger.io/v2");
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		Pet pet = new Pet();
		pet.setId(6759);
		pet.setName("warner");
		pet.setStatus("sold");
		Category cats = new Category();
		cats.setId(22);
		cats.setName("Toy");
		pet.setCategory(cats);
		List<String> url = new ArrayList<String>();
		url.add("url1");
		url.add("url2");
		pet.setPhotoUrls(url);
		Tags tag1 = new Tags();
		tag1.setId(1);
		tag1.setName("tag1");
		Tags tag2 = new Tags();
		tag2.setId(2);
		tag2.setName("tag2");
		List<Tags> taglist = new ArrayList<Tags>();
		taglist.add(tag1);
		taglist.add(tag2);
		pet.setTags(taglist);
		Response response = request.headers(headers).body(pet).post("/pet");
		System.out.println(response.getStatusCode());
		Assert.assertEquals(200, response.getStatusCode());
	}

	public static void getPetDetails() {
		RequestSpecification request = RestAssured.with();
		request.baseUri("https://petstore.swagger.io/v2");
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		Response response = request.headers(headers).get("/pet/6759");
		Pet pet = response.as(Pet.class);
		Assert.assertEquals("warner", pet.getName());
		System.out.println(response.prettyPrint());
	}
}
