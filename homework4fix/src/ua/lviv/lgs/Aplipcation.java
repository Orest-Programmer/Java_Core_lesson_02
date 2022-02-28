package ua.lviv.lgs;

import java.util.ArrayList;

public class Aplipcation {

	public static void main(String[] args) {
		Robot defaultRobot = new Robot();
		Robot coffeRobot = new CoffeRobot();
		Robot robotDancer = new RobotDancer();
		Robot robotCoocker = new RobotCoocker();
		
		defaultRobot.work();
		coffeRobot.work();
		robotDancer.work();
		robotCoocker.work();
		
		System.out.println("");
		ArrayList<Robot> robotList = new ArrayList<Robot>();
		robotList.add(defaultRobot);
		robotList.add(coffeRobot);
		robotList.add(robotDancer);
		robotList.add(robotCoocker);
		
		for(Robot robot : robotList) {
			robot.work();
		}
	}
}
