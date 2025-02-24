package Task6;

class Circumference {
    private double radius;

    // Default constructor
    public Circumference() {
        this.radius = 1.0;
    }

    // Parameterized constructor
    public Circumference(double radius) {
        this.radius = radius;
    }

    // Method to get the circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to get the radius
    public double getRadius() { 
        return radius;
    }




    public static void main(String[] args) {
        // Creating a Circle object using the default constructor
    	Circumference circle1 = new Circumference();
        System.out.println("Circle 1 Radius: " + circle1.getRadius());
        System.out.println("Circle 1 Circumference: " + circle1.getCircumference());

        // Creating a Circle object using the parameterized constructor
        Circumference circle2 = new Circumference(5.0);
        System.out.println("Circle 2 Radius: " + circle2.getRadius());
        System.out.println("Circle 2 Circumference: " + circle2.getCircumference());
    }
}
