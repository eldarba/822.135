package g.waitAndNotify;

import java.util.ArrayList;
import java.util.List;

public class Stack {

	private List<Integer> list = new ArrayList<>();
	public static final int MAX = 10;

	public synchronized void push(int val) {
		while (list.size() == MAX) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		list.add(val);
		System.out.println(Thread.currentThread().getName() + " produced: " + val);
		System.out.println(list);
		notify();
	}

	public synchronized int pop() {
		while (list.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		notify();
		int val = list.get(list.size() - 1);
		System.out.println(Thread.currentThread().getName() + " consumed: " + val);
		System.out.println(list);
		return list.remove(list.size() - 1);
	}

}
