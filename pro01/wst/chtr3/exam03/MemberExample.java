package chtr3.exam03;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("blue");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1�� obj2�� �����մϴ�");
		}else {
			System.out.println("obj1�� obj2�� �������� �ʽ��ϴ�.");
		}

		if(obj1.equals(obj3)) {
			System.out.println("obj1�� ob3�� �����մϴ�");
		}else {
			System.out.println("obj1�� obj3�� �������� �ʽ��ϴ�.");
		}

	}

}
