package ua.lviv.lgs.task;

public class aircraftControl {
	int a;

	void moveUp(int a) {
		this.a = a;
		int rand = 0 + (int) (Math.random() * a);
		System.out.println("Відстань на яку буде переміщуватись даний корабель у верх : " + rand + " км.");
	}

	void moveDown(int a) {
		this.a = a;
		int rand = 0 + (int) (Math.random() * a);
		System.out.println("Відстань на яку буде переміщуватись даний корабель у низ : " + rand + " км.");
	}

	void moveLeft(int a) {
		this.a = a;
		int rand = 0 + (int) (Math.random() * a);
		System.out.println("Відстань на яку буде переміщуватись даний корабель в ліво : " + rand + " км.");
	}

	void moveRight(int a) {
		this.a = a;
		int rand = 0 + (int) (Math.random() * a);
		System.out.println("Відстань на яку буде переміщуватись даний корабель в право : " + rand + " км.");
	}
}
