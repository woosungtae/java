package sec01.exam01;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			findClass();
		}catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}

	}

	
	  public static void findClass() throws ClassNotFoundException{
		  Class claszz = Class.forName("java.lang.String");
	  }
}
