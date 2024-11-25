package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, qtd, tipo, valor_kw, gasto, acrescimo = 0, total, total_geral=0, qtd_cons=0;
		System.out.println("salário: ");
		salario = sc.nextDouble();
		System.out.println("Quantidade de quilo watts que acaba gastando (0 para encerrar): ");
		qtd = sc.nextDouble();
		valor_kw = salario/8;
		while (qtd != 0) {
			gasto = qtd * valor_kw;
			System.out.println("Tipo do consumidor:");
			System.out.println("1 - residencial | 2 - Comercial | 3- industrial");
			tipo = sc.nextDouble();
			if (tipo  == 1) {
				acrescimo = gasto * 5/100;
			}
			else if (tipo == 2) {
				acrescimo = gasto * 10/100;
			}
			else if (tipo == 3) {
				acrescimo = gasto * 15/100;
			}
			total = gasto + acrescimo;
			total_geral = total_geral + total;
			if (total >= 500 & total <=1000) {
				qtd_cons += 1;
			}
			System.out.println("Gasto: "+gasto);
			System.out.println("Acrescimo: "+acrescimo);
			System.out.println("Total: $"+total);
			System.out.println("");
			System.out.println("Quantidade de quilo watts que gasta (0 para encerrar):");
			qtd = sc.nextDouble();
		}
		System.out.println("");
		System.out.println("Total geral: $"+total_geral);
		System.out.println("Existem "+qtd_cons+" consumidores que estão pagando entre R$500,00 e R$1.000,00.");

	
		}




	}



