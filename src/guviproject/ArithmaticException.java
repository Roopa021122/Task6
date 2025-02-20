package guviproject;

public class ArithmaticException {

	public static void main(String[] args) {
		int a =10;
		int b= 0;
			
			try {
				
			int value = a/b;
			System.out.println("value is " + value);
			}
			
			catch (ArithmeticException e) {
				System.out.println("This is an arithematic exception, please check your code and do a correct calculation");
			}
			
			
			finally {
				System.out.println("Code execution is done");
			}
			
	}
		}

	



	


