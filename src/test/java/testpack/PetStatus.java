package testpack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PetStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addPet();
	}

	public static void findByStatus() {
		RequestSpecification request = RestAssured.with();
		Response response = request.baseUri("https://petstore.swagger.io/v2/").get("pet/findByStatus?status=sold");
		// System.out.println(response);
		Pet[] pet = response.as(Pet[].class);
		System.out.println(pet);
		System.out.println(pet[0].getName());
		System.out.println(pet[0].getId());
		System.out.println(pet[2].getName());
		System.out.println(pet[3].getName());
		System.out.println(pet[0].getCategory().getId());
		System.out.println(pet[0].getCategory().getName());
		System.out.println(pet[0].getPhotoUrls().get(0));

	}

	public static void addPet() {
		RequestSpecification request = RestAssured.with();
		Map<String, String> header = new HashMap<String, String>();
		header.put("Content-Type", "application/json");

		Pet pet = new Pet();
		pet.setId(567812);
		pet.setName("HarishNew");
		pet.setStatus("sold");

		List<String> phurl = new ArrayList<String>();
		phurl.add("url1");
		phurl.add("url2");
		pet.setPhotoUrls(phurl);

		Category category = new Category();
		category.setId(21);
		category.setName("toy");
		pet.setCategory(category);

		Tags tag1 = new Tags();
		tag1.setId(23);
		tag1.setName("tag1");

		Tags tag2 = new Tags();
		tag2.setId(24);
		tag2.setName("tag2");

		List<Tags> tagList = new ArrayList<Tags>();
		tagList.add(tag1);
		tagList.add(tag2);

		pet.setTags(tagList);
		Response response = request.baseUri("https://petstore.swagger.io/v2/").headers(header).body(pet).put("pet");
		System.out.println(response.getStatusCode());
	}
}
