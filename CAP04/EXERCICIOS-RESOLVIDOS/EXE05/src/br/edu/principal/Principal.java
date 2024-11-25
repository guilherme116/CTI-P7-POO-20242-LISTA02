package br.edu.principal;
import java.util.Scanner; 
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N1, N2, N3, N4;
		System.out.println("Insira os três primeiros números em uma ordem crescente");
		System.out.println("Insira o primeiro número: ");
		N1 = sc.nextDouble();
		System.out.println("Insira o segundo número: ");
		N2 = sc.nextDouble();
		System.out.println("Insira o terceiro número: ");
		N3 = sc.nextDouble();
		
		if (!(N1<N2 & N1<N3 & N2<N3)) {
			System.out.println("ERROR: Os números não estão em ordem crescente ");
			return;
		}
		System.out.println("Insira o quarto número (que está fora da ordem): ");
		N4 = sc.nextDouble();
		
		if(N4>N3) {
			System.out.println("a ordem decrescente vai ser: "+N4+" - "+N3+" - "+N2+" - "+N1);
			}
		else if(N4>N2 & N4<N3) {
			System.out.println("a ordem decrescente vai ser: "+N3+" - "+N4+" - "+N2+" - "+N1);
		}
		else if(N4>N1 & N4<N2) {
			System.out.println("a ordem decrescente vai ser: "+N3+" - "+N2+" - "+N4+" - "+N1);
		}
		else {
			System.out.println("a ordem decrescente vai ser: "+N3+" - "+N2+" - "+N1+" - "+N4);
		}
		

	}

}


