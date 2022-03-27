package ua.lviv.lgs.task1;

import java.util.ArrayList;
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
	List<Representative> representativeArr = new ArrayList<>();

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

	public void createRepresentative() {
		Representative re = new Representative();
		System.out.print("¬вед≥ть пр≥звище депутата: ");
		lastName = sc.next();
		System.out.print("¬вед≥ть ≥м`€ депутата: ");
		name = sc.next();
		System.out.print("¬вед≥ть в≥к депутата: ");
		age = sc.nextInt();
		System.out.print("¬вед≥ть вагу депутата: ");
		weight = sc.nextInt();
		System.out.print("¬вед≥ть р≥ст депутата: ");
		height = sc.nextInt();
		System.out.print("¬вед≥ть true €кщо хабарник, false - навпаки: ");
		grafter = sc.nextBoolean();
		System.out.println(" ");

		representativeArr.add(new Representative(weight, height, lastName, name, age, grafter));

	}

	public void Display() {
		System.out.println(representativeArr);
	}

	public void removeDeputy() {
		System.out.println("¬вед≥ть пр≥звище та фам≥л≥ю депутата щоб видалити!");
		System.out.print("ѕр≥звище: ");
		lastName = sc.next();
		Iterator<Representative> repIter = representativeArr.iterator();

		while (repIter.hasNext()) {
			Representative findRep = repIter.next();
			if (findRep.getLastName().equals(lastName)) {
				repIter.remove();
			}

		}

	}

	public void giveBribe() {
		System.out.print("¬вед≥ть депутата €кому хочете дати хабар: ");
		Iterator<Representative> repIter = representativeArr.iterator();
		while (repIter.hasNext()) {
			Representative findRep = repIter.next();
			if (findRep.getLastName().equals(sc.next()) & findRep.isGrafter() == true) {
				System.out.print("¬вед≥ть суму хабар€: ");
				bribe = sc.nextInt();
				if (bribe > 5000) {
					System.out.println("ѕол≥ц≥€ ув`€знить депутата");
				} else {
					System.out.println("¬и дали хабар в розм≥р≥ - \n" + bribe);

				}
			} else {
				System.out.println("ƒепутата не знайдено, або депутат не бере хабар≥в!\n");
			}

		}

	}

	@Override
	public String toString() {
		return "Representative [lastName=" + lastName + ", name=" + name + ", age=" + age + ", grafter=" + grafter
				+ ", weight=" + weight + ", height=" + height + "]\n";
	}

}
