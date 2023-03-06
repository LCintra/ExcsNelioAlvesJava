package Secao6;

import java.util.Scanner;

public class Aula {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite números para a soma, digite 0 para encerrar:");
		int x = sc.nextInt();
		int soma = 0;
		while(x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		System.out.println("A soma é " + soma);
	}

}
