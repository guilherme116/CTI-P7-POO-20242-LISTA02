package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N, N2, Soma, Raiz, op;
		System.out.println("_____________MENU_____________");
		System.out.println("1- a soma de dois números");
		System.out.println("2- a raiz quadrada de um número");
		System.out.println("Insira uma opção:");
		op num = sc.nextDouble();
		System.out.println("______________________________");
		if (op == 1) {
			System.out.println("insira o primeiro número: ");
			N = sc.nextDouble();
			System.out.println("insira o segundo número: ");
			N2 = sc.nextDouble();
			Soma = N+N2;
			System.out.println("uma soma de "+N+" e "+N2+" é "+Soma);
		}
		else if(op==2) {
			System.out.println("Insira o número: ");
			N = sc.nextDouble();
			Raiz = Math.sqrt(N);
			System.out.println("a raiz quadrada de "+N+" é "+Raiz);
		}
		else {
			System.out.println("opção inválida!!");
		}
	}
	
	}