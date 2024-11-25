package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double X = 0, Y = 0, Z = 0;
		System.out.println("Digite os  valores dos lados de X, Y e Z referentes de um triângulo");
		System.out.println("X.....");
		X = sc.nextDouble();
		System.out.println("Y.....");
		Y = sc.nextDouble();
		System.out.println("Z.....");
		Z = sc.nextDouble();
		
		if ((X < Y + Z) && (Y < X + Z) && (Z < Y + X)) {
			if ((X==Y) && (X == Z)) {
				System.out.println("Triângulo equilátero");

			} else if (X == Y || X == Z || Y == Z) {
				System.out.println("Triângulo isósceles");
			} else if (X != Y || X != Z || Y != Z) {
				System.out.println("Triângulo escaleno");
			}
			
		}
		else {
			System.out.println("As medidas apresentadas não são capazes de formar um triângulo");
		}

	}

}