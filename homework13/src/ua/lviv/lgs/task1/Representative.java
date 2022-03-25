package ua.lviv.lgs.task1;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Representative extends Human {
	private String lastName;
	private String name;
	private int age;
	private boolean grafter = false;
	private int bribe;
	Scanner sc = new Scanner(System.in);
	Faction f = new Faction();
	@Override
	public String toString() {
		return "Representative [lastName=" + lastName + ", name=" + name + ", age=" + age + ", grafter=" + grafter
				+ ", bribe=" + bribe + ", weight=" + weight + ", height=" + height + "]";
	}

	public Representative(int weight, int height) {
		super(weight, height);
	}

	public Representative(int weight, int height, String lastName, String name, int age, boolean grafter) {
		super(weight, height);
		this.lastName = lastName;
		this.name = name;
		this.age = age;
		this.grafter = grafter;
	}

	public Representative() {
		
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGrafter() {
		return grafter;
	}

	public void setGrafter(boolean grafter) {
		this.grafter = grafter;
	}

	public int getBribe() {
		return bribe;
	}

	public void setBribe(int bribe) {
		this.bribe = bribe;
	}

	public void giveBribe() {
		System.out.print("Введіть депутата якому хочете дати хабар: ");
		lastName = sc.next();
		Iterator<Representative> repIter = f.representativeArr.iterator();
		f.getArr();
		f.Display();
		while (repIter.hasNext()) {
			Representative findRep = repIter.next();
			if (findRep.getLastName().equals(lastName)) {
				System.out.print("Введіть суму хабаря: ");
				bribe = sc.nextInt();
				if (bribe > 5000) {
					System.out.println("Поліція ув`язнить депутата");
				} else {
					System.out.println("Ви дали хабар в розмірі - \n" + bribe);
				}
			}else {
				System.out.println("Депутата не знайдено!\n");
			}

		}
		
	}

}
