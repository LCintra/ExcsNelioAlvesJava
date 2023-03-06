package Secao6;

import java.util.Scanner;

public class Aula2 {

	public static void main(String[] args) {
		// ctrl shift f identa o código
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos números deseja somar?");
		int N = sc.nextInt();
		int soma = 0;
		
		for(int i=0; i<N; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		System.out.println("A soma é: " + soma);
		sc.close();
	}

}
