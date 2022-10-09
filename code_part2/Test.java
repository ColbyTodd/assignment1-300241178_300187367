package seg2105Assignment1Part2;

public class Test {

	public static void main(String[] args) {
		Address[] addresses = new Address[5];
		Address addr1 = new Address("King Edward", 800, "K1N6N5");
		Address addr2 = new Address("Queen",48,"K1P1N2");
		
		addresses[0]=addr1;
		addresses[1]=addr2;
		
		Employee employee1 = new Employee("Falcao",40,15.50,addresses);
		//System.out.println(employee1.getAddress(0).getStreet());
	}
	
}
