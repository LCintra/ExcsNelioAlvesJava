package Secao6;

import java.util.Scanner;

public class Aula4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a,b,c);
		
		showResult(higher);
		
		sc.close();

	}
	
	public static int max(int x, int y, int z) {
		if(x > y && x > z) {
			return x;
		} else if (y > z) {
			return z;
		} else {
			return y;
		}
	}
	
	public static void showResult(int number) {
		System.out.println("O Maior número é: " + number);
	}
}
