package guviproject;

import java.util.ArrayList;
import java.util.List;

public class CreateAndRemoveList {

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
           
            System.out.print("my original list is :: " + myList);
    		System.out.println();
    		 myList.remove(3);
            
            myList.remove(4);
            System.out.print("my list after removel of index value 3 & 4 is :: " + myList);

}
}