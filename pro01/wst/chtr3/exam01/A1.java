package chtr3.exam01;

public class A1 {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B1 {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}

	    static class C2 {
	    	void method() {
	    		//field1 = 10;
	    		//method1();
	    		
	    		field2 = 10;
	    		method2();
	    	}
	    }
}
