package sec01.exam03;

public class Television implements RemoteControl {
	//�ʵ�
	private int volume;
	
	//turnOn() �߻�޼ҵ��� ���� �޼ҵ�
	public void turnOn() {
		System.out.println("TV�� �մϴ�");
	}
	//turnOff()�߻�޼ҵ��� ���� �𽺵�
	public void turnOff() {
		System.out.println("TV�� ���ϴ�");
	}
	//setVolume() �߻� �޼ҵ��� ���� �޼ҵ�
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
			System.out.println("�ִ�ġ��");
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� TV ����: " + this.volume);
	}

}
