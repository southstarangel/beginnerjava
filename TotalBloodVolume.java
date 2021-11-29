import java.util.Scanner;

public class TotalBloodVolume  {

	public static void main(String[] args) {

		// Creating a scanner object
		
		Scanner keyboard = new Scanner(System.in);
		
		// Reading gender value from user (read as string)
		
		System.out.println("Welcome! Please enter your gender:");
		String sr = keyboard.nextLine();
		
		// if else statement for gender values
		
		if (sr.equalsIgnoreCase("male") || sr.equalsIgnoreCase("female")) {
			System.out.println("Age:");
			int age = keyboard.nextInt();
		}
		else {
			System.out.println("You entered wrong input. Good Bye!");	
			System.exit(0); // Stops the code
		}
		
		// Reading weight and height from user
		
		System.out.println("Weight:");
		int weight = keyboard.nextInt();
		
		System.out.println("Height:");
		double height = keyboard.nextDouble();
		
		// TBV formulas
		
		double tbvMale = (0.3669*Math.pow(height, 3)+(0.03219*weight)+0.6041);
		double tbvFemale = (0.3561*Math.pow(height, 3)+(0.03308*weight)+0.1833);
		
		// If else statements for male
		
		if (sr.equalsIgnoreCase("male") && tbvMale <= 3.5) {
			System.out.println("Your TBV is "+tbvMale+" ml and your category is \"Low\".");
			System.out.println("Your total blood volume is low.");
		}
			else if (sr.equalsIgnoreCase("male") && 3.5 < tbvMale && tbvMale <= 7) {
			System.out.println("Your TBV is "+tbvMale+" ml and your category is \"Normal\".");	
			System.out.println("Your total blood volume is normal.");
			}
			else if (sr.equalsIgnoreCase("male") && 7 < tbvMale ) {
				System.out.println("Your TBV is "+tbvMale+" ml and your category is \"Over\".");
				System.out.println("Your total blood volume is over.");
			}
			else {
				
				}
				
		// If else statements for female
		
		if (sr.equalsIgnoreCase("female") && tbvFemale <= 3) {
			System.out.println("Your TBV is "+tbvFemale+" ml and your category is \"Low\".");
			System.out.println("Your total blood volume is low.");
		}
			else if (sr.equalsIgnoreCase("female") && 3 < tbvFemale && tbvFemale <= 5) {
			System.out.println("Your TBV is "+tbvFemale+" ml and your category is \"Normal\".");	
			System.out.println("Your total blood volume is normal.");
			}
			else if (sr.equalsIgnoreCase("female") && 5 < tbvFemale ) {
				System.out.println("Your TBV is "+tbvFemale+" ml and your category is \"Over\".");
				System.out.println("Your total blood volume is over.");
			}
			else {
				System.exit(0); // Stops the code
				}
			
		}
	}


