package chtr3.exam05.util;

public class D223sw {

	public static void main(String[] args) {
		String str = " ��� ���α׷��� �ڹ� ���� ���ߵ� �� �ִ�.";
		int index = str.indexOf("�ڹ�");
		if(index == -1 ) {
			System.out.println("�ڹ� ���ڿ��� ���ԵǾ� ���� �ʽ��ϴ�.");
		}else {
			System.out.println("�ڹ� ���ڿ��� ���ԵǾ� �ֽ��ϴ�");
			str = str.replace("�ڹ�", "Java");
             System.out.println("--->"+ str);
		}

	}

}
