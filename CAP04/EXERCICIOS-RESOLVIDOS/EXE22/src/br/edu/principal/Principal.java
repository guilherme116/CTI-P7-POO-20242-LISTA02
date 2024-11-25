package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario_base, tempo, imposto, gratificação, salario_liquido;
		
		System.out.println("Digite o salario base");
		salario_base = sc.nextDouble();
		System.out.println("Digite o tempo do serviço");
		tempo = sc.nextDouble();
		
		if (salario_base<200) {
			imposto = 0;
		} else if (salario_base <= 450) {
			imposto = 3.0/100.0*salario_base;
		} else if (salario_base<700) {
			imposto = 8.0/100.0*salario_base;
		} else {
			imposto = 12.0/100.0*salario_base;
		}
		
		System.out.println("Imposto vai ser " + imposto);
		if (salario_base>500) {
			if (tempo<=3) {
				gratificação = 20;
				
			}
			else {
				gratificação = 30;
			}
		}
		else {
			if(tempo<=3) {
				gratificação = 23;
			} else if (tempo<6) {
				gratificação = 35;
			} else {
				gratificação = 33;
			}
		}
		System.out.println("Gratificação vai ser " + gratificação);
		salario_liquido = salario_base - imposto + gratificação;
		System.out.println("Salário liquido vai ser " + salario_liquido);
		if (salario_liquido<=350) {
			System.out.println("Classificação a");
		} else if (salario_liquido < 600) {
			System.out.println("Classificação b");
		} else {
			System.out.println("Classificação c");
		}

	}

}