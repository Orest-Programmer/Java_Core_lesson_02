package ua.lviv.lgs.task;

public class aircraftControl {
	int a;

	void moveUp(int a) {
		this.a = a;
		int rand = 0 + (int) (Math.random() * a);
		System.out.println("³������ �� ��� ���� ������������� ����� �������� � ���� : " + rand + " ��.");
	}

	void moveDown(int a) {
		this.a = a;
		int rand = 0 + (int) (Math.random() * a);
		System.out.println("³������ �� ��� ���� ������������� ����� �������� � ��� : " + rand + " ��.");
	}

	void moveLeft(int a) {
		this.a = a;
		int rand = 0 + (int) (Math.random() * a);
		System.out.println("³������ �� ��� ���� ������������� ����� �������� � ��� : " + rand + " ��.");
	}

	void moveRight(int a) {
		this.a = a;
		int rand = 0 + (int) (Math.random() * a);
		System.out.println("³������ �� ��� ���� ������������� ����� �������� � ����� : " + rand + " ��.");
	}
}
