package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rec = new Rectangle();
		
		System.out.println("Entre com a área do retângulo");
		double width = sc.nextDouble();
		rec.width = width;
		
		System.out.println("Entre com a altura do retângulo");
		double height = sc.nextDouble();
		rec.height = height;
		
		double diagonal = rec.getDiagonal();
		double area = rec.getArea();
		double perimeter = rec.getPerimeter();
		
		System.out.println("Diagonal: " + diagonal + " Área: " + area + " Perimetro: " + perimeter);
		
		sc.close();
	}

}
