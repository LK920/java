package p373;

import p372.Bus;
import p372.Driver;

public class DriverExample {
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		Bus b = new Bus();
		Taxi t = new Taxi();
		
		driver.drive(t);
		driver.drive(b);
	}

}
