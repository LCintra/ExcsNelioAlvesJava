import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		String x;
//		x = sc.next();
//		
//		System.out.println("Voce digitou o valor " + x);
//		
//		
//		int z;
//		z = sc.nextInt();
//		System.out.println(z);
//		
//		double w;
//		w = sc.nextDouble();
//		System.out.println(w);
//		
//		char y;
//		y = sc.next().charAt(0);
//		System.out.println(y);
//		
//		sc.close();
		
		String s1, s2, s3;
		int x;
		x = sc.nextInt();
		sc.nextLine(); // a linha 30 vai ler o número e gerar uma quebra de linha, ela precisa ser absorvidida nessa aqui
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
