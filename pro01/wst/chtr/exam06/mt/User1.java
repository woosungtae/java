package chtr.exam06.mt;

public class User1 extends Thread {
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User 1");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(100);
	}

}
