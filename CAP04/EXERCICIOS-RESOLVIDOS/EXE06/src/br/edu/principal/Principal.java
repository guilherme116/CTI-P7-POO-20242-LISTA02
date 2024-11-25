package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("insira um número: ");
		int n1 = sc.nextInt();
		
		if(n1 % 2 == 0){
			System.out.println("o número "+n1+" será par ");
		}
		else {
			System.out.println("o número "+n1+" será ímpar ");
		}


	}