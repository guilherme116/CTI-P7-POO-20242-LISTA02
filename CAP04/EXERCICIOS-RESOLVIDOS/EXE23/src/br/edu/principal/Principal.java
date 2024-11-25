package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

		double salario_minimo, nht, coeficiente = 0, salario_bruto;

		double imposto = 0, gratificação, auxilio, salario_liquido;

		String turno, categoria;
		System.out.println("salário minimo: ");
		salario_minimo = sc.nextDouble();

		System.out.println("turno: ");

		turno = sc.next();

		System.out.println("categoria: ");

		categoria = sc.next();

		System.out.println("nº de horas que foram trabalhadas");

		nht = sc.nextDouble();
		if (turno.equalsIgnoreCase("m")) {

			coeficiente = 10.0/100.0*salario_minimo;
		}

		if (turno.equalsIgnoreCase("v")) {

			coeficiente = 15.0/100.0*salario_minimo;

		}
		if (turno.equalsIgnoreCase("n")) {

			coeficiente = 12.0/100.0*salario_minimo;

		}

		
		System.out.println("Coeficiente. = " + coeficiente);

		salario_bruto = nht*coeficiente;

		System.out.println("Salario bruto = " + salario_bruto);

		

		if (categoria.equalsIgnoreCase("O")) {

			if (salario_bruto >=300) {

				imposto = 5.0/100.0*salario_bruto;

			} else {

				imposto = 3.0/10.00*salario_bruto;

			}

		} else {

			if (salario_bruto >=400) {

				imposto = 6.0/100.0*salario_bruto;

				imposto = 4.0/100.0*salario_bruto;

			}

		System.out.println("Imposto = " + imposto);

		if (turno.equalsIgnoreCase("n") && nht > 80) {
			gratificação = 50;
			
		} else {
			gratificação = 30;
		}
		System.out.println("Gratificação = " + gratificação);
		
	
		if (categoria.equalsIgnoreCase("O")||coeficiente <=25) {
			auxilio = salario_bruto*1.0/3.0;
			
		} else {
			auxilio = salario_bruto*1.0/2.0;
		}
		
		System.out.println("auxilio = " + auxilio);

		salario_liquido = salario_bruto - imposto + gratificação + auxilio;
		System.out.println("Salário Liq. = " + salario_liquido);
		if (salario_liquido < 350) {
			System.out.println("não é bem remunerado");

		}
		if (salario_liquido >= 350 && salario_liquido <=600) {
			System.out.println("remuneração normal");

		}
		if (salario_liquido > 600) {
			System.out.println("é bem remunerado");
		}
		
		}

	}

}