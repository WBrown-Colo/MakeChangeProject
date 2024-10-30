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
		if (cost > tender) {
			System.out.println("You still owe $" + changeDue + ". Please pay the remaining balance.");
		}
			else if (cost == tender) {
			System.out.println("Thank you for your purchase. Have a wonderful day!");
			}
		
			else {
			System.out.println("The customer is owed $" + changeOwed);
			System.out.println("Please provide change in the following increments:");
			}
		
		//User Story #3
		int changeConvert = ((int)(changeOwed * 100));
		//System.out.println(changeConvert);
		
		
		int twentiesOwed = (changeConvert / 2000);
		changeConvert = changeConvert - twentiesOwed * 2000;
		
		int tensOwed = (changeConvert / 1000);
		changeConvert = changeConvert - tensOwed * 1000;
		
		int fivesOwed = (changeConvert / 500);
		changeConvert = changeConvert - fivesOwed * 500;
		
		int onesOwed = (changeConvert / 100);
		changeConvert = changeConvert - onesOwed * 100;
		
		int quartersOwed = (changeConvert / 25);
		changeConvert = changeConvert - quartersOwed * 25;
		
		int dimesOwed = (changeConvert / 10);
		changeConvert = changeConvert - dimesOwed * 10;
		
		int nickelsOwed = (changeConvert / 5);
		changeConvert = changeConvert - nickelsOwed * 05;
		
		int penniesOwed = (changeConvert / 1);
		changeConvert = changeConvert - penniesOwed * 01;
		
		
		if (twentiesOwed >= 1) {
			System.out.println("$20: " + twentiesOwed);
			}
		
		if (tensOwed >= 1) {
			System.out.println("$10: " + tensOwed);
			}
			
		if (fivesOwed >= 1) {
			System.out.println("$5: " + fivesOwed);
			}
		
		if (onesOwed >= 1) {
			System.out.println("$1: " + onesOwed);
			}
			
		if (quartersOwed >= 1) {
			System.out.println("$0.25: " + quartersOwed);
			}
			
		if (dimesOwed >= 1) {
			System.out.println("$0.10: " + dimesOwed);
			}
			
		if (nickelsOwed >= 1) {
			System.out.println("$0.05: " + nickelsOwed);
			}
			
		if (penniesOwed >= 1) {
			System.out.println("$0.01: " + penniesOwed);
			}
		
		
		kb.close();
	}

}
