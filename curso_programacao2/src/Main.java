import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		System.out.println("Olá mundo");
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.println(x); // printar e pular linha no final
		System.out.printf("%.2f%n", x); // printar formatando
		System.out.printf("%.4f%n", x); // printar formatando
		Locale.setDefault(Locale.US); // transforma o pad~rao para o americano para que não seja , mas sim .
		System.out.printf("%.4f%n", x); // printar formatando
		System.out.println("RESULTADO = " + x + " Metros"); // concatenando
		System.out.printf("RESULTADO = %.2f metros%n", x); // concatenando com printf
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); // %f é ponto flutuante | %d inteiro | %s texto | %n quebra de linha
		
		int y = 2;
		int z = 5;
		
		float resultado2 = z / y;
		float resultado = (float) z / y; // casting, converte o resultado para float
		
		System.out.println(resultado);
		System.out.println(resultado2);
	}

}
