package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N1, N2, N3;
		
		System.out.println("Insira o primeiro número: ");
		N1 = sc.nextDouble();
		System.out.println("Insira o segundo número: ");
		N2 = sc.nextDouble();
		System.out.println("Insira o terceiro número: ");
		N3 = sc.nextDouble();
		
		if (N1<N2 & N1<N3 & N2<N3) {
			System.out.println("a ordem crescente vai ser: "+N1+" - "+N2+" - "+N3);
		}
		else if(N1<N2 & N1<N3 & N3<N2) {
			System.out.println("a ordem crescente vai ser: "+N1+" - "+N3+" - "+N2);
			}
		else if(N2<N1 & N2<N3 & N1<N3) {
			System.out.println("a ordem crescente vai ser: "+N2+" - "+N1+" - "+N3);
		}
		else if(N2<N1 & N2<N3 & N3<N1) {
			System.out.println("a ordem crescente vai ser: "+N2+" - "+N3+" - "+N1);
		}
		else if(N3<N1 & N3<N2 & N1<N2) {
			System.out.println("a ordem crescente vai ser: "+N3+" - "+N1+" - "+N2);
		}
		else {
			System.out.println("a ordem crescente vai ser: "+N3+" - "+N2+" - "+N1);
		}


	}

}

