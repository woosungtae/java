package test;

public class tree4 {

	public static void main(String[] args) {
		String output = "";

				for (int i = 10; i > 0; i--) {
				for (int j = 10; j >i; j--) {
				output += " ";
						
				}
				for (int k = 0; k < 2 * i - 1; k++) {
				output += '*';
				}
				output += '\n';
				}

System.out.println(output);
	}

}
