package de.baernreuther.areacalculation;

import com.eteks.sweethome3d.model.Wall;

/**
 * Factory to decide which calculator is going to be used.
 */
public class AreaCalculatorFactory {

	public AreaCalculator getCalculator(Wall wall) {
		// Straight wall we got here.
		if (wall.getArcExtent() == null && wall.getHeightAtEnd() == null) {
			return new RectangleCalculator();
		}

		return new NullCalculator();
	}

}
