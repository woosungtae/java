package sec04.exam01;

public class CotionueKeyCodeReadExample {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while(true) {
			keyCode=System.in.read();
			System.out.println("keyCode:"+keyCode);
			if(keyCode ==113) {
				break;
			}

}
              System.out.println("Á¾·á");
	}
}