package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double Salário, Novo_salário, Bonificação, Auxilio;
		System.out.println("Digite o salário");
		Salário = sc.nextDouble();
		if (Salário <= 500) {
			Bonificação = Salário*5/100;
			
		} else if (Salário <= 1200) {
			
			Bonificação = Salário*12/100;
			
		} else {
			Bonificação = 0;
		}
		
		if (Salário <= 600) {
			Auxilio = 150;
		} else {
			Auxilio = 100;
		}
		
		Novo_salário = Salário + Bonificação + Auxilio;
		System.out.println("O novo salário vai ser de " + Novo_salário);


	}

}