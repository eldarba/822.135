package c.data;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) {
		// 1. long
		// 2. byte
		// 3. String
		// 4. double
		// 5. boolean

		// insert to a files/primitives.data
		File dir = new File("files");
		File file = new File(dir, "primitives.data");

		try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));) {
			long val1 = in.readLong();
			byte val2 = in.readByte();
			String str = in.readUTF();
			double val4 = in.readDouble();
			boolean b = in.readBoolean();

			System.out.println(val1);
			System.out.println(val2);
			System.out.println(str);
			System.out.println(val4);
			System.out.println(b);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
