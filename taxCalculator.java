import java.util.Scanner;

public class taxCalculator {

	public static void main(String[] args) {

		// Creating scanner object
		
		Scanner keyboard = new Scanner(System.in);
		
		// If else statements
				
		System.out.println("Enter annual income of 1st employee:");
		double annualIncome = keyboard.nextDouble();		
		
		double tax1 = 0;
		double tax2 = 0;
		
		double taxFifty = annualIncome * 50 / 100;
		double taxFiftyFinal = annualIncome - taxFifty;
		double taxThirty = annualIncome * 30 / 100;
		double taxThirtyFinal = annualIncome - taxThirty;
		double taxTen = annualIncome * 10 /100;
		double taxTenFinal = annualIncome - taxTen;
		double taxZero = annualIncome;
		
		if (100000 <= annualIncome)
		{
			System.out.println("Net income of 1st employee: "+taxFiftyFinal+" $.");		
			System.out.println("Tax level: High.");	
			tax1 = 0.5;
		}
		else if (40000 <= annualIncome && annualIncome < 100000) 
		{	
			System.out.println("Net income of 1st employee:"+taxThirtyFinal+" $.");
			System.out.println("Tax level: Middle.");
			tax1 = 0.3;
		}
		else if (10000 <= annualIncome && annualIncome < 40000)
		{
			System.out.println("Net income of 1st employee: "+taxTenFinal+" $.");
			System.out.println("Tax level: Low.");
			tax1 = 0.1;
		}
		else if  (0 <= annualIncome && annualIncome < 10000)
		{
		System.out.println("Net income of 1st employee: "+taxZero+" $.");
		System.out.println("Tax level: No Tax.");
		tax1 = 0;
		}
		else
		{
			System.out.println("Annual income cannot be under 0!");
		}
		
		System.out.println("Enter annual income of 2nd employee:");
		double annualIncomeSecond = keyboard.nextDouble();
		
		double taxFifty2nd = annualIncomeSecond * 50 / 100;
		double taxFiftyFinal2nd = annualIncomeSecond - taxFifty2nd;
		double taxThirty2nd = annualIncomeSecond * 30 / 100;
		double taxThirtyFinal2nd = annualIncomeSecond - taxThirty2nd;
		double taxTen2nd = annualIncomeSecond * 10 /100;
		double taxTenFinal2nd = annualIncomeSecond - taxTen2nd;
		double taxZero2nd = annualIncomeSecond;
		
		
		if (100000 <= annualIncomeSecond)
		{
			System.out.println("Net income of 2nd employee: "+taxFiftyFinal2nd+" $.");		
			System.out.println("Tax level: High.");	
			tax2 = 0.5;
		}
		else if (40000 <= annualIncomeSecond && annualIncomeSecond < 100000) 
		{	
			System.out.println("Net income of 2nd employee: "+taxThirtyFinal2nd+" $.");
			System.out.println("Tax level: Middle.");
			tax2 = 0.3;
		}
		else if (10000 <= annualIncomeSecond && annualIncomeSecond < 40000)
		{
			System.out.println("Net income of 2nd employee: "+taxTenFinal2nd+" $.");
			System.out.println("Tax level: Low.");
			tax2 = 0.1;
		}
		else if  (0 <= annualIncomeSecond && annualIncomeSecond < 10000)
		{
			System.out.println("Net income of 2nd employee: "+taxZero2nd+" $.");
			System.out.println("Tax level: No Tax.");
			tax2 = 0;
		}
		else
		{
			System.out.println("Annual income cannot be under 0!");
		}
		
		
		if (tax1 == tax2 && annualIncomeSecond == annualIncome)
		{
			System.out.println("Tax levels of employees are same.");
			System.out.println("Net incomes are equal.");
			
		}
		else if (tax1 == tax2 && annualIncomeSecond > annualIncome)
		{
			System.out.println("Tax levels of employees are same.");
			System.out.println("2nd employee earns more than 1st employee.");
		}
		else if (tax1 == tax2 && annualIncome > annualIncomeSecond)
		{
			System.out.println("Tax levels of employees are same.");
			System.out.println("1st employee earns more than 2nd employee.");
		}
		else if (annualIncomeSecond > annualIncome) 
		{
			System.out.println("Tax levels of employees are not same.");
			System.out.println("2nd employee earns more than 1st employee.");
		}
		else if (annualIncome > annualIncomeSecond)
		{
		
			System.out.println("Tax levels of employees are not same.");
			System.out.println("1st employee earns more than 2nd employee.");
			
		}
			
		}
		
		
		
		}
		
	
	


