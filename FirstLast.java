import java.util.Scanner;

public class FirstLast {

	public static void main(String[] args) {
		
		String yesno = "";
		
		// Scanner object
		
		Scanner keyboard = new Scanner(System.in);
		
		do {
		
		System.out.print("Enter any number to find sum of first and last digit: ");
		int number = keyboard.nextInt();
		
		int firstNumber = 0;
		int lastNumber = number % 10;

		while (number!=0) {
			firstNumber = number%10;
			number /= 10;
		}
		
		int numberSum = firstNumber + lastNumber;
		
		System.out.println("Sum of first and last digit = "+numberSum);
		
		System.out.println("Do you want to keep performing? Please enter \"yes\" if so; something else otherwise:");
		yesno = keyboard.next();
		

		} while (yesno.equalsIgnoreCase("yes"));
	
		System.out.println("Thanks; the program terminates here. See you.");
		
	
		}
	}

