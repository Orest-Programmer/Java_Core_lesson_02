package ua.lviv.lgs.task1;

import java.util.Scanner;

public class Aplication {
	public static void main(String[] args) throws WordException {
		Scanner sc = new Scanner(System.in);
		System.out.print("¬вед≥ть слово :");
		String word = sc.nextLine().toUpperCase();
		System.out.println(word);
		if(word.length() > 5 || word.length() < 0) {
			throw new WordException("—лово маЇ б≥льше або менше 5 символ≥в");
		}
		if(word.charAt(0) == word.charAt(4) && word.charAt(1) == word.charAt(3)) {
			System.out.println("Cлово '"+ word +"' пал≥ндром");
		}else {
			System.out.println("Cлово '"+ word +"' не пал≥ндром");
		}
	}
}
