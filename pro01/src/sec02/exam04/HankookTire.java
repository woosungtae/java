package sec02.exam04;

public class HankookTire extends Tire {
	//�ʵ�
	//������
	public HankookTire (String location,int maxRotation) {
		super(location,maxRotation);
	}
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"HankookTire ����:"+(maxRotation-accumulatedRotation) +"ȸ");
			return false;
			
		}else {
			System.out.println("***"+location+"HankookTire ��ũ***");
			return false;
		}
	}

}
