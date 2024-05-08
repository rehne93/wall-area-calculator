package de.baernreuther.areacalculation;

import com.eteks.sweethome3d.model.Wall;

/**
 * Defines the possibility to calculate the Area for a given Object
 */
public interface AreaCalculator {

	
	/**
	 * Calculates the Area in m^2 for a given wall.
	 * @param wall Wall to calculate the Area for
	 * @return 
	 */
	WallAreaResult calculateArea(Wall wall);
	
}
