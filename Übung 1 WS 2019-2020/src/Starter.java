
public class Starter {

	public static void main(String[] args) {
		
		Guest matt = new Guest("Matt");
		Guest anna = new Guest("Anna");
		
		Address address = new Address("Stephanstr.", "11a", "01235", "Stadt");
		
		matt.setPrivateAddress(address);
		anna.setPrivateAddress(address);
		
		System.out.println(matt);
		System.out.println(anna);
	}
}
