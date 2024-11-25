package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double preco, imposto, transporte=0, seguro, fin, total_imposto=0, origem;
		char meio_t = ' ', carga = ' ';
		
		System.out.println("Preço (0 para encerrar) : ");
		preco = sc.nextDouble();
		while (preco>0) {
			System.out.println("País da orgem: ");
			System.out.println("1 - EUA | 2 - México | 3 - outros");
			origem = sc.nextDouble();
			System.out.println("Meio que se transportam: ");
			System.out.println("T - terrestre | F - fluvial | A - aéreo");
			meio_t = sc.next().charAt(0);
			System.out.println("Carga perigosa?: (s/n)");
			carga = sc.next().charAt(0);
			if (preco<=100) {
				imposto = preco *(5/100);
			}
			else {
				imposto = preco *(10/100);
			}
			if(carga == 'S') {
				if(origem == 1) {
					transporte = 50;
				}
				else if(origem == 2) {
					transporte = 21;
				}
				else if(origem == 3) {
					transporte = 24;
				}
			}
			if (carga == 'N') {
				if(origem == 1) {
					transporte = 12;
				}
				else if(origem ==2) {
					transporte = 21;
				}
				else if(origem == 3) {
					transporte = 60;
				}
			}
			if (origem == 2 | meio_t == 'A') {
				seguro = preco/2;
			}
			else {
				seguro = 0;
			}
			fin = preco + imposto + transporte + seguro;
			total_imposto = total_imposto + imposto;
			System.out.println("impostp: "+imposto);
			System.out.println("transporte : "+transporte);
			System.out.println("seguro: "+seguro);
			System.out.println("final: "+fin);
			System.out.println("preço (0 para encerrar): ");
			preco = sc.nextDouble();
			}
		System.out.println("Total de impostos: "+total_imposto);
		

	}


	}



