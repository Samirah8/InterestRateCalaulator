//Samirah Ali, Course: CIS 406 Lab: InterestRateCalculatorPart1
package interestRateCalculatorPart1;

import java.util.Scanner;

import java.util.Locale;

import java.text.NumberFormat;

public class InterestRateCalculatorPart1 {

	public static void main(String[] args)
	{
		// Create introduction
		System.out.println("Welcome to the Interest Calculator");
		
		//User inputs
		char keepGoing = 'y';
		
		//Create Scanner object 
		Scanner input = new Scanner(System.in);
		
		//Keep getting new inputs
		while (keepGoing != 'n' && keepGoing != 'N');
		{
		
			System.out.print("\nEnter loan amount: ");
			int loanAmount = input.nextInt();
			System.out.print("\nEnter interest rate: ");
			double interestRate = input.nextDouble();
		
			//Calculate interest
			Locale usa = new Locale("en", "us");
			double interestAmount = interestRate/100.0 * loanAmount;
			NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);
				
		
			//Output Results
			System.out.println("\n Loan amount:\t\t" + dollarFormat.format(loanAmount));
			if ((double)((int) interestRate) == interestRate)
			{
				System.out.println("Interest rate:\t\t" + (int)interestRate + "%");
			}
			else
			{
				System.out.println("Interest rate:\t\t"+ interestRate +"%");
			}
			System.out.println("Interest:\t\t" + dollarFormat.format(interestAmount));
		
			//Output results
			System.out.println("\n Loan amount: \t\t" + loanAmount);
			System.out.println("\n Interest rate: \t\t" + interestRate);
			System.out.println("\n Interest: \t\t" + dollarFormat.format(keepGoing));
		
			//Check if user has more inputs
			System.out.print("\n Continue? (y/n); ");
			keepGoing = input.next().charAt(0);
		}
		//Close Scanner Object and end program
		input.close();
		System.out.println("\nBye!!!");
		
		

	}

}
