package sec01.exam01;

public class Car {

	public int speed ;
	void run() {
		System.out.println(speed+"���� �޸��ϴ�");
	}
	
	
	
	public void speedUp() {
		speed += 1;
	}
	
	public final void stop() {
		System.out.println("���� ����");
		speed = 0;
	}

}
