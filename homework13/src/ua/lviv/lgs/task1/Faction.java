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
		System.out.print("������ ������� ��������: ");
		lastName = sc.next();
		System.out.print("������ ��`� ��������: ");
		name = sc.next();
		System.out.print("������ �� ��������: ");
		age = sc.nextInt();
		System.out.print("������ ���� ��������: ");
		weight = sc.nextInt();
		System.out.print("������ ��� ��������: ");
		height = sc.nextInt();
		System.out.print("������ true ���� ��������, false - �������: ");
		grafter = sc.nextBoolean();
		re.setBribe(bribe);

		representativeArr.add(new Representative(weight, height, lastName, name, age, grafter));

	}

	public void getArr() {
		System.out.println(representativeArr);//��� ������ �� ����� ����� � ������
	}
// ������ ������ ����� �� �� ������ ��� � ���� ������� � �� � ����!!!
	public void Display() {
		System.out.println(representativeArr);// � ��� �����
	}

	@Override
	public String toString() {
		return "Faction [RepresentativeArr=" + representativeArr + "]\n";
	}

	public void removeDeputy() {
		System.out.println("������ ������� �� ����� �������� ��� ��������!");
		System.out.print("�������: ");
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
//		System.out.print("������ �������� ����� ������ ���� �����: ");
//		lastName = sc.next();
//		Iterator<Representative> repIter = representativeArr.iterator();
//
//		while (repIter.hasNext()) {
//			Representative findRep = repIter.next();
//			if (findRep.getLastName().equals(lastName)) {
//				System.out.print("������ ���� ������: ");
//				bribe = sc.nextInt();
//				if (bribe > 5000) {
//					System.out.println("������ ��`������ ��������");
//				} else {
//					System.out.println("�� ���� ����� � ����� - \n" + bribe);
//				}
//			}else {
//				System.out.println("�������� �� ��������!\n");
//			}
//
//		}
//		
//	}
}
