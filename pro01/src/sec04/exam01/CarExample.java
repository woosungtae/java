package sec04.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car www = new Car();
		
		www.setGas(10); //setGas
		
		boolean gasState = www.isLeftGas(); //isLeftGas
		if(gasState) {
			System.out.println("출발합니다.");
			www.run(); //run
		}
		if(www.isLeftGas()) { //isLeftGas
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요.");
		}
	}

}
