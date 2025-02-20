package Task5;

public class ReverseString {

	public static void main(String[] args) {
		String word = "SOWPARNIKA";
		String Reverse ="";
		for (int i= word.length()-1;i>=0;i--)
			Reverse = Reverse+ word.charAt(i);
		{
			System.out.println("Reversed String is ::"+Reverse);
		}
		

	}

}
