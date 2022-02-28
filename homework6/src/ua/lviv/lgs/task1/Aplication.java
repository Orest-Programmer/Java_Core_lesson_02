package ua.lviv.lgs.task1;

public class Aplication {

	public static void main(String[] args) {
		hourWorker hw = new hourWorker(100, 200);
		fixMounthWorker fmw = new fixMounthWorker(1000, 5000);
		hw.salary();
		fmw.salary();
	
	}

}
