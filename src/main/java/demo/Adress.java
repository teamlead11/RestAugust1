package demo;

public class Adress {
	private String StreetAdress;
	private int pin;
	private String city;

	public String getStreetAdress() {
		return StreetAdress;
	}

	public void setStreetAdress(String streetAdress) {
		StreetAdress = streetAdress;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	  @Override public String toString() { return "Adress [StreetAdress=" +
	  StreetAdress + ", pin=" + pin + ", city=" + city + "]"; }
	 

	
}
