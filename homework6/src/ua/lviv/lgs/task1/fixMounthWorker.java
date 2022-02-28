package ua.lviv.lgs.task1;

public class fixMounthWorker implements Salary {

	int minSal;
	int maxSal;

	public fixMounthWorker(int minSal, int maxSal) {
		this.minSal = minSal;
		this.maxSal = maxSal;
	}

	@Override
	public void salary() {

		System.out.println("Human has a fix salary from " + this.minSal + "$ to " + maxSal + "$ /mounth");

	}
}
