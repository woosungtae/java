package chtr.exam06.mt;

public class ThreadB extends Thread {

	//스레드 이름 X Thread-1
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName() + " 가 출력한 내용");
		}
	}

}


