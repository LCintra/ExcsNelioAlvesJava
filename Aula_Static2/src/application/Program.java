package application;

import java.util.Scanner;

import utils.Calculator;

public class Program {

	public static void main(String[] args) {
		/*Diferente do Aula_Static1 a classe calculator foi feita com funções estáticas permitindo
		chamar o nome da classe diretamente sem ter que instanciar previamente*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);

		sc.close();
	}

}
