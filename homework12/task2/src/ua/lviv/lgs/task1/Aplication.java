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
				System.out.println("������ ����� : ");
				sc = new Scanner(System.in);
				String mounth = sc.next().toUpperCase();

				boolean flag = isMounthPresent(mounthArray, mounth);
	
				if (!flag) {
					throw new WrongInputConsoleParametersException("̳���� �� ��������!");
				}

				break;
			}
			case "2": {
				System.out.println("������ ���� ����");
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
					throw new WrongInputConsoleParametersException("���� ���� ���� �� ����");

				}
				break;
			}
			case "3": {
				System.out.println("������ ������� ���");
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
					throw new WrongInputConsoleParametersException("ʳ������ ��� �� ������� � ������ �����! ");

				}
				break;
			}
			case "4": {
				System.out.println("������ ������� ���");
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
					throw new WrongInputConsoleParametersException("ʳ������ ��� �� ������� � ������ �����! ");

				}
				break;
			}
			case "5": {
				System.out.println("������ ������� ���");
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
					throw new WrongInputConsoleParametersException("ʳ������ ��� �� ������� � ������ �����! ");

				}
				break;
			}
			case "6": {
				System.out.println("������ ���� ���� : ");
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
					throw new WrongInputConsoleParametersException("���� ���� �� ��������!");
				}

				break;
			}
			case "7": {
				System.out.println("������ ���� ���� : ");
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
					throw new WrongInputConsoleParametersException("���� ���� �� ��������!");
				}

				break;
			}
			case "8": {
				System.out.println("�� ����� �� ����� ����� ������� ��� ����� : ");
				for (Mounth m : mounthArray) {
					if ((m.getDays() % 2) == 0) {
						System.out.println(m);
					}

				}
				break;
			}
			case "9": {
				System.out.println("�� ����� �� ����� �� ����� ������� ��� ����� : ");
				for (Mounth m : mounthArray) {
					if ((m.getDays() % 2) != 0) {
						System.out.println(m);
					}

				}
				break;
			}
			case "10": {
				System.out.println("������ ����� ��� ��������� �� �� �� ����� ������� ��� : ");
				sc = new Scanner(System.in);
				String mounth = sc.next().toUpperCase();
				boolean flag = isMounthPresent(mounthArray, mounth);
				if (flag) {

					Mounth m = Mounth.valueOf(mounth);
					int ordinal = m.ordinal();
					if ((mounthArray.get(ordinal).getDays() % 2) == 0) {
						System.out.println("̳���� �� ����� ������� ���!");
					} else {
						System.out.println("̳���� �� �� ����� ������� ���!");
					}

				}

				if (!flag) {
					throw new WrongInputConsoleParametersException("̳���� �� ��������!");
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
				System.out.println("̳���� ��������!");
				flag = true;
			}
		}
		
		
		
			
		
		return flag;
	}

	static void menu() {
		/* Menu output method */
		System.out.println("�������� 1, ��� ��������� �� � ����� �����");
		System.out.println("�������� 2, ��� ������� �� ����� � ����� � ����� ����");
		System.out.println("�������� 3, ��� ������� �� ����� �� ����� ���� ���� ������� ���");
		System.out.println("�������� 4, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 5, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 6, ��� ������� �� ����� �������� ���� ����");
		System.out.println("�������� 7, ��� ������� �� ����� ��������� ���� ����");
		System.out.println("�������� 8, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 9, ��� ������� �� ����� �� ����� �� ����� ������� ������� ���");
		System.out.println("�������� 10, ��� ������� �� ����� �� �������� � ������ ����� �� ����� ������� ���");
	}
}
