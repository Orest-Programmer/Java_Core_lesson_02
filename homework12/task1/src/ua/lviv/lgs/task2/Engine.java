package ua.lviv.lgs.task2;

public class Engine{
	int numberOfCylinders;

	public Engine(int numberOfCylinders) {
		super();
		this.numberOfCylinders = numberOfCylinders;
	}

	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}

	@Override
	public String toString() {
		return "Engine [numberOfCylinders=" + numberOfCylinders + "]";
	}
	
}
