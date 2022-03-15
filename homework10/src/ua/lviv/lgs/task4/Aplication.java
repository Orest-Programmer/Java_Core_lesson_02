package ua.lviv.lgs.task4;

import java.util.Scanner;

public class Aplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("¬вед≥ть реченн€ : ");
		String str = sc.nextLine();
		System.out.println(str);
		String[] subs = str.split(" ");
		String wordOut = null;
		int wordCOunt = 0;
		
		for(int i = 0; i < subs.length; i++) {
			String word = null;
			int countWord = 0;
			for(int j = 0; j < subs.length; j++) {
				if(subs[i] == subs[j]) {
					word = subs[i];
					countWord +=1;
				}
				if(wordCOunt < countWord) {
					wordCOunt += countWord;
					wordOut = word;	
				}
				
			}
		}
		
		System.out.println(wordOut);
		
	}
}
