package ua.lviv.lgs.task1;

import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		Mounth[] mo = Mounth.values();
		Seasons[] se = Seasons.values();
		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();

			switch (sc.next()) {
			case "1": {
				System.out.println("Введіть місяць : ");
				sc = new Scanner(System.in);
				String mounth = sc.next().toUpperCase();

				boolean flag = isMounthPresent(mo, mounth);
				if (!flag) {
					System.out.println("Місяць не знайдено!");
				}

				break;
			}
			case "2": {
				System.out.println("Введіть пору року");
				sc = new Scanner(System.in);
				String mounthSc = sc.next().toUpperCase();
				boolean flag = false;
				for (Mounth m : mo) {
					if (m.getSeasons().name().equals(mounthSc)) {

						flag = true;
					}
				}
				if (flag) {

					for (Mounth m : mo) {
						if (m.getSeasons().toString().equalsIgnoreCase(mounthSc)) {
							System.out.println(m);
						}
					}
				}
				if (!flag) {
					System.out.println("Такої пори року не існує");

				}
				break;
			}
			case "3": {
				System.out.println("Введіть кількість днів");
				sc = new Scanner(System.in);
				int dayMounth = sc.nextInt();
				boolean flag = false;
				for (Mounth m : mo) {
					if (m.getDays() == dayMounth) {
						flag = true;
						if (flag) {
							System.out.println(m);
						}
					}

				}

				if (!flag) {
					System.out.println("Кількість днів не відповідає ні одному місяцю! ");

				}
				break;
			}
			case "4": {
				System.out.println("Введіть кількість днів");
				sc = new Scanner(System.in);
				int dayMounth = sc.nextInt();
				boolean flag = false;
				for (Mounth m : mo) {
					if (m.getDays() < dayMounth) {
						flag = true;
						if (flag) {
							System.out.println(m);
						}
					}

				}

				if (!flag) {
					System.out.println("Кількість днів не відповідає ні одному місяцю! ");

				}
				break;
			}
			case "5": {
				System.out.println("Введіть кількість днів");
				sc = new Scanner(System.in);
				int dayMounth = sc.nextInt();
				boolean flag = false;
				for (Mounth m : mo) {
					if (m.getDays() > dayMounth) {
						flag = true;
						if (flag) {
							System.out.println(m);
						}
					}

				}

				if (!flag) {
					System.out.println("Кількість днів не відповідає ні одному місяцю! ");

				}
				break;
			}
			case "6": {
				System.out.println("Введіть пору року : ");
				sc = new Scanner(System.in);
				String seasons = sc.next().toUpperCase();
				boolean flag = isSeasonesPresent(se, seasons);
				if (flag) {
					Seasons seas = Seasons.valueOf(seasons);
					int ordinal = seas.ordinal();

					if (ordinal == (se.length - 1)) {
						ordinal = 0;
						System.out.println(se[ordinal]);
					} else {
						System.out.println(se[ordinal + 1]);
					}
				}
				if (!flag) {
					System.out.println("Пора року не знайдено!");
				}

				break;
			}
			case "7": {
				System.out.println("Введіть пору року : ");
				sc = new Scanner(System.in);
				String seasons = sc.next().toUpperCase();
				boolean flag = isSeasonesPresent(se, seasons);
				if (flag) {
					Seasons seas = Seasons.valueOf(seasons);
					int ordinal = seas.ordinal();

					if (ordinal == 0) {
						ordinal = (se.length - 1);
						System.out.println(se[ordinal]);
					} else {
						System.out.println(se[ordinal - 1]);
					}
				}
				if (!flag) {
					System.out.println("Пора року не знайдено!");
				}

				break;
			}
			case "8": {
				System.out.println("Всі місяці які мають парну кількість днів нижче : ");
				for (Mounth m : mo) {
					if ((m.getDays() % 2) == 0) {
						System.out.println(m);
					}

				}
				break;
			}
			case "9": {
				System.out.println("Всі місяці які мають не парну кількість днів нижче : ");
				for (Mounth m : mo) {
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
				boolean flag = isMounthPresent(mo, mounth);
				if (flag) {

					Mounth m = Mounth.valueOf(mounth);
					int ordinal = m.ordinal();
					if ((mo[ordinal].getDays() % 2) == 0) {
						System.out.println("Місяць має парну кількість днів!");
					} else {
						System.out.println("Місяць не має парну кількість днів!");
					}

				}

				if (!flag) {
					System.out.println("Місяць не знайдено!");
				}
				break;
			}
			}

		}
	}

	private static boolean isSeasonesPresent(Seasons[] se, String seasons) {
		boolean flag = false;
		for (Seasons s : se) {
			if (s.name().equals(seasons)) {
				flag = true;
			}
		}
		return flag;
	}

	private static boolean isMounthPresent(Mounth[] mo, String mounth) {
		boolean flag = false;

		for (Mounth m : mo) {
			if (m.name().equals(mounth)) {
				System.out.println("Місяць знайдено!");
				flag = true;
			}
		}
		return flag;
	}

	static void menu() {
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
