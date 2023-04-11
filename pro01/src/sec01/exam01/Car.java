package sec01.exam01;

public class Car {

	public int speed ;
	void run() {
		System.out.println(speed+"으로 달립니다");
	}
	
	
	
	public void speedUp() {
		speed += 1;
	}
	
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}

}
