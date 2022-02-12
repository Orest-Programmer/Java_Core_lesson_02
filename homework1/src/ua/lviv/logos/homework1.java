package ua.lviv.logos;

import java.util.Iterator;

public class homework1 {

	public static void main(String[] args) {

		byte a1 = 1;
		short a2 = 2;
		int a3 = 3;
		long a4 = 4L;
		float a5 = 5.0F;
		double a6 = 6.0;
		System.out.println("Примітивні типи даних :\n byte a1 = " + a1 + "\n short a2 = " + a2 + "\n int a3 = " + a3
				+ "\n long a4 = " + a4 + "\n float a5 = " + a5 + "\n double a6 = " + a6);

		System.out.println("Мінімальне та максимальне значення типів даних :\n");

		System.out.println("Мінімальне значення типу byte " + Byte.MIN_VALUE + "\tМаксимальне значення типу byte "
				+ Byte.MAX_VALUE);
		System.out.println("Мінімальне значення типу short " + Short.MIN_VALUE + "\tМаксимальне значення типу short "
				+ Short.MAX_VALUE);
		System.out.println("Мінімальне значення типу int " + Integer.MIN_VALUE + "\tМаксимальне значення типу int "
				+ Integer.MAX_VALUE);
		System.out.println("Мінімальне значення типу long " + Long.MIN_VALUE + "\tМаксимальне значення типу long "
				+ Long.MAX_VALUE);
		System.out.println("Мінімальне значення типу double " + Double.MIN_VALUE + "\tМаксимальне значення типу double "
				+ Double.MAX_VALUE);

		System.out.println("Створити масив та знайти мінімум і максимум...");

		int[] array1 = new int[10];
		array1[0] = 23;
		array1[1] = 45;
		array1[2] = 99;
		array1[3] = 23;
		array1[4] = 242;
		array1[5] = 9;
		array1[6] = 23;
		array1[7] = 16;
		array1[8] = 45;
		array1[9] = 76;

		int min = array1[0];
		int max = array1[0];
		for (int i = 1; i < array1.length; i++) {
			if (array1[i] < min) {
				min = array1[i];
			}
		}
		for (int i = 1; i < array1.length; i++) {
			if (array1[i] > max) {
				max = array1[i];
			}
		}
		System.out.println("Мінімальне значення масиву : " + min);
		System.out.println("Максимальне значення масиву : " + max);
		
		//first commit
	}

}
