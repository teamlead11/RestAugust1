package testpack;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		st.createStudent();
	}

	public void createStudent() {

		JSONObject std1 = new JSONObject();
		std1.put("Name", "Gopi");
		std1.put("Age", 28);
		std1.put("Location", "Chennai");
		std1.put("Married", false);
		
		
		JSONArray car= new JSONArray();
		car.add("BMW");
		car.add("Mercedez");
		car.add("Audi");
		
		std1.put("carList", car);	
		JSONObject companyDetails = new JSONObject();
		companyDetails.put("Company Name", "Merit");
		companyDetails.put("DOJ", "11-01-2019");
		companyDetails.put("Salary", 60000);
		
		std1.put("CompanyDetails", companyDetails);
		
		System.out.println(std1);

	}

}
