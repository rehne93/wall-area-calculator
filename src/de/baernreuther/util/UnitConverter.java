package de.baernreuther.util;

public class UnitConverter {

	
	/**
	 * Converts an area in cm^2 into m^2.
	 * @param cm2Area Area in cm^2
	 * @return Area in m^2
	 */
	public static double cm2ToM2(double cm2Area) {
		return cm2Area / 10000;
	}
	
}
