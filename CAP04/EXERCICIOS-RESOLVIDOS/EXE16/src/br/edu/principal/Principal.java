package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double Preço, Venda, Novo_preço = 0;
		
		System.out.println("Digite o preço atual do produto");
		Preço = sc.nextDouble();
		System.out.println("Digite a média de vendas mensalmente");
		Venda = sc.nextDouble();
		
		if(Venda<500 || Preço<30) {
			Novo_preço = Preço + 10.0/100.0*Preço;
		} else if ((Venda>=500 && Venda <1200) || (Preço>=30 && Preço<80)) {
			Novo_preço = Preço + 15.0/100.0*Preço;
		} else if (Venda>=1200 || Preço >=80) {
			Novo_preço = Preço - 20.0/100.0*Preço;
		}
		
		System.out.println("Novo preço será " + Novo_preço);
		
		
	}

	}