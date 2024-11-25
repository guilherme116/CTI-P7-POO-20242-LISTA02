package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		double N1, N2, N3, média;
		System.out.println("Insira a nota do laboratório: ");
		N1 = sc.nextDouble();
		System.out.println("Insira a nota da Avaliação Semestral: ");
		N2 = sc.nextDouble();
		System.out.println("Insira a nota do Exame Final: ");
		N3 = sc.nextDouble();
		
		média =(N1*2+N2*3+N3*5)/10;
		
		System.out.println("Média ponderada: "+média);
		
		if (média >= 8 & média <=10) {
			System.out.println("conceito A");
		} 
		else if(média >= 7 & média <8) {
			System.out.println("conceito B");
		}  
		else if(média >= 6 & média <7) {
			System.out.println("conceito C");
		}  
		else if(média >= 5 & média <6) {
			System.out.println("conceito D");
		}  
		else if (média >= 0 & média <5) {
			System.out.println("conceito E");
		} 
		else {
			System.out.println("insira as notas que são válidas, entre 0 a 10.");


	}

}

}
