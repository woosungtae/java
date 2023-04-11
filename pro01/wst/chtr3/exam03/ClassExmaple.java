package chtr3.exam03;

import java.security.Key;

public class ClassExmaple {

	public static void main(String[] args) throws Exception {
		
		Class Key = Key.class;
		

		
		//Class Key = Class.forName("chtr3.exam03.Key");
		System.out.println(Key.getName());
		System.out.println(Key.getSimpleName());
		System.out.println(Key.getPackageName());
		
	}

}
