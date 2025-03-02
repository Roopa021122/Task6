package Task7;

public class ArrayStringException {

	public static void main(String[] args) {
		
		        try {
		            int[] arr = {1, 2, 3};
		            System.out.println(arr[5]);  // This throws ArrayIndexOutOfBoundsException
		        } catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("Array index out of bounds!");
		        }

		        try {
		            String str = "Hello";
		            System.out.println(str.charAt(10));  // This throws StringIndexOutOfBoundsException
		        } catch (StringIndexOutOfBoundsException e) {
		            System.out.println("String index out of bounds!");
		        }
		    }
		}


