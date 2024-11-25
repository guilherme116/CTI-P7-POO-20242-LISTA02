package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		System.out.println("Insira um valor referente para a: ");
		a = sc.nextDouble();
		System.out.println("Insira um valor referente para b: ");
		b = sc.nextDouble();
		System.out.println("Insira um valor referente para C: ");
		c = sc.nextDouble();
		System.out.println("Insira um valor referente para i (1, 2 ou 3): ");
		int i = sc.nextInt();
		
		if (i==1) {
			if (a<b & a<c & b<c) {
				System.out.println("a ordem crescente será : "+a+" - "+b+" - "+c);
			}
			else if(a<b & a<c & c<b) {
				System.out.println("a ordem crescente será: "+a+" - "+c+" - "+b);
				}
			else if(b<a & b<c & a<c) {
				System.out.println("a ordem crescente será: "+b+" - "+a+" - "+b);
			}
			else if(b<a & b<c & c<a) {
				System.out.println("a ordem crescente será: "+b+" - "+c+" - "+a);
			}
			else if(c<a & c<b & a<b) {
				System.out.println("a ordem crescente será: "+c+" - "+a+" - "+b);
			}
			else {
				System.out.println("a ordem crescente será: "+c+" - "+b+" - "+a);
			}
		}
		else if(i==2) {
			if (a>b & a>c & b>c) {
				System.out.println("a ordem decrescente será: "+a+" - "+b+" - "+c);
			}
			else if(a>b & a>c & c>b) {
				System.out.println("a ordem decrescente será: "+a+" - "+c+" - "+b);
				}
			else if(b>a & b>c & a>c) {
				System.out.println("a ordem decrescente será: "+b+" - "+a+" - "+b);
			}
			else if(b>a & b>c & c>a) {
				System.out.println("a ordem decrescente será: "+b+" - "+c+" - "+a);
			}
			else if(c>a & c>b & a>b) {
				System.out.println("a ordem decrescente será: "+c+" - "+a+" - "+b);
			}
			else {
				System.out.println("a ordem decrescente será: "+c+" - "+b+" - "+a);
			}
		}
		else if(i==3) {
			if(a>b & a>c) {
				System.out.println("a ordem que foi desejada será: "+b+" - "+a+" - "+c);
			}
			else if(b>a & b>c) {
				System.out.println("a ordem que foi desejada será : "+a+" - "+b+" - "+c);
				}
			else if(c>a & c>b) {
				System.out.println("a ordem que foi desejada será: "+a+" - "+c+" - "+b);}
		}
		else {
			System.out.println("Opção inválida, tente mais uma vez (1, 2 e 3)!!");
		}
	}



	}
