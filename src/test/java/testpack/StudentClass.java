package testpack;

import java.util.List;

public class StudentClass {

	private String Name;
	private int Age;
	private String Location;
	private Boolean Married;
	private List<String> carList;
	private companyDetails compDetails;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public Boolean getMarried() {
		return Married;
	}

	public void setMarried(Boolean married) {
		Married = married;
	}

	public List<String> getCarList() {
		return carList;
	}

	public void setCarList(List<String> carList) {
		this.carList = carList;
	}

	public companyDetails getCompDetails() {
		return compDetails;
	}

	public void setCompDetails(companyDetails compDetails) {
		this.compDetails = compDetails;
	}

}
