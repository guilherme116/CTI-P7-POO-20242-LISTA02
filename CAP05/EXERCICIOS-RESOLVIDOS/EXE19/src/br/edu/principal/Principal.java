package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double M, N, soma, i;
		System.out.println("Insira o valor correspondente de m ");
		M = sc.nextDouble();
		System.out.println("digite o valor correspondente de n ");
		N = sc.nextDouble();
		while(M <N) {
		soma = 0;
		for (i = M; i <=N; i++) {
			soma = soma + i;
			
		}
		System.out.println("O valor da soma será: " + soma  );
		System.out.println("insira o valor de m ");
		M = sc.nextDouble();
		System.out.println("insira o valor de n ");
		N = sc.nextDouble();
		}


	}

}
