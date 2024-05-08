package de.baernreuther.areacalculation;

import com.eteks.sweethome3d.model.Wall;

public class NullCalculator implements AreaCalculator {

	@Override
	public WallAreaResult calculateArea(Wall wall) {
		return new WallAreaResult(0, 0, 0);
	}

}
