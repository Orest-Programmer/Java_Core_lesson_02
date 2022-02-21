package ua.lviv.lgs.hm1;

public class Aplication {

	public static void main(String[] args) {
		Robot defaultRobot = new Robot();
		Robot coffeRobot = new CoffeRobot();
		Robot robotDancer = new RobotDancer();
		Robot robotCoocker = new RobotCoocker();
		defaultRobot.work();
		coffeRobot.work();
		robotDancer.work();
		robotCoocker.work();

		Robot arr[] = new Robot[4];
		arr[0] = defaultRobot;
		arr[1] = coffeRobot;
		arr[2] = robotDancer;
		arr[3] = robotCoocker;
		for(int i = 0; i < arr.length; i++) {
			arr[i].work();
		}
	}

}
