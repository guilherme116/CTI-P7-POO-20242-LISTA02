package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        int D1, M1, A1, D2, M2, A2;

	        System.out.println("Insira a primeira data");
	        System.out.print("dia (dd): ");
	        D1 = scanner.nextInt();
	        System.out.print("mês (mm): ");
	        M1 = scanner.nextInt();
	        System.out.print("ano (aaaa): ");
	        A1 = scanner.nextInt();

	        System.out.println("Insira a segunda data");
	        System.out.print("dia (dd): ");
	        D2 = scanner.nextInt();
	        System.out.print("mês (mm): ");
	        M2 = scanner.nextInt();
	        System.out.print("ano (aaaa): ");
	        A2 = scanner.nextInt();

	        if (A1 > A2) {
	            System.out.println("A maior data será: " + D1 + "-" + M1 + "-" + A1);
	        } else if (A2 > A1) {
	            System.out.println("A maior data será: " + D2 + "-" + M2 + "-" + A2);
	        } else if (M1 > M2) {
	            System.out.println("A maior data será: " + D1 + "-" + M1 + "-" + A1);
	        } else if (M2 > M1) {
	            System.out.println("A maior data será: " + D2 + "-" + M2 + "-" + A2);
	        } else if (D1 > D2) {
	            System.out.println("A maior data será: " + D1 + "-" + M1 + "-" + A1);
	        } else if (D2 > D1) {
	            System.out.println("A maior data será: " + D2 + "-" + M2 + "-" + A2);
	        } else {
	            System.out.println("As datas estão iguais!");
	        }

	    }

	}