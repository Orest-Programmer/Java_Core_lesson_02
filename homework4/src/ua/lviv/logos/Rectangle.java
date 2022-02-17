package ua.lviv.logos;

public class Rectangle {
	int width;
	int height;
	int per;
	int squ;
	
	Rectangle() {

	}

	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void Perimeter() {
		this.per = (this.width + this.height) * 2;
		System.out.println("Периметр прямокутника = " + this.per);
	}

	public void Square() {
		this.squ = this.height * this.width;
		System.out.println("Площа прямокутника = " + this.squ);
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	//Commit
	
}
