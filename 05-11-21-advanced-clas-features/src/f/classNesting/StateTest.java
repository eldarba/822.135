package f.classNesting;

import f.classNesting.State.Citizen;

public class StateTest {

	public static void main(String[] args) {

		State israel = new State("Israel");
		State france = new State("France");
		Citizen zvi = israel.new Citizen("Zvi");
		Citizen pier = france.new Citizen("Pier");

		System.out.println(zvi.getName());
		System.out.println(zvi.getStateName());

		System.out.println(pier.getName());
		System.out.println(pier.getStateName());

	}

}
