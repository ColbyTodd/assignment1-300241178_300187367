package seg2105Assignment1Part2;

public class Employee {
	private String name;
	private double hours;
	private double rate;
	private Address[] address = new Address[5];
	
	public Employee(String name, double hours, double rate, Address[] address) {
		this.name=name;
		this.hours=hours;
		this.rate=rate;
		this.address=address;
	}
	
	public String getName() {
		return name;
	}
	
	public double getHours() {
		return hours;
	}
	
	public double getRate() {
		return rate;
	}

	public Address getAddress(int i) {//returns the address at index i
		if(i>5 || i<0) {
			System.out.println("invalid index");
			return null;
		}
		return address[i];
	}
}
