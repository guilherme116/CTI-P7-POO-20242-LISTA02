package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double Base=0, Altura=0, Àrea=0;
		while(Base<=0) {
			System.out.println("insira e diga a base: ");
			Base = sc.nextDouble();		
			
		}
		while(Altura<=0) {
			System.out.println("insira e digite a altura: ");
			Altura = sc.nextDouble();
			
		}
	
		Àrea = Base * Altura/2;
		System.out.println("A área total seria: "+ Àrea);


	}

}
