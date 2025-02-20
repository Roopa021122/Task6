package guviproject;

public class OutOfBoundaryException {

	public static void main(String[] args) {
		try {
		int[] myArray = {1,2,3,4,5,6,7,8,9,0};
		System.out.println("Value of position in my array is :: " + myArray[11]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please check the index of myarray");
		}
        finally {
			System.out.println("Code execution is done");
		}
		}
        }
