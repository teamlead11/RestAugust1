package test;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JSONObject obj = new JSONObject();
		obj.put("name", "xyz");
		obj.put("age", 22);
		obj.put("Permanent", true);
		
		JSONArray veh1 = new JSONArray();
		veh1.add("car");
		veh1.add("bike");
		
		obj.put("vehicleDetails", veh1);
		
		JSONObject prevEmp = new JSONObject();
		prevEmp.put("prevCompanyName","CTS");
		prevEmp.put("LWD","11112006");
		
		obj.put("preEmployerDetails", prevEmp);
		
		
		
		System.out.println(obj);
		

	}

}
