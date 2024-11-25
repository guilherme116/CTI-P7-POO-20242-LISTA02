package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		double codigo_est, codigo_carga, peso_em_toneladas;
		double peso_em_quilos, preço_carga = 0, imposto =1, valor_total;
		
		do {
			  System.out.println("Digite o código do estado (que esteja entre 1 e 5)");
			  codigo_est = sc.nextDouble();
			}
			while (codigo_est > 5 || codigo_est < 1);
		System.out.println("Digite o peso da carga em toneladas");
		peso_em_toneladas = sc.nextDouble();
		do {
			  System.out.println("Digite o código da carga (que esteja entre 1 e 40)");
			  codigo_carga = sc.nextDouble();
			}
			while (codigo_carga > 40 || codigo_carga < 1);
		
		peso_em_quilos = peso_em_toneladas*1000;
		System.out.println("O peso em quilo será " + peso_em_quilos);
		
		if (codigo_carga >= 10 && codigo_carga <=20) {
			preço_carga = 100*peso_em_quilos;
		}
		if (codigo_carga >= 21 && codigo_carga <=30) {
			preço_carga = 250*peso_em_quilos;
		}
		if (codigo_carga >= 31 && codigo_carga <=40) {
			preço_carga = 340*peso_em_quilos;
		}
		System.out.println("O preço da carga vai ser " + preço_carga);
		
		if (codigo_est == 1) {
			imposto = 35.0/100.0*preço_carga;
		}
		if (codigo_est == 2) {
			imposto = 25.0/100.0*preço_carga;
		}
		if (codigo_est == 3) {
			imposto = 15.0/100.0*preço_carga;
		}
		if (codigo_est == 4) {
			imposto = 5.0/100.0*preço_carga;
		}
		if (codigo_est == 5) {
			imposto = 0;
		}
		System.out.println("O imposto vai ser " + imposto);
		
		valor_total = preço_carga+imposto;
		System.out.println("O valor total vai ser " + valor_total);

	}

}