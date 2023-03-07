package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Digite o nome do aluno");
		String name = sc.nextLine();
		System.out.println("Digite a nota 1 do aluno");
		double n1 = sc.nextDouble();
		System.out.println("Digite a nota 2 do aluno");
		double n2 = sc.nextDouble();
		System.out.println("Digite a nota 3 do aluno");
		double n3 = sc.nextDouble();
		
		student.name = name;
		student.n1 = n1;
		student.n2 = n2;
		student.n3 = n3;
		
		System.out.println("FINAL GRADE = " + student.getFinalGrade());
		System.out.println(student.getStatus());
		
		sc.close();

	}

}
