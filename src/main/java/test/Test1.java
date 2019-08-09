package test;

import java.util.List;

public class Test1 {
	private int id;
	private String name;
	private String phoneNum;
	private List<String> vehicleDetails;
	private Adress adress;

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public List<String> getVehicleDetails() {
		return vehicleDetails;
	}

	public void setVehicleDetails(List<String> vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

}
