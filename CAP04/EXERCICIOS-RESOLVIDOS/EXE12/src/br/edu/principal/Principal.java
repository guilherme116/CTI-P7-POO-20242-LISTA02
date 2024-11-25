package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double Salario, Aumento, Novo_salario, Cargo;
		System.out.println("Insira qual o cargo do funcionario (1, 2, 3, 4 ou 5): ");
		Cargo = sc.nextInt();
		System.out.println("Insira qual o valora do salario: ");
		Salario = sc.nextInt();
		if(Cargo==1) {
			System.out.println("O cargo é de Escriturário");
			Aumento = Salario*50/100;
			System.out.println("O valor do aumento será: "+Aumento);
			Novo_salario = Salario+Aumento;
			System.out.println("O novo salário será: "+Novo_salario);
		}
		else if(Cargo==2) {
			System.out.println("O cargo é de Secretário");
			Aumento = Salario*35/100;
			System.out.println("O valor do aumento será: "+Aumento);
			Novo_salario = Salario+Aumento;
			System.out.println("O novo salário será: "+Novo_salario);
}
		else if(Cargo==3) {
			System.out.println("O cargo é de Caixa");
			Aumento = Salario*20/100;
			System.out.println("O valor do aumento será: "+Aumento);
			Novo_salario = Salario+Aumento;
			System.out.println("O novo salário será: "+Novo_salario);
}
		else if(Cargo==4) {
			System.out.println("O cargo é de Gerente");
			Aumento = Salario*10/100;
			System.out.println("O valor do aumento será de: "+Aumento);
			Novo_salario = Salario+Aumento;
			System.out.println("O novo salário será: "+Novo_salario);}
		else if(Cargo==5) {
			System.out.println("O cargo é de Diretor");
			Aumento = Salario*0/100;
			System.out.println("O valor do aumento será: "+Aumento);
			Novo_salario = Salario+Aumento;
			System.out.println("O novo salário será: "+Novo_salario);
			}
		else {
			System.out.println("Cargo não existe!");
		}
}

	}