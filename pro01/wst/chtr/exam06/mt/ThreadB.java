package chtr.exam06.mt;

public class ThreadB extends Thread {

	//������ �̸� X Thread-1
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName() + " �� ����� ����");
		}
	}

}


