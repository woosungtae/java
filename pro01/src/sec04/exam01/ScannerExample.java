package sec04.exam01;

import java.util.Scanner;

public class ScannerExample {

public static void main(String[] args)throws Exception {
	Scanner scanner = new Scanner(System.in);
	String inputData;
	
	while(true) {
		inputData = scanner.nextLine();
		System.out.println("�Էµȹ��ڿ�:\""+inputData+"\"");
		if(inputData.equals("q")) {
			break;
		}
	}
	System.out.println("����");
	}

}
