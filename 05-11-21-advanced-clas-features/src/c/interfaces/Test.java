package c.interfaces;

import d.animals.Bat;
import d.animals.Hawk;
import e.vehicles.Airplane;

public class Test {

	public static void main(String[] args) {

		Flyer f; // reference of type Flyer

		f = new Bat();
		f.fly();

		f = new Airplane();
		f.fly();

		Flyer[] flyers = new Flyer[5];
		flyers[0] = new Hawk();
		flyers[1] = new Airplane();

	}
}
