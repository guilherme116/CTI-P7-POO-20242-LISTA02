package br.edu.principal;
public class Principal {

	public static void main(String[] args) {
		   int Ano_atual, i;
	        double Salário, Novo_salario, Percentual;
	        
	        Ano_atual = 2024;
	        Salário = 300;
	        Percentual = 1.5/100;
	        Novo_salario = Salário + Percentual * Salário;
	        for (i=2007;i<=Ano_atual; i++) {
	            Percentual = Percentual * 2;
	            Novo_salario = Novo_salario + Percentual * Novo_salario;
	        }
	        System.out.println("Salario do momento atual: "+Novo_salario);

	}

}
