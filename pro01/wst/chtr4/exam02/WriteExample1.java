package chtr4.exam02;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample1 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test9.txt");
		
		char[] array = { 'A' , 'B', 'C','D','E'};
		
		writer.write(array,1,3);
		
		writer.flush();
		writer.close();

	}

}