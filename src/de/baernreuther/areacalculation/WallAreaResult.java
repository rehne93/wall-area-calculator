package de.baernreuther.areacalculation;

import de.baernreuther.util.UnitConverter;

public class WallAreaResult {

	private double areaM2;
	private Integer leftSideColor;
	private Integer rightSideColor;
	
	
	public WallAreaResult(double areaCm2, Integer leftSideColor, Integer rightSideColor) {
		this.areaM2 = UnitConverter.cm2ToM2(areaCm2);
		this.leftSideColor = leftSideColor;
		this.rightSideColor = rightSideColor;
	}


	public double getLeftSideAreaM2() {
		return areaM2;
	}


	public Integer getLeftSideColor() {
		return leftSideColor;
	}


	public Integer getRightSideColor() {
		return rightSideColor;
	}


	@Override
	public String toString() {
		return "Die Wand hat eine Fläche von " + this.areaM2 + " m². Die Farbe rechts entspricht " + this.rightSideColor + ". Die Farbe links entspricht " + this.leftSideColor + ".";
	}
	
	
	
	
	
}
