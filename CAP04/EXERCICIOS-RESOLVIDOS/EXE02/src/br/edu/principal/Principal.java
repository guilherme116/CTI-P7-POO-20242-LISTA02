package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N1, N2, N3, Media, Nota_exame;
		
		System.out.println("Insira a primeira nota: ");
		N1 = sc.nextDouble();
		System.out.println("Insira a segunda nota: ");
		N2 = sc.nextDouble();
		System.out.println("Insira a terceira nota: ");
		N3 = sc.nextDouble();
		
		Media = (N1+N2+N3)/3;
		
		System.out.println("Média aritmética: "+Media);
		
		if(Media >= 0 & Media < 3) {
			System.out.println("Reprovado");
		} 
		else if(Media >=3 & Media<7) {
			System.out.println("Exame");
			Nota_exame = 12 - Media;
			System.out.println("Devera tirar uma nota "+Nota_exame+" para assim ser aprovado.");
		}
		else if(Media >=7 & Media<=10) {
			System.out.println("Aprovado");
		}
		else {
			System.out.println("Digite as notas que são válidas, entre 0 a 10.");}
		
	}


	}



