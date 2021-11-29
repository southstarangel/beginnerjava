import java.util.Scanner;

public class AsteriksTriangle {

	public static void main(String[] args) {
		
		// Creating a scanner object
		
		Scanner keyboard = new Scanner(System.in);
		
		//  Input from user
		
		System.out.println("Enter a number:");
		int rows = keyboard.nextInt();
		int i = 1;
		int j = 1;
		
        while (i <= rows) {
            while (j <= i) {
                System.out.print("*");
                j++;

            }
            System.out.print("\n");
            i++;
            j = 1;
        }
		
		

	}

}
