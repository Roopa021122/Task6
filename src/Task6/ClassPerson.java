package Task6;

public class ClassPerson {
	class Person {
	    private String name;
	    private int age;

	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	   
	    }
	}
	 public static void main(String[] args) {
	         ClassPerson outer = new ClassPerson();
            Person person = outer.new Person("Roopa", 25);
	        System.out.println("Name: " + person.getName());
	        System.out.println("Age: " + person.getAge());
	    }
	}

