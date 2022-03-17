package ua.lviv.lgs.task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Aplication {
	public static void main(String[] args) {
		Random r = new Random();
		
		Integer [] array = new Integer[10];
		for(int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(100);
		}
		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println(Arrays.toString(array));
	}
}
