package ua.lviv.lgs.task2;

public class Aplication {

	public static void main(String[] args) {

		Animal a = new Animal("�������", 20, 7);

		System.out.println(a);

		System.out.println("����� ������� = " + a.getName() + ", �������� ������� = " + a.getSpeed() + "��/���, "
				+ "³� ������� = " + a.getAge() + " ����");

		a.setName("���");
		a.setSpeed(2);
		a.setAge(14);
		System.out.println("");
		System.out.println(a);
		System.out.println("����� ������� = " + a.getName() + ", �������� ������� = " + a.getSpeed() + "��/���, "
				+ "³� ������� = " + a.getAge() + " ����");
	}

}
