package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double preço, valor_adicional = 0, imposto;
		double preço_custo, desconto, novo_preço;
		String Tipo, refrig;
		
		System.out.println("preço:");
		preço = sc.nextDouble();
		System.out.println("tipo(a/l/v):");
		Tipo = sc.next();
		System.out.println("refrigeração? (n/s)");
		refrig = sc.next();
		
		if (refrig.equalsIgnoreCase("n")) {
			if (Tipo.equalsIgnoreCase("a")) {
				if (preço < 15) {
					valor_adicional = 2;
				} else {
					valor_adicional = 5;
				}
			}	
			if (Tipo.equalsIgnoreCase("i")) {
				if (preço < 10) {
					valor_adicional = 1.5;
				} else {
					valor_adicional = 2.5;
				}	
			}
			if (Tipo.equalsIgnoreCase("v")) {
				if (preço < 30) {
					valor_adicional = 3;
				} else {
					valor_adicional = 2.5;
				}
			}
		
		} else {
			if (Tipo.equalsIgnoreCase("a")) {
				valor_adicional = 8;
			}
			if (Tipo.equalsIgnoreCase("l")) {
				valor_adicional = 0;
			}
			if (Tipo.equalsIgnoreCase("v")) {
				valor_adicional = 0;
			}
		}
		
		System.out.println("valor adicional: " + valor_adicional);
		if (preço <25) {
			imposto = 5.0/100*preço;
		} else {
			imposto = 8.0/100*preço;
		}
		System.out.println("imposto: " + imposto);
		
		preço_custo = preço + imposto;
		System.out.println("preço de custo " + preço_custo);
		
		if ((!Tipo.equalsIgnoreCase("a"))&&(!refrig.equalsIgnoreCase("s"))) {
			desconto = 3.0/100*preço_custo;
		} else {
			desconto = 0;
		}
		System.out.println("desconto: " + desconto);

		novo_preço = preço_custo + valor_adicional - desconto;
		System.out.println("novo preço: " +novo_preço);
		if (novo_preço <= 50) {
			System.out.println(" barato ");
			
		} else if (novo_preço < 100) {
			System.out.println("normal");

		} else {
			System.out.println("caro");
		}


	}

}