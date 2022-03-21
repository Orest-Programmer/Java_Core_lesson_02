package ua.lviv.lgs.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Aplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WheelMaterial wheelMaterial[] = WheelMaterial.values();

		while (true) {
			menu();

			switch (sc.nextInt()) {
			case 1: {
				Car carArray[][] = new Car[getRandomValueFromRange(1, 5)][getRandomValueFromRange(1, 5)];
				for (int i = 0; i < carArray.length; i++) {
					for (int j = 0; j < carArray[i].length; j++) {
						carArray[i][j] = new Car(getRandomValueFromRange(100, 250), getRandomValueFromRange(1970, 2022),
								new Wheel(getRandomValueFromRange(35, 50),
										wheelMaterial[getRandomValueFromRange(0, wheelMaterial.length - 1)].toString()),
								new Engine(getRandomValueFromRange(2, 12)));

					}
				}

				System.out.println(Arrays.deepToString(carArray));
				break;
			}
			case 2: {
				/* Old version */
//				Car car = new Car(getRandomValueFromRange(100, 250), getRandomValueFromRange(1970, 2022),
//						new Wheel(getRandomValueFromRange(35, 50),
//								wheelMaterial[getRandomValueFromRange(0, wheelMaterial.length - 1)].toString()),
//						new Engine(getRandomValueFromRange(2, 12)));

//				Car carArray[] = new Car[getRandomValueFromRange(1, 5)];

//				Arrays.fill(carArray, car);

//				System.out.println(Arrays.deepToString(carArray));

				/* New version with ArrayList */
				for (int i = 0; i < getRandomValueFromRange(0, 10); i++) {
					List car1 = new ArrayList(Arrays.asList(new Car(getRandomValueFromRange(100, 250),
							getRandomValueFromRange(1970, 2022),
							new Wheel(getRandomValueFromRange(35, 50),
									wheelMaterial[getRandomValueFromRange(0, wheelMaterial.length - 1)].toString()),
							new Engine(getRandomValueFromRange(2, 12)))));
					System.out.println(car1);
				}

				break;
			}
			default: {
				System.out.println("¬ведене число повинне бути 1 або 2!");
			}

			}
		}
	}

	private static int getRandomValueFromRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("Min value must be less than max value!");
		}

		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}

	static void menu() {
		System.out.println(" ");
		System.out.println("1) ¬ивести toString() даних елемент≥в масиву на консоль.");
		System.out.println("2) ƒл€ вс≥х об`Їкт≥в даного масиву засетити одинаковий  об`Їкт класу јвто (fill())");
		System.out.print("¬ибер≥ть один з пункт≥в : ");
	}
}
