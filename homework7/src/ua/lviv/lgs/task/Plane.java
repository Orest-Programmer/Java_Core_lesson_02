package ua.lviv.lgs.task;

public abstract class Plane extends aircraftControl{
	int width = 7;
	int height = 10;
	int weight = 7000;
	void startEngines() {
		int rand = 20 + (int) (Math.random() * 88);
		System.out.println("��������� �� �������, ���������� "+ rand + " ��.");
	}
	void takeoffPlane() {
		double rand = 0 + (int) (Math.random() * 1000);
		System.out.println("˳��� ��������� "+ rand +" ��. �� ������� ���� ������!");
	}
	void landingPlane() {
		System.out.println("˳��� ��� �� �������!");
	}
}
