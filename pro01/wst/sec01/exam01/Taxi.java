package sec01.exam01;

public class Taxi implements Vehicle {
	@Override
	public void run() {
		System.out.println("�ýð� �޸��ϴ�.");
	}
    public void checkFare() {
    	System.out.println("�°��� �����ϴ�.");
    }
}
