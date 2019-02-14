package testpack;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PetStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findByStatus();
	}

	public static void findByStatus() {
		RequestSpecification request = RestAssured.with();
		Response response = request.baseUri("https://petstore.swagger.io/v2/").get("pet/findByStatus?status=sold");
		//System.out.println(response);
		Pet[] pet = response.as(Pet[].class);
		System.out.println(pet);
		/*
		 * System.out.println(pet[0].getName()); System.out.println(pet[1].getName());
		 * System.out.println(pet[2].getName()); System.out.println(pet[3].getName());
		 * System.out.println(pet[0].getId());
		 * System.out.println(pet[0].getPhotoUrls());
		 */
		
	}
}
