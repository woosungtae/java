package test;

public class tree3 {

	public static void main(String[] args) {
		String output = "";
				for (int i = 1; i < 15; i++) {
				for (int j = 15; j > i; j--) {
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
