package sec04.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car www = new Car();
		
		www.setGas(10); //setGas
		
		boolean gasState = www.isLeftGas(); //isLeftGas
		if(gasState) {
			System.out.println("����մϴ�.");
			www.run(); //run
		}
		if(www.isLeftGas()) { //isLeftGas
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		}else {
			System.out.println("gas�� �����ϼ���.");
		}
	}

}
