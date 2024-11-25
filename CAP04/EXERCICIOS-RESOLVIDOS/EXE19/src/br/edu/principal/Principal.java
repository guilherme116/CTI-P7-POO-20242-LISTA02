package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double Altura, Peso;
		
		System.out.println("Digite a altura");
		Altura = sc.nextDouble();
		System.out.println("Digite o peso");
		Peso = sc.nextDouble();
		
		if (Altura <1.20) {
			if (Peso<=60) {
				System.out.println("A");
			}
			if (Peso > 60 && Peso<=90) {
				System.out.println("D");
			}
			if (Peso>90) {
				System.out.println("G");
			}
		}
		if (Altura >=1.20 && Altura <= 1.70) {
			if (Peso<=60) {
				System.out.println("B");
			}
			if (Peso > 60 && Peso<=90) {
				System.out.println("E");
			}
			if (Peso>90) {
				System.out.println("H");
			}
		}
		if (Altura > 1.70) {
			if (Peso<=60) {
				System.out.println("C");
			}
			if (Peso > 60 && Peso<=90) {
				System.out.println("F");
			}
			if (Peso>90) {
				System.out.println("I");
			}
			
		}

	}

}