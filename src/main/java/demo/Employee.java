package demo;

import java.util.List;

public class Employee {

	private String name;
	private Integer age;
	private Integer salary;
	private List<String> vehicleDetails;
	private Adress adress;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public List<String> getVehicleDetails() {
		return vehicleDetails;
	}

	public void setVehicleDetails(List<String> vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", vehicleDetails=" + vehicleDetails
				+ ", adress=" + adress + "]";
	}

}
