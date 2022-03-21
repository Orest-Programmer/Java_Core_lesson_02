package ua.lviv.lgs.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T> {

	private T[] list;
	private int size;
	private final int DEFAULT_CAPACITY = 10;
	private int capacity;
	private T[] listCopy;

	public MyArrayList(int capacity) {
		if (capacity <= 0) {
			throw new IllegalArgumentException("Capacity <= 0");
		} else {
			list = (T[]) new Object[capacity];
		}
		this.capacity = capacity;
	}

	public MyArrayList() {
		list = (T[]) new Object[DEFAULT_CAPACITY];
	}

	public void add(T item) {
		if (list.length <= size) {
			capacity = size * 2;
			System.arraycopy(listCopy, 0, list, 0, listCopy.length);
			list = (T[]) new Object[capacity];
			list[size++] = item;

			if (list.length >= capacity) {
				System.arraycopy(listCopy, 0, list, 0, listCopy.length);
			}

		} else {
			list[size++] = item;
			listCopy = list;
		}
	}

	public void remove(int index) {
		for (int i = index; i < size; i++) {
			list[i] = list[i + 1];
		}
	}

	@Override
	public String toString() {
		return Arrays.toString(Arrays.copyOf(list, size));
	}

}
