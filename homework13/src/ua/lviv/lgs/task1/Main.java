package ua.lviv.lgs.task1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Faction f = new Faction();
		Representative r = new Representative();

		Scanner sc = new Scanner(System.in);

		while (true) {
			Menu();

			switch (sc.nextInt()) {
			case 1: {
				r.createRepresentative();
				break;
			}
			case 2: {
				r.Display();
				break;
			}
			case 3: {
				r.removeDeputy();
				break;
			}
			case 4: {
				r.giveBribe();
				break;
			}
			default: {
				System.out.println("�� ����� �� �������� �����!");
			}
			}
		}

	}

	static void Menu() {
		System.out.println("������ 1 ��� �������� �������� �� �������: ");
		System.out.println("������ 2 ��� ������� �������� �������: ");
		System.out.println("������ 3 ��� �������� �������� � �������: ");
		System.out.println("������ 4 ��� ���� ����� ��������: ");
	}
}
