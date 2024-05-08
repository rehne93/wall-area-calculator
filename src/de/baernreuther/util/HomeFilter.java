package de.baernreuther.util;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.eteks.sweethome3d.model.Home;
import com.eteks.sweethome3d.model.HomeObject;
import com.eteks.sweethome3d.model.Wall;

public class HomeFilter {

	private Home home;

	public HomeFilter(Home house) {
		this.home = house;
	}

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
