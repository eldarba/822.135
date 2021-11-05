package d.animals;

import c.interfaces.Flyer;
import c.interfaces.Navigator;

public class Hawk extends Bird implements Flyer, Navigator {

	@Override
	public void speak() {
		System.out.println("speak like a hawk");
	}

	@Override
	public void fly() {
		System.out.println("fly like a hawk");
	}

	@Override
	public void navigate() {
		System.out.println("navigate like a hawk");
	}

}
