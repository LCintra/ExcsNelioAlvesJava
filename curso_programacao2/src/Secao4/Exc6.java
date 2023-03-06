package Secao4;

import java.util.Locale;
import java.util.Scanner;

public class Exc6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double a, b, c;
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira valor de A:");
		a = sc.nextDouble();
		System.out.println("Insira valor de B:");
		b = sc.nextDouble();
		System.out.println("Insira valor de C:");
		c = sc.nextDouble();
		
		System.out.println("Letra A:");
		System.out.printf("%.3f%n" ,(a * c) / 2);
		
		System.out.println("Letra B:");
		System.out.printf("%.3f%n" ,(c*c)*3.14159);
		
		System.out.println("Letra C:");
		System.out.printf("%.3f%n" ,((a+b)/2) * c);
		
		System.out.println("Letra D:");
		System.out.printf("%.3f%n" ,b * b);
		
		System.out.println("Letra E:");
		System.out.printf("%.3f%n" ,a * b);
	}

}
