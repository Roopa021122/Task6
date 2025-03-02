package Task7;

import java.util.ArrayList;

public class ListToArray {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Roopa");
		 list.add("Kia");
		 list.add("Kathir");
		 String[] array = list.toArray(new String[list.size()]);
System.out.println("ArrayElements:");
for (String element : array) {
    System.out.println(element);
	}
	}
	}
