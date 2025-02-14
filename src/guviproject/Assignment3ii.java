package guviproject;

public class Assignment3ii {

	public static void main(String[] args) {
		// 2) create a class having one method having 2 parameters  int string
		EmployeeDetails(5, "Manual Tester");
	     patientdetails("hari",26);
	}
	
	public static void EmployeeDetails(int  totalexperienceofemployee, String Roleofemployee ) {
		System.out.println("total experience of employee is  " + totalexperienceofemployee + " and " + " Role of employee is " + Roleofemployee);
	}

//3)create a class having one method having 2 parameters string int
public static void patientdetails(String Name, int age ) {
	System.out.println("patient name is "+ Name +"and"+"Age is "+ age);
}
}