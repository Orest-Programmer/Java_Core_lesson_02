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
				
				System.out.println("Введіть а :");
				int a = sc.nextInt();
				System.out.println("Введіть b :");
				int b = sc.nextInt();
				
				if(a<0 && b<0) {
					throw new IllegalArgumentException("'a' або 'b' менше за 0 ");
				}else {
					m.minusCalc(a, b);
				}
				
				break;
			}
			case 2:{
				sc = new Scanner(System.in);
				System.out.println("Введіть а :");
				int a = sc.nextInt();
				System.out.println("Введіть b :");
				int b = sc.nextInt();
				if(a > 0 && b > 0) {
					throw new MyException("'a' або 'b' більше 0 ");
				}else {
				m.plusCalc(a, b);
				}
				break;
			}
			case 3:{
				sc = new Scanner(System.in);
				System.out.println("Введіть а :");
				int a = sc.nextInt();
				System.out.println("Введіть b :");
				int b = sc.nextInt();
				if((a == 0 && b !=0) || (a != 0 && b == 0)) {
					throw new ArithmeticException("Ділення на 0 не можливе!");
				}else {
					m.devideCalc(a, b);
				}
				
				break;
			}
			case 4:{
				sc = new Scanner(System.in);
				System.out.println("Введіть а :");
				int a = sc.nextInt();
				System.out.println("Введіть b :");
				int b = sc.nextInt();
				if(a == 0 && b == 0) {
					throw new IllegalAccessException("Операції множення з 0 не можливі!");
				}else {
					m.multiplicationCalc(a, b);	
				}
				
				break;
			}
			}
		}
	}

	static void menu() {
		System.out.println("Нажміть 1, щоб (а - b)");
		System.out.println("Нажміть 2, щоб (а + b)");
		System.out.println("Нажміть 3, щоб (а / b)");
		System.out.println("Нажміть 4, щоб (а * b)");
	}

}
