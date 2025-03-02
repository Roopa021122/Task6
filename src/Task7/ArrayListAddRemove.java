package Task7;

import java.util.ArrayList;

public class ArrayListAddRemove {

	public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<>();
 list.add("Roopa");
 list.add("Kia");
 list.add("Kathir");
 System.out.println("Added List:"+list);
 list.clear();
 System.out.println("Removed List:"+ list);
	}

}
