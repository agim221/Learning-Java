package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ValidationUtil {
	public static void main(String[] args) throws TestException {
		
		try(BufferedReader buffer = new BufferedReader(new FileReader("test.txt"))) {
			while(true) {
				String text = buffer.readLine();
				if(text == null) {
					break;
				}
				System.out.println(text);
			}
		} catch(IOException e) {
			System.out.println("File tersebut tidak ada");
		}
	}
}
