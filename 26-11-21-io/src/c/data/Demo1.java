package c.data;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) {
		// 1. long
		// 2. byte
		// 3. String
		// 4. double
		// 5. boolean

		// insert to a files/primitives.data
		File dir = new File("files");
		File file = new File(dir, "primitives.data");

		dir.mkdirs(); // create the directory in the FS

		try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));) {

			out.writeLong(1500);
			out.writeByte(22);
			out.writeUTF("this is a message");
			out.writeDouble(123.54);
			out.writeBoolean(true);

			System.out.println("data written to " + file);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
