package f.synch;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		PrinterThread printer = new PrinterThread(list);
		DeleteThread deleter = new DeleteThread(list);
		printer.start();
		deleter.start();

	}

}
