package demo;

import java.util.ArrayList;
import java.util.List;

public class Call {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		emp1.setName("Bala");
		emp1.setAge(28);
		emp1.setSalary(10000);

		List<String> emp1List = new ArrayList<String>();
		emp1List.add("car");
		emp1List.add("Bike");

		emp1.setVehicleDetails(emp1List);

		Adress add = new Adress();
		add.setCity("Chennai");
		add.setPin(60096);
		add.setStreetAdress("Steet1");
		emp1.setAdress(add);
		
		System.out.println(emp1);

	}

}
