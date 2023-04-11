package sec01.exam01;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		
		Bus e = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(e);
		driver.drive(taxi);
			

	}

}
