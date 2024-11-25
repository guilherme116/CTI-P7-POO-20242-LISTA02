package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		double A, B, C, Delta, X1, X2;
		System.out.println("Digite um valor para A");
		A = sc.nextDouble();
		System.out.println("Digite um valor para B");
		B = sc.nextDouble();
		System.out.println("Digite um valor para C");
		C = sc.nextDouble();
		if (A == 0) {
			System.out.println("Esses valores não são capazes de formar uma equação de 2 grau");
		}
		else {
			Delta = (B*B) - (4*A*C);
			if (Delta < 0) {
				System.out.println("Não existe uma raiz real");
			}
			if (Delta == 0) {
				System.out.println("Existe uma raiz real");
				X1 = (-B)/(2*A);
				System.out.println("A raiz será " + X1);
				
			}
			if (Delta > 0) {
				System.out.println("São existentes 2 raizes reais");
				X1 = (-B + Math.sqrt(Delta))/(2*A);
				X2 = (-B - Math.sqrt(Delta))/(2*A);
				System.out.println("A 1ª raiz será " + X1);
				System.out.println("A 2ª raiz será " + X2);
				
			}
			
			
			
		}

	}

}