package ua.lviv.lgs.task1;

public class hourWorker implements Salary {

	int minSal;
	int maxSal;

	public hourWorker(int minSal, int maxSal) {
		this.minSal = minSal;
		this.maxSal = maxSal;
	}

	@Override
	public void salary() {
		System.out.println("Human has a day salary from " + this.minSal + "$ to " + maxSal + "$ /day");
	}

}
