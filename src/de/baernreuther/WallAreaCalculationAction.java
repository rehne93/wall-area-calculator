package de.baernreuther;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.eteks.sweethome3d.model.Home;
import com.eteks.sweethome3d.model.Wall;
import com.eteks.sweethome3d.plugin.PluginAction;

import de.baernreuther.util.HomeFilter;

public class WallAreaCalculationAction extends PluginAction {

	private Home home;

	public WallAreaCalculationAction(Home home) {
		putPropertyValue(Property.NAME, "Compute volume");
		putPropertyValue(Property.MENU, "Tools");
		// Enables the action by default
		setEnabled(true);

		this.home = home;
	}

	@Override
	public void execute() {
		
		HomeFilter homeFilter = new HomeFilter(this.home);
		List<Wall> walls = homeFilter.getWalls();
		
		List<String> areaMessages = new ArrayList<String>();
		
		for(Wall w: walls) {
			// TODO: Auslagern der Logik
			// TODO: Farben als Strings?
			// TODO: Dreieck berechnung wenn Höhe unterschiedlich
			// TODO: ArcExtend berechnung
			// TODO: Umrechnen in m2 von cm2
			if(w.getArcExtent() == null && w.getHeightAtEnd() == null) {
				double area = w.getHeight() * w.getLength();
				// Default Rectangle
				areaMessages.add("Color " + w.getRightSideColor() + " (right) needs " + area);
				areaMessages.add("Color " + w.getLeftSideColor() + " (left) needs " + area);

			}
		}

		if (areaMessages.isEmpty()) {
			JOptionPane.showMessageDialog(null, "No Walls found");
		} else {
			// Display the result in a message box (\u00b3 is for 3 in supercript)
			JOptionPane.showMessageDialog(null, this.collectMessage(areaMessages));
		}
	}

	private String collectMessage(List<String> messages) {
		StringBuilder sb = new StringBuilder();
		for (String m : messages) {
			sb.append(m);
			sb.append("\n");
		}
		return sb.toString();
	}

}
