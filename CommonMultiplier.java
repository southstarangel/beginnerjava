import java.util.Scanner;

public class CommonMultiplier {

	public static void main(String[] args) {

		// Creating scanner object
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Enter 1st integer:");
		int firstInt = keyboard.nextInt();
		
		System.out.println("Enter 2nd integer:");
		int secondInt = keyboard.nextInt();
		
		
		if (firstInt > 0 && secondInt > 0)
		{
			if (120 % firstInt == 0 && 120 % secondInt == 0 )
		{
			System.out.println("120 is common multiple of numbers.");
		}
			else 
		{
			System.out.println("120 is not common multiple of numbers.");
		}
			if (firstInt % 5 == 0 && firstInt % 6 == 0)
		{
			System.out.println("First number is common multiple of 5 and 6.");
		}
			else
		{
			System.out.println("First number is not common multiple of 5 and 6.");
		}
			
		}	
		else
		{
		System.out.println("Input cannot be a negative number or 0!");
		}
	}
	
		
		
	}
	



