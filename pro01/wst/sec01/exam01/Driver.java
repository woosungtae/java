package sec01.exam01;

public class Driver {
	public void drive(Vehicle vehicle) {
	if(vehicle instanceof Bus) {
		Bus e = (Bus) vehicle;
		e.checkFare();
	}
		
	vehicle.run();
}
}
