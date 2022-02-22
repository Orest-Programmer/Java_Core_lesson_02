package ua.lviv.lgs.task2;

public class Constructors {
	int a;
	int b;
	int c;
	Constructors(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	Constructors(int a, int b, int c){
		this(a, b);
		this.c = c;
	}

	
}
