package d.enums.solarSystem;

import java.util.Arrays;
import java.util.Scanner;

public class SolarSystemApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// use values method to get an array of all constants
		Planet[] planets = Planet.values();
		System.out.println("enter planet name " + Arrays.toString(planets));
		String planetName = sc.nextLine();
		sc.close();

		// use valueOf to convert from String to enum
		Planet planet = Planet.valueOf(planetName);
		System.out.println(planet);
		// use ordinal method to get instance index
		System.out.println("order: " + (planet.ordinal() + 1));
		// use our own defined methods:
		System.out.println("mass: " + planet.mass);
		System.out.println("orbit: " + planet.getOrbit());

	}

}
