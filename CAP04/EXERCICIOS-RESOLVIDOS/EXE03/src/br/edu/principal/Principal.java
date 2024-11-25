package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N1, N2;
		
		System.out.println("Insira o número: ");
		N1 = sc.nextDouble();
		
		System.out.println("Insira o número: ");
		N2 = sc.nextDouble();
		
		System.out.println("Primeiro número recebido: "+N1);
		System.out.println("Segundo número recebido: "+N2);
		
		if (N1>N2) {
			System.out.println("O maior número vai ser: "+N1);
		}
		else if(N2>N1) {
			System.out.println("O maior número vai ser: "+N2);
		}
		else {
			System.out.println("Os números serão iguais.");
		}
	
	}


		

	}