package a;

import java.io.IOException;

public class EchoProgram {

	public static void main(String[] args) {

		try {
			int c = System.in.read(); // read the first character
			while (c != 13) {
				System.out.write(c);
				System.out.flush();
				c = System.in.read(); // read the next character
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
