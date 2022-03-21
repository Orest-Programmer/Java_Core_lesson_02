package ua.lviv.lgs.task2;

public class Wheel {
	int wheelDiameter;
	String wheelMaterial;
	public Wheel(int wheelDiameter, String wheelMaterial) {
		super();
		this.wheelDiameter = wheelDiameter;
		this.wheelMaterial = wheelMaterial;
	}
	public int getWheelDiameter() {
		return wheelDiameter;
	}
	public String getWheelMaterial() {
		return wheelMaterial;
	}
	@Override
	public String toString() {
		return "Wheel [wheelDiameter=" + wheelDiameter + ", wheelMaterial=" + wheelMaterial + "]";
	}
	
}
