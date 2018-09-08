package com.msis;

public class circle {
    point centre;

	public point getCentre() {
		return centre;
	}

	public void setCentre(point centre) {
		this.centre = centre;
	}
    
	public void draw()
	{
	System.out.println("circle drawn at "+centre.getX()+","+centre.getY());
	}
}
