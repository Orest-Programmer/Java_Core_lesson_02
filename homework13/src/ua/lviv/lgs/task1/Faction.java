package ua.lviv.lgs.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Faction {
	Scanner sc = new Scanner(System.in);
	List<Representative> representativeArr = new ArrayList<>();
	Representative r;
	private String lastName;
	private String name;
	private int age;
	private int weight;
	private int height;
	private boolean grafter;
	private int bribe;

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
		re.setBribe(bribe);

		representativeArr.add(new Representative(weight, height, lastName, name, age, grafter));

	}

	public void getArr() {
		System.out.println(representativeArr);//тут чогось не вертаЇ масив з даними
	}
// скорше всього через те що виклик ≥де в клас≥ депутат а не в менй≥!!!
	public void Display() {
		System.out.println(representativeArr);// а тут вертаЇ
	}

	@Override
	public String toString() {
		return "Faction [RepresentativeArr=" + representativeArr + "]\n";
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
//	public void giveBribe() {
//		System.out.print("¬вед≥ть депутата €кому хочете дати хабар: ");
//		lastName = sc.next();
//		Iterator<Representative> repIter = representativeArr.iterator();
//
//		while (repIter.hasNext()) {
//			Representative findRep = repIter.next();
//			if (findRep.getLastName().equals(lastName)) {
//				System.out.print("¬вед≥ть суму хабар€: ");
//				bribe = sc.nextInt();
//				if (bribe > 5000) {
//					System.out.println("ѕол≥ц≥€ ув`€знить депутата");
//				} else {
//					System.out.println("¬и дали хабар в розм≥р≥ - \n" + bribe);
//				}
//			}else {
//				System.out.println("ƒепутата не знайдено!\n");
//			}
//
//		}
//		
//	}
}
