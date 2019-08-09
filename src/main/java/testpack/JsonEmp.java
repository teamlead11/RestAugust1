package testpack;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createEmp();
	}

	public static void createEmp() {

		JSONObject emp1 = new JSONObject();
		emp1.put("empid", 987);
		emp1.put("empName", "vinoth");
		emp1.put("designation", "test engineer");
		emp1.put("salary", 15000);
		emp1.put("married", false);

		JSONArray vehicleListemp1 = new JSONArray();
		vehicleListemp1.add("bike");
		vehicleListemp1.add("car");
		emp1.put("vehicle details", vehicleListemp1);

		JSONObject precompDetailsEmp1 = new JSONObject();
		precompDetailsEmp1.put("prevComName", "xyz");
		precompDetailsEmp1.put("lastDrawnsalary", 10000);

		emp1.put("preCompanyDetails", precompDetailsEmp1);
		System.out.println(emp1);

	}
}
