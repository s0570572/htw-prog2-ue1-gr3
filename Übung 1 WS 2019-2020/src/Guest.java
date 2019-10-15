
public class Guest {

	private String gname;
	private Address privateAddress;
	private Address workAddress;
		
	public Guest(String gname) {
		super();
		this.gname = gname;
	}

	public String getGname() {
		return gname;
	}


	public void setGname(String gname) {
		this.gname = gname;
	}


	public Address getPrivateAddress() {
		return privateAddress;
	}


	public void setPrivateAddress(Address address) {
		this.privateAddress = address;
	}


	public Address getWorkAddress() {
		return workAddress;
	}


	public void setWorkAddress(Address address) {
		this.workAddress = address;
	}
	
	public String toString() {
		//return Guest [gname=" gname, "];
		return null;
	}
}
