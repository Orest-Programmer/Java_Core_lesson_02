package ua.lviv.lgs.task2;

import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введіть речення : ");
		String str = sc.nextLine();
		System.out.println(str);
		char[] vowels = new char[] { 'а', 'е', 'є', 'и', 'і', 'ї', 'о', 'у', 'я', 'ю', 'А', 'Е', 'Є', 'И', 'І', 'Ї',
				'О', 'У', 'Я', 'Ю' };
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < vowels.length; j++) {
				char word = vowels[j];
				if (str.charAt(i) == word) {
					str = str.replace(str.charAt(i), '-');
				}
			}
		}

		System.out.println(str);

	}

}
