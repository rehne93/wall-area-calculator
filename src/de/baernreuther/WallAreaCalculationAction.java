package de.baernreuther;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.eteks.sweethome3d.model.Home;
import com.eteks.sweethome3d.model.Wall;
import com.eteks.sweethome3d.plugin.PluginAction;

import de.baernreuther.areacalculation.AreaCalculatorFactory;
import de.baernreuther.areacalculation.WallAreaResult;
import de.baernreuther.util.HomeFilter;

public class WallAreaCalculationAction extends PluginAction {

	private Home home;
	private AreaCalculatorFactory areaCalculatorFactory = new AreaCalculatorFactory();
	

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
		
		List<WallAreaResult> areaMessages = new ArrayList<WallAreaResult>();
		
		for(Wall w: walls) {
			// TODO: Farben als Strings? -> funktioniert über "color" klasse möglicherweise
			// TODO: Dreieck berechnung wenn Höhe unterschiedlich
			// TODO: ArcExtend berechnung
			areaMessages.add(this.areaCalculatorFactory.getCalculator(w).calculateArea(w));

		}

		if (areaMessages.isEmpty()) {
			JOptionPane.showMessageDialog(null, "No Walls found");
		} else {
			JOptionPane.showMessageDialog(null, this.collectMessage(areaMessages));
		}
	}

	private String collectMessage(List<WallAreaResult> results) {
		StringBuilder sb = new StringBuilder();
		for (WallAreaResult m : results) {
			sb.append(m);
			sb.append("\n");
		}
		return sb.toString();
	}

}
