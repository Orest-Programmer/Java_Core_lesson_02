package ua.lviv.lgs.interface2;

import ua.lviv.lgs.interface1.Numerable;

public class MyCalculator implements Numerable {
	int a;
	int b;
	
	
	public MyCalculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		
	}

	@Override
	public void plus() {
		System.out.println("a + b = " + (this.a + this.b));
	}

	@Override
	public void minus() {
		
		System.out.println("a - b = " + (this.a - this.b));
	}

	@Override
	public void multiply() {
		System.out.println("a * b = " + (this.a * this.b));
	}

	@Override
	public void devide() {
		System.out.println("a / b = " + (this.a / this.b));
	}

}
