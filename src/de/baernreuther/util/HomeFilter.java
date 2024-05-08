package de.baernreuther.util;

import java.util.ArrayList;
import java.util.List;

import com.eteks.sweethome3d.model.Home;
import com.eteks.sweethome3d.model.HomeObject;
import com.eteks.sweethome3d.model.Wall;

public class HomeFilter {

	private Home home;

	public HomeFilter(Home house) {
		this.home = house;
	}

	/**
	 * Returns all walls of the home.
	 * @return List of all walls in the home.
	 */
	public List<Wall> getWalls() {
		List<Wall> walls = new ArrayList<Wall>();
		for (HomeObject homeObject : this.home.getHomeObjects()) {
			if (homeObject instanceof Wall) {
				walls.add((Wall) homeObject);
			}
		}
		return walls;
	}

}
