package chtr.exam06.mt;

public class ThreadA extends Thread{
	
	//������ �̸� �ο�
	public ThreadA() {
		setName ("ThreadA");
	}
	
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName() + " �� ����� ����");
		}
	}

}
