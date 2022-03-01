package ua.lviv.lgs.task;

public abstract class Plane extends aircraftControl{
	int width = 7;
	int height = 10;
	int weight = 7000;
	void startEngines() {
		int rand = 20 + (int) (Math.random() * 88);
		System.out.println("Готовність до взльоту, залишилось "+ rand + " хв.");
	}
	void takeoffPlane() {
		double rand = 0 + (int) (Math.random() * 1000);
		System.out.println("Літак пролетить "+ rand +" км. на повному баку палива!");
	}
	void landingPlane() {
		System.out.println("Літак іде на посадку!");
	}
}
