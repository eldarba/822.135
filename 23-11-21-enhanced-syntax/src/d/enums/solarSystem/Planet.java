package d.enums.solarSystem;

public enum Planet {

	// the constant instances
	MERCURY(5, 120), VENUS(7, 150), EARTH(8, 190), MARS(9, 230);

	// attributes
	public final int mass;
	private int orbit;

	// CTOR
	private Planet(int mass, int orbit) {
		this.mass = mass;
		this.orbit = orbit;
	}

	// methods
	public int getOrbit() {
		return orbit;
	}

	public void setOrbit(int orbit) {
		this.orbit = orbit;
	}

}
