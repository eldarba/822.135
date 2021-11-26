package a;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DefaultIOObjects {

	public static void main(String[] args) {
		InputStream in = System.in;
		OutputStream out = System.out;
		OutputStream err = System.err;

		try {
			out.write('A');
			out.write(49);
			out.flush();

			err.write(65);
			err.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			int c = in.read();
			out.write(c);
			out.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
