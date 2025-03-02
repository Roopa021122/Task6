package Task7;
import java.util.Map;
import java.util.TreeMap;

public class EmployeeTreeMap {

	public static void main(String[] args) {
	TreeMap<Integer , String> Employees = new TreeMap<>();
Employees.put(001,"Roopa");
Employees.put(002,"Kiyanshi");
Employees.put(003,"Aathi");
Employees.put(004,"Uma");
Employees.put(005,"Kathir");

System.out.println("Employees in alphabetical order:");
Employees.values().stream().sorted().forEach(System.out::println);
	}

}
