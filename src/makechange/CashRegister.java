package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		//User Story #1
		System.out.println("Excluding the dollar sign, please input the price of the purchase: ");
		double cost = kb.nextDouble();
		
		//User Story #2
		System.out.println("Please input the amount of money tendered: ");
		double tender = kb.nextDouble();
		
		double changeDue = (cost - tender);
		double changeOwed = (tender - cost);
		
		//User Story #3
		if (cost > tender)
			System.out.println("You still owe $" + changeDue + ". Please pay the remaining balance.");
		else
			System.out.println("The customer is owed $" + changeOwed);
		
		//User Story #3
		int changeConvert = ((int)(changeOwed * 100));
		
		int twenties = 2000;
		int tens = 1000;
		int fives = 500;
		int singles =  100;
		int quarters =  25 ;
		int dimes =  10;
		int nickels =  5;
		int pennies = 1;
		
		
		
		kb.close();
	}

}
