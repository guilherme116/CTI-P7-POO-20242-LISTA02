package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double Salário_minimo, nht, ndep, nhet;
		double Salário_receber, vh, smes, vdep, vhe, Imposto = 0;
		double Salário_bruto, sliq, gratificação = 0;
		
		System.out.println("Digite o sálario minimo");
		Salário_minimo = sc.nextDouble();
		System.out.println("Digite o número de horas trabalhadas");
		nht = sc.nextDouble();
		System.out.println("Digite o número de dependentes");
		ndep = sc.nextDouble();
		System.out.println("Digite o número de horas extras que foram trabalhadas");
		nhet = sc.nextDouble();
		
		vh = 1/5 * Salário_minimo;
		smes = nht*vh;
		vdep = 32*ndep;
		vhe = nhet*(vh + (vh*50/100));
		Salário_bruto = smes + vdep + vhe;
		if (Salário_bruto < 200) {
			Imposto = 0;
		}
		if (Salário_bruto >= 200 && Salário_bruto <= 500) {
			Imposto = Salário_bruto*10/100;
			
		}
		if (Salário_bruto > 500) {
			Imposto = Salário_bruto *20/100;
		}
		
		sliq = Salário_bruto - Imposto;
		if (sliq <= 350) {
			gratificação = 100;
		}
		if (sliq > 350) {
			gratificação = 50;
		}
		Salário_receber = sliq + gratificação;
		System.out.println("o salário que vai ser recebido será " + Salário_receber);

	}

}