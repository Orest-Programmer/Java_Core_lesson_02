package ua.lviv.lgs.task2;

public class Aplication {

	public static void main(String[] args) {

		Animal a = new Animal("Леопард", 20, 7);

		System.out.println(a);

		System.out.println("Назва тварини = " + a.getName() + ", Швидкість тварини = " + a.getSpeed() + "км/год, "
				+ "Вік тварини = " + a.getAge() + " років");

		a.setName("Бик");
		a.setSpeed(2);
		a.setAge(14);
		System.out.println("");
		System.out.println(a);
		System.out.println("Назва тварини = " + a.getName() + ", Швидкість тварини = " + a.getSpeed() + "км/год, "
				+ "Вік тварини = " + a.getAge() + " років");
	}

}
