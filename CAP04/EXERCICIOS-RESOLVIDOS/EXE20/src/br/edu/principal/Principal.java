package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cod_prod, peso_quilos;
		double cod_pais, peso_gramas, pre_total;
		double imposto = 0, valor_total, pre_grama = 0;
		
		do {
			  System.out.println("Digite o código do produto (que esteja entre 1 e 10)");
			  cod_prod = sc.nextDouble();
			}
			while (cod_prod > 10 || cod_prod < 1);
		
		System.out.println("Digite o preço em quilo dos produtos");
		peso_quilos = sc.nextDouble();
		do {
			System.out.println("Digite o código do país original (que esteja entre 1 e 3)");
			cod_pais = sc.nextDouble();
			}
			while (cod_pais > 3 || cod_pais < 1);
		
		peso_gramas = peso_quilos*1000;
		System.out.println("Pesao em gramas será" + peso_gramas);
		if (cod_prod >=1 && cod_prod <= 4) {
			pre_grama = 10;
		}
		if (cod_prod >=5 && cod_prod <= 7) {
			pre_grama = 25;
		}
		if (cod_prod >=8 && cod_prod <= 10) {
			pre_grama = 35;
		}
		pre_total = peso_gramas * pre_grama;
		
		System.out.println("Preço total será " + pre_total);
		if (cod_pais == 1) {
			imposto = 0;
		}
		if (cod_pais == 2) {
			imposto = pre_total*15/100;
		}
		if (cod_pais == 3) {
			imposto = pre_total*25/100;
		}
		System.out.println("Imposto vai ser " + imposto);
		valor_total = pre_total+imposto;
		System.out.println("Valor tolalizado vai ser " + valor_total);

	}

}