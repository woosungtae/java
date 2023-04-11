package chtr.exam06.mt;

public class ThreadA extends Thread{
	
	//스레드 이름 부여
	public ThreadA() {
		setName ("ThreadA");
	}
	
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName() + " 가 출력한 내용");
		}
	}

}
