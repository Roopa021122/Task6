package guviproject;

import java.util.ArrayList;
import java.util.List;

public class Createalist {

	public static void main(String[] args) {
		myList();
	}
	public static void myList() {
		List<Integer> myList = new ArrayList<>();
		myList.add(14); // 0 
		myList.add(57);  // 1
		myList.add(69); // 2
		myList.add(95); // 3
		myList.add(80);  // 4
		myList.add(200);  // 5
		myList.add(467);  // 6 
		myList.add(190); // 7 
		myList.add(45); // 8
		myList.add(750); // 9
		myList.add(6700); // 10
		System.out.println("value at position 5 in my list is :: " + myList.get(4));
		System.out.println("value at position 6 in my list is :: " + myList.get(5));
		}
}
