package Task5;

public class Palindrome {

	public static void main(String[] args) {
		String word = "MADAM";
		String word2 ="";
		
		for (int i= word.length()-1;i>=0;i--)
		
		word2 = word2 + word.charAt(i);
		
		if (word.equals(word2))
				System.out.println("It's a palindrome");
		else {
			System.out.println("Not a palindrome");
		}
	}

}
