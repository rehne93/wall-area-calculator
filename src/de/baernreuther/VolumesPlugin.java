package de.baernreuther;

import com.eteks.sweethome3d.plugin.Plugin;
import com.eteks.sweethome3d.plugin.PluginAction;

public class VolumesPlugin extends Plugin {

	@Override
	public PluginAction[] getActions() {			
		return new PluginAction[] { new WallAreaCalculationAction(getHome()) };
	}

}
