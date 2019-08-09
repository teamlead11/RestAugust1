package demo;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Rest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject emp1 = new JSONObject();
		emp1.put("EmpName", "Karthi");
		emp1.put("empID", 123);
		emp1.put("salary", 3000);
		emp1.put("fresher", false);
		
		JSONArray vehicleforEmp1 = new JSONArray();
		vehicleforEmp1.add("Swift");
		vehicleforEmp1.add("Duke");
		
		emp1.put("vehicles", vehicleforEmp1);
		
		JSONObject emp1prev = new JSONObject();
		emp1prev.put("preCompanyName", "xyz");
		emp1prev.put("lastDrwanSalary", 2000);
		
		emp1.put("PreviousCompanyDetails", emp1prev);
		System.out.println(emp1);
	}

}
