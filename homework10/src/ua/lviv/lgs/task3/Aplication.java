package ua.lviv.lgs.task3;

import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("¬вед≥ть реченн€ : ");
		String str = sc.nextLine();
		System.out.println(str);
		String[] subs = str.split(" ");
		int count = 0;
		
		for(int i = 0; i < subs.length; i++) {
			
			if(subs[i].length() <=2) {
				count++;
			}
		}
		
		System.out.println(subs.length - count);

		

	}

	
}
