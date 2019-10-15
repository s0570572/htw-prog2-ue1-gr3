
public class Address {
	
	private String street;
	private String housenumber;
	private String plz;
	private String city;
	
	public Address(String street, String housenumber, String plz, String city) {
		super();
		this.street = street;
		this.housenumber = housenumber;
		this.plz = plz;
		this.city = city;
	}


	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHousenumber() {
		return housenumber;
	}

	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}

	public String getPlz() {
		return plz;
	}

	public void setNumberaddition(String plz) {
		this.plz = plz;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
