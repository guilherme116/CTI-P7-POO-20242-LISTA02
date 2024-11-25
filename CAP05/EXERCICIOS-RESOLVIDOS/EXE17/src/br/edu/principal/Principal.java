package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario_carlos, salario_joao, meses;
		System.out.println("Insira o salário de carlos: ");
		salario_carlos = sc.nextDouble(); 
		salario_joao = salario_carlos / 3;
		meses = 0;
		while(salario_joao < salario_carlos) {
			salario_carlos = salario_carlos + (salario_carlos * 2 / 100);
			salario_joao = salario_joao + (salario_joao * 5 / 100);
			meses = meses + 1;
		}
		System.out.println(meses);



	}

}
