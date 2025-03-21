package Hashset;

import java.util.Arrays;

public class Planet {

	String name;
	int moons;
	boolean ring;
	String[]atmosphere;

	public Planet(String name, int moons, boolean ring, String[] atmosphere) {
		super();
		this.name = name;
		this.moons = moons;
		this.ring = ring;
		this.atmosphere = atmosphere;
	}

	@Override
	public String toString() {
		return "Planet [name=" + name + ", moons=" + moons + ", ring=" + ring + ", atmosphere="
				+ Arrays.toString(atmosphere) + "]";
	}
	
	
}
