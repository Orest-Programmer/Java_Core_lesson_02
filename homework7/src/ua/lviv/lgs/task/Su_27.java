package ua.lviv.lgs.task;

public class Su_27 extends Plane implements specOpportunities {
	int maxSpeed;
	String color;
	

	public Su_27(int maxSpeed, String color) {
		super();
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	@Override
	public void turboAcceleration() {
		int speed = (int) (maxSpeed + (0 + (int) (Math.random() * 100)));
		System.out.println("�������� � ����� ������������ ���� " + speed + " ��/���.");
	}

	@Override
	public void techStels() {
		int time = 5 + (int) (Math.random() * 60);
		System.out.println("��� ��� ����������� �������㳿 ����� ����� " + time +" ��.");
	}

	@Override
	public void nuclearStrike() {
		int nuclearWarheads = 0 + (int) (Math.random() * 10);
		System.out.println("ʳ������ �������� ������� ��������� ���� "+ nuclearWarheads);
	}

}
