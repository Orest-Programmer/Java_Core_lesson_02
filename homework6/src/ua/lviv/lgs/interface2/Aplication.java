package ua.lviv.lgs.interface2;

public class Aplication {
	public static void main(String[] args) {
		MyCalculator calc = new MyCalculator(10, 5);
		
		calc.plus();
		calc.minus();
		calc.multiply();
		calc.devide();
	}
}
