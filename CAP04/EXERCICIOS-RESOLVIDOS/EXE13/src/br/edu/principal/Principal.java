package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		double op, Salario, Imposto = 0, Aumento = 0, Novo_salario = 0;
		System.out.println("Menu de opções");
		System.out.println("1 - Imposto");
		System.out.println("2 - Novo salário");
		System.out.println("3 - Classificação");
		System.out.println("Insira a opção desejada");
		op = sc.nextDouble();
		
		if (op == 1) {
			System.out.println("Digite o salário");
			Salario = sc.nextDouble();
			if (Salario<500) {
				Imposto = Salario*5/100;
			}
			if (Salario>=500 && Salario<=850) {
				Imposto = Salario*10/100;
			}
			if (Salario>850) {
				Imposto = Salario*15/100;
			}
			System.out.println("Imposto " + Imposto);

		}
		
		if (op == 2) {
			
			System.out.println("Digite o salário");
			Salario = sc.nextDouble();
			if (Salario>1500) {
				Aumento = 25;
			}
			if (Salario>=750 && Salario<=1500) {
				Aumento = 50;	
			}
			if (Salario>=450 && Salario<750) {
				Aumento = 75;			
			}
			if (Salario<450) {
				Aumento = 100;
				
			}
			Novo_salario = Salario+Aumento;
			System.out.println("Novo salário é " + Novo_salario);
		}
		
		if (op == 3) {
			System.out.println("Digite o novo salário");
			Salario = sc.nextDouble();
			if (Salario <= 700) {
				System.out.println("Remuneração ruim");

			}
			if (Salario > 700) {
				System.out.println("Remuneração boa");

			}
		}
		
		else {
			System.out.println("Opção invalida");

		}

	}

}