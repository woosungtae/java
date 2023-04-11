package chtr.exam06.mt;

public class User2 extends Thread {
private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User 2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50);
	}

}


