package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Número da conta:");
		int nrConta = sc.nextInt();
		sc.nextLine();

		System.out.println("Nome do titular:");
		String nomeTit = sc.nextLine();

		System.out.println("Deseja inserir um valor inicial? [S/N]");
		String desejaValorInicial = sc.nextLine();

		ContaBancaria contaBancaria;
		if (desejaValorInicial.equals("S")) {
			System.out.println("Qual o valor inicial?");
			double valorInicial = sc.nextDouble();
			contaBancaria = new ContaBancaria(nrConta, nomeTit, valorInicial);
		} else {
			contaBancaria = new ContaBancaria(nrConta, nomeTit);
		}
		System.out.println(contaBancaria);
		
		System.out.println("Deseja depositar quanto?");
		double valorADepositar = sc.nextDouble();
		contaBancaria.realizarDeposito(valorADepositar);
		System.out.println(contaBancaria);
		
		System.out.println("Deseja sacar quanto?");
		double valorASacar = sc.nextDouble();
		contaBancaria.realizarSaque(valorASacar);
		System.out.println(contaBancaria);

		sc.close();

	}

}