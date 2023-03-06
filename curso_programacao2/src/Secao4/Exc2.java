package Secao4;

import java.util.Locale;
import java.util.Scanner;

public class Exc2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio do círculo: ");
		float r = sc.nextFloat();
		
		System.out.printf("A Área do círculo é: %.4f%n" , (r*r) * 3.14159);
		
		sc.close();
	}

}
