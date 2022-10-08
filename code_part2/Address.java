package seg2105Assignment1Part2;

public class Address {
	private String street;
	private int number;
	private String postal;
	
	public Address(String st, int num, String post) {
		street=st;
		number=num;
		postal=post;
	}
	
	public String getStreet() {
		return street;
	}
	public int getNumber() {
		return number;
	}
	public String getPostal() {
		return postal;
	}
}
