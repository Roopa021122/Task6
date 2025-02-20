package guviproject;

import java.util.HashMap;

public class HashMapAssignment{

	public static void main(String[] args) {
HashMap<String, String> myMap = new HashMap<String, String>();
		
		myMap.put("mentorName", "Himanshu");
		myMap.put("learnerName1", "Venkata");
		myMap.put("learnerName2", "Roopa");
		myMap.put("learnerName3", "Joyson");
		String value1 = myMap.get("mentorName");
		String value2 = myMap.get("learnerName1");
		String value3 = myMap.get("learnerName2");
		String value4 = myMap.get("learnerName3");
		System.out.println("MentorName is :: " + value1);
		System.out.println("learnerName1 is :: " + value2);
		System.out.println("learnerName2 is :: " + value3);
		System.out.println("learnerName3 is :: " + value4);
		try {
			
			System.out.println("learnerName5 is :: " +myMap.get("learnerName5"));
	        } catch (Exception e) {
	            System.out.println("Key Learner5 does not exist in our map");
		}
		

		



	}

}
