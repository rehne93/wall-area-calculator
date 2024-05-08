/**
 * 
 */
package de.baernreuther.areacalculation;

import com.eteks.sweethome3d.model.Wall;

/**
 * 
 */
public class RectangleCalculator implements AreaCalculator {

	@Override
	public WallAreaResult calculateArea(Wall wall) {
		double areaCm2 = wall.getHeight() * wall.getLength();

		WallAreaResult result =  new WallAreaResult(areaCm2, wall.getLeftSideColor(), wall.getRightSideColor());
		return result;

	}

}
