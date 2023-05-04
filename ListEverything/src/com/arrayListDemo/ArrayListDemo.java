package com.arrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(1);al1.add(2);al1.add(1);al1.add(null);
		ArrayList<Integer> al2 = new ArrayList<>(al1);
		System.out.println(al2);

		int[] originalArray = {1,2,3,4,5};
		int[] copiedArray = Arrays.copyOf(originalArray, 10);
		for(int i : copiedArray) {
			System.out.println(i);
		}
//Adding another collection
		al1.addAll(al2);
		System.out.println(al2.size());
//
		al1.addAll(1, al2);
		System.out.println(al1.toString());
		System.out.println(al1.size());

	}

}
