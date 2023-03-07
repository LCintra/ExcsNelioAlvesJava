package utils;

public class CurrencyConverter {
	public static double convertRealToDolar(double price, double amount) {
		return 106 * (price * amount) / 100;
	}
}
