package ua.lviv.lgs.task2;

import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) throws IllegalAccessException, MyException {
		Scanner sc = new Scanner(System.in);
		Methods m = new Methods();
		while(true) {
			menu();
			switch(sc.nextInt()) {
			case 1:{
				sc = new Scanner(System.in);
				
				System.out.println("������ � :");
				int a = sc.nextInt();
				System.out.println("������ b :");
				int b = sc.nextInt();
				
				if(a<0 && b<0) {
					throw new IllegalArgumentException("'a' ��� 'b' ����� �� 0 ");
				}else {
					m.minusCalc(a, b);
				}
				
				break;
			}
			case 2:{
				sc = new Scanner(System.in);
				System.out.println("������ � :");
				int a = sc.nextInt();
				System.out.println("������ b :");
				int b = sc.nextInt();
				if(a > 0 && b > 0) {
					throw new MyException("'a' ��� 'b' ����� 0 ");
				}else {
				m.plusCalc(a, b);
				}
				break;
			}
			case 3:{
				sc = new Scanner(System.in);
				System.out.println("������ � :");
				int a = sc.nextInt();
				System.out.println("������ b :");
				int b = sc.nextInt();
				if((a == 0 && b !=0) || (a != 0 && b == 0)) {
					throw new ArithmeticException("ĳ����� �� 0 �� �������!");
				}else {
					m.devideCalc(a, b);
				}
				
				break;
			}
			case 4:{
				sc = new Scanner(System.in);
				System.out.println("������ � :");
				int a = sc.nextInt();
				System.out.println("������ b :");
				int b = sc.nextInt();
				if(a == 0 && b == 0) {
					throw new IllegalAccessException("�������� �������� � 0 �� ������!");
				}else {
					m.multiplicationCalc(a, b);	
				}
				
				break;
			}
			}
		}
	}

	static void menu() {
		System.out.println("������ 1, ��� (� - b)");
		System.out.println("������ 2, ��� (� + b)");
		System.out.println("������ 3, ��� (� / b)");
		System.out.println("������ 4, ��� (� * b)");
	}

}
