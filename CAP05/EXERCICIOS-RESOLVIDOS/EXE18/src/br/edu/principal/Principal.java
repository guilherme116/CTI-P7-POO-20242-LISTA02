package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numero, quadrado, cubo, raiz;
		
		System.out.println("Insira o numero: ");
		numero = sc.nextDouble();
		while (numero > 0) {
			quadrado = numero * numero;
			cubo = numero * numero * numero;
			raiz = Math.sqrt(numero);
			System.out.print(" o quadrado do número: " + quadrado);
			System.out.print("  o cubo do número: " + cubo);
			System.out.println("  a raiz quadrada do número: " + raiz);
			System.out.println("Insira o numero: ");
			numero = sc.nextDouble();
		}

	}

}
