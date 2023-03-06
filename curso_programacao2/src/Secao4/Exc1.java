package Secao4;

import java.util.Scanner;

public class Exc1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira primeiro valor:");
		int x = sc.nextInt();
		
		System.out.println("Insira segundo valor:");
		int y = sc.nextInt();
		
		System.out.println("A soma dos valores é: ");
		System.out.println(x + y);
		
		sc.close();
	}

}
