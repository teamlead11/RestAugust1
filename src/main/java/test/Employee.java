package test;

import java.util.List;

public class Employee {

	private String name;
	private int age;
	private Boolean isPermanent;
	private List<String> vehicleDeatails;
	private PrevEmployment preemp;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Boolean getIsPermanent() {
		return isPermanent;
	}

	public void setIsPermanent(Boolean isPermanent) {
		this.isPermanent = isPermanent;
	}

	public List<String> getVehicleDeatails() {
		return vehicleDeatails;
	}

	public void setVehicleDeatails(List<String> vehicleDeatails) {
		this.vehicleDeatails = vehicleDeatails;
	}

	public PrevEmployment getPreemp() {
		return preemp;
	}

	public void setPreemp(PrevEmployment preemp) {
		this.preemp = preemp;
	}

}
