package sec01.exam01;

public class Taxi implements Vehicle {
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
    public void checkFare() {
    	System.out.println("승객이 내립니다.");
    }
}
