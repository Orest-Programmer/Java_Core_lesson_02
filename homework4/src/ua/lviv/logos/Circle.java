package ua.lviv.logos;

public class Circle {

	double r;
	double d;
	double squ;
	double width;
	double p = 3.14;

	Circle() {

	}

	Circle(int r) {
		this.r = r;
		this.d = r * 2;
	}

	public void Square() {
		squ = Math.pow(p * r, 2);
		System.out.println("Площа кола = " + squ);
	}

	public void Width() {
		width = this.p * d;
		System.out.println("Довжина кола = " + width);
	}
	
	@Override
	public String toString() {
		return "Circle [r = "+ r +", d = " + d + ", p = "+ p + "]";
	}
	//Commit
}
