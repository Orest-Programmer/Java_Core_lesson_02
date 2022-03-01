package ua.lviv.lgs.task;

public class Aplication {

	public static void main(String[] args) {
		System.out.println("Start");
		Su_27 su_27 = new Su_27(700, "black");

		su_27.startEngines();
		su_27.takeoffPlane();
		su_27.moveUp(32);
		su_27.moveDown(20);
		su_27.moveLeft(24);
		su_27.moveRight(13);
		su_27.techStels();
		su_27.nuclearStrike();
		su_27.turboAcceleration();
		su_27.landingPlane();
	}

}
