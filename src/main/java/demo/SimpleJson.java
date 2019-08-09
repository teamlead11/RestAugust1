package demo;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class SimpleJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createEmployee();
	}

	public static void createEmployee() {

		JSONObject emp1 = new JSONObject();
		emp1.put("Name", "Bala");
		emp1.put("Age", 26);
		emp1.put("Salary", 10000);

		JSONArray arraemp1 = new JSONArray();
		arraemp1.add("car");
		arraemp1.add("bike");

		emp1.put("VehicleDetails", arraemp1);

		JSONObject adressemp1 = new JSONObject();
		adressemp1.put("streetadress", "street1");
		adressemp1.put("City", "Chennai");
		adressemp1.put("Pin", 600096);

		emp1.put("Adress", adressemp1);
		
		System.out.println(emp1);
	}
}
