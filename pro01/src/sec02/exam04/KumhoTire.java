package sec02.exam04;

public class KumhoTire extends Tire {
	//�ʵ�
	//������
	public KumhoTire (String location,int maxRotation) {
		super(location,maxRotation);
	}
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"KumhoTire ����:"+(maxRotation-accumulatedRotation) +"ȸ");
			return false;
			
		}else {
			System.out.println("***"+location+"KumhoTire ��ũ***");
			return false;
		}
	}

}