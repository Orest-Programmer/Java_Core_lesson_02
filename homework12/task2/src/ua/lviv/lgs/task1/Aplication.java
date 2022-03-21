/*
 *Copyright Logos It Academy
 */
package ua.lviv.lgs.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @since java 1.8
 * @author Orest
 * @exception WrongInputConsoleParametersException
 * @version 1.1
 */
public class Aplication {

	public static void main(String[] args) throws WrongInputConsoleParametersException {
		/* Main method */
//		Mounth[] mo = Mounth.values();
		Mounth valuesM[] = Mounth.values();
//		Seasons[] se = Seasons.values();
		Seasons valuesS[] = Seasons.values();
		ArrayList<Mounth> mounthArray = new ArrayList(Arrays.asList(valuesM));
		
		ArrayList<Seasons> seasonsArray = new ArrayList(Arrays.asList(valuesS));
		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();
			
			/* Menu realisation */
			switch (sc.next()) {
			
			case "1": {
				System.out.println("Введіть місяць : ");
				sc = new Scanner(System.in);
				String mounth = sc.next().toUpperCase();

				boolean flag = isMounthPresent(mounthArray, mounth);
	
				if (!flag) {
					throw new WrongInputConsoleParametersException("Місяць не знайдено!");
				}

				break;
			}
			case "2": {
				System.out.println("Введіть пору року");
				sc = new Scanner(System.in);
				String mounthSc = sc.next().toUpperCase();
				boolean flag = false;
				for (Mounth m : mounthArray) {
					if (m.getSeasons().name().equals(mounthSc)) {

						flag = true;
					}
				}
				if (flag) {

					for (Mounth m : mounthArray) {
						if (m.getSeasons().toString().equalsIgnoreCase(mounthSc)) {
							System.out.println(m);
						}
					}
				}
				if (!flag) {
					throw new WrongInputConsoleParametersException("Такої пори року не існує");

				}
				break;
			}
			case "3": {
				System.out.println("Введіть кількість днів");
				sc = new Scanner(System.in);
				int dayMounth = sc.nextInt();
				boolean flag = false;
				for (Mounth m : mounthArray) {
					if (m.getDays() == dayMounth) {
						flag = true;
						if (flag) {
							System.out.println(m);
						}
					}

				}

				if (!flag) {
					throw new WrongInputConsoleParametersException("Кількість днів не відповідає ні одному місяцю! ");

				}
				break;
			}
			case "4": {
				System.out.println("Введіть кількість днів");
				sc = new Scanner(System.in);
				int dayMounth = sc.nextInt();
				boolean flag = false;
				for (Mounth m : mounthArray) {
					if (m.getDays() < dayMounth) {
						flag = true;
						if (flag) {
							System.out.println(m);
						}
					}

				}

				if (!flag) {
					throw new WrongInputConsoleParametersException("Кількість днів не відповідає ні одному місяцю! ");

				}
				break;
			}
			case "5": {
				System.out.println("Введіть кількість днів");
				sc = new Scanner(System.in);
				int dayMounth = sc.nextInt();
				boolean flag = false;
				for (Mounth m : mounthArray) {
					if (m.getDays() > dayMounth) {
						flag = true;
						if (flag) {
							System.out.println(m);
						}
					}

				}

				if (!flag) {
					throw new WrongInputConsoleParametersException("Кількість днів не відповідає ні одному місяцю! ");

				}
				break;
			}
			case "6": {
				System.out.println("Введіть пору року : ");
				sc = new Scanner(System.in);
				String seasons = sc.next().toUpperCase();
				boolean flag = isSeasonesPresent(seasonsArray, seasons);
				if (flag) {
					Seasons seas = Seasons.valueOf(seasons);
					int ordinal = seas.ordinal();

					if (ordinal == (seasonsArray.size() - 1)) {
						ordinal = 0;
						System.out.println(seasonsArray.get(ordinal));
					} else {
						System.out.println(seasonsArray.get(ordinal + 1));
					}
				}
				if (!flag) {
					throw new WrongInputConsoleParametersException("Пора року не знайдено!");
				}

				break;
			}
			case "7": {
				System.out.println("Введіть пору року : ");
				sc = new Scanner(System.in);
				String seasons = sc.next().toUpperCase();
				boolean flag = isSeasonesPresent(seasonsArray, seasons);
				if (flag) {
					Seasons seas = Seasons.valueOf(seasons);
					int ordinal = seas.ordinal();

					if (ordinal == 0) {
						ordinal = (seasonsArray.size() - 1);
						System.out.println(seasonsArray.get(ordinal));
					} else {
						System.out.println(seasonsArray.get(ordinal - 1));
					}
				}
				if (!flag) {
					throw new WrongInputConsoleParametersException("Пора року не знайдено!");
				}

				break;
			}
			case "8": {
				System.out.println("Всі місяці які мають парну кількість днів нижче : ");
				for (Mounth m : mounthArray) {
					if ((m.getDays() % 2) == 0) {
						System.out.println(m);
					}

				}
				break;
			}
			case "9": {
				System.out.println("Всі місяці які мають не парну кількість днів нижче : ");
				for (Mounth m : mounthArray) {
					if ((m.getDays() % 2) != 0) {
						System.out.println(m);
					}

				}
				break;
			}
			case "10": {
				System.out.println("Введіть місяць щоб перевірити чи він має парну кількість днів : ");
				sc = new Scanner(System.in);
				String mounth = sc.next().toUpperCase();
				boolean flag = isMounthPresent(mounthArray, mounth);
				if (flag) {

					Mounth m = Mounth.valueOf(mounth);
					int ordinal = m.ordinal();
					if ((mounthArray.get(ordinal).getDays() % 2) == 0) {
						System.out.println("Місяць має парну кількість днів!");
					} else {
						System.out.println("Місяць не має парну кількість днів!");
					}

				}

				if (!flag) {
					throw new WrongInputConsoleParametersException("Місяць не знайдено!");
				}
				break;
			}
			}

		}
	}

	private static boolean isSeasonesPresent(ArrayList<Seasons> seasonsArray, String seasons) {
		/* 
		 * Cheacking method
		 * 		The method checks if there is a season.
		 *  */
		boolean flag = false;
		for (Seasons s : seasonsArray) {
			if (s.name().equals(seasons)) {
				flag = true;
			}
		}
		return flag;
	}

	private static boolean isMounthPresent(ArrayList<Mounth> mounthArray, String mounth) {
		/* 
		 * Cheacking method
		 * 		The method checks if there is a mounth.
		 *  */
		boolean flag = false;
		for (Mounth m : mounthArray) {
			if (m.name().equals(mounth)) {
				System.out.println("Місяць знайдено!");
				flag = true;
			}
		}
		
		
		
			
		
		return flag;
	}

	static void menu() {
		/* Menu output method */
		System.out.println("Натисніть 1, щоб перевірити чи є такий місяць");
		System.out.println("Натисніть 2, щоб вивести всі місяці з такою ж порою року");
		System.out.println("Натисніть 3, щоб вивести всі місяці які мають таку саму кількість днів");
		System.out.println("Натисніть 4, щоб вивести на екран всі місяці які мають меншу кількість днів");
		System.out.println("Натисніть 5, щоб вивести на екран всі місяці які мають більшу кількість днів");
		System.out.println("Натисніть 6, щоб вивести на екран наступну пору року");
		System.out.println("Натисніть 7, щоб вивести на екран попередню пору року");
		System.out.println("Натисніть 8, щоб вивести на екран всі місяці які мають парну кількість днів");
		System.out.println("Натисніть 9, щоб вивести на екран всі місяці які мають непарну кількість днів");
		System.out.println("Натисніть 10, щоб вивести на екран чи введений з консолі місяць має парну кількість днів");
	}
}
