package chtr.exam06.mt;

public class PrintThread2 extends Thread {
	public void run() {
		try {
			while(true){
				System.out.println("���� ��");
				Thread.sleep(10);
			}
		}catch(InterruptedException e) {}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}

}
