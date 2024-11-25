package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double op, salario, imposto = 0, aumento, novo_salario;
		
		while (true) {
			System.out.println("");
			System.out.println("Menu das opções");
			System.out.println("1 - Imposto");
			System.out.println("2 - Novo Salário");
			System.out.println("3 - Classificação");
			System.out.println("4 - Finalizar o Programa");
			System.out.println("Digite outra opção desejada:");
			op = sc.nextDouble();
			
			if (op > 4 | op < 1) {
				System.out.println("Opção inválida");
			}
			else if (op == 1) {
				System.out.println("Insira salário:");
				salario = sc.nextDouble();
				if (salario < 500) {
					imposto = salario * 5/100;
				}
				else if (salario >= 500 & salario <= 850) {
					imposto = salario * 10/100;
				}
				else if (salario > 850) {
					imposto = salario * 15/100;
				}
				System.out.println("Valor do imposto $"+imposto);
			}
			
			else if (op == 2) {
				System.out.println("Digite o salário:");
				salario = sc.nextDouble();
				if (salario < 1500) {
					aumento = 75;
				}
				else if (salario >= 750 & salario <= 1500) {
					aumento = 50;
				}
				else if (salario >= 450 & salario < 750) {
					aumento = 75;
				}
				else {
					aumento = 100;
				}
				novo_salario = salario + aumento;
				System.out.println("O novo salário será "+novo_salario);
			}
			else if(op == 3) {
				System.out.println("Insira o salário:");
				salario = sc.nextDouble();
				if (salario <= 700) {
					System.out.println("ele é mal Remunerado");
				}
				else {
					System.out.println("ele é bem Remunerado");
				}
			}
			else {
				return;
			}
		}

		}




	}



