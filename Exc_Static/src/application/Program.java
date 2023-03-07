package application;

import java.util.Locale;
import java.util.Scanner;

import utils.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the dollar price?");
		double dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		double dollarsBought = sc.nextDouble();
		
		double amountToBePaid = CurrencyConverter.convertRealToDolar(dollarPrice, dollarsBought);
		
		System.out.println("Amount to be paid in reais: " + amountToBePaid);
		
		sc.close();
	}

}
