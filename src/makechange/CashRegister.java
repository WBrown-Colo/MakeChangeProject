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
		
		
		
		
		kb.close();
	}

}
