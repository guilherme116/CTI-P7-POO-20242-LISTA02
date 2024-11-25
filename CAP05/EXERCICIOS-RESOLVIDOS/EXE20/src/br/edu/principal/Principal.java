package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double codigo, numero_h, salario_b, salario_l = 0, media_m = 0, media_f = 0, cont_m, cont_f;
		String sexo;
		System.out.println("insira o código: ");
		codigo = sc.nextDouble();
		cont_m = 0;
		cont_f = 0;
		while(codigo != 99999999) {
			System.out.println("insira o sexo: ");
			sexo = sc.next();
			System.out.println("insira o numero das horas");
			numero_h = sc.nextDouble();
			salario_b = numero_h * 30;
			if(sexo.equalsIgnoreCase("M")) {
				salario_l = salario_b - (salario_b * 10 / 100);
				media_m = media_m + salario_l;
				cont_m = cont_m + 1;
			}
			else if(sexo.equalsIgnoreCase("F")) {
				salario_l = salario_b - (salario_b * 5 / 100);
				media_f = media_f + salario_l;
				cont_f = cont_f + 1;
				
			}
			System.out.println("O código vai ser: " + codigo);
			System.out.println("O salário bruto é: "+ salario_b);
			System.out.println("o salario liquido vai ser: "+ salario_l);
			
		}
		if (cont_m == 0) {
			System.out.println("Nenhum professor do sexo masculino");
			
		}
		else {
			media_m = media_m / cont_m;
			System.out.println(media_m);
		}
		if (cont_f == 0) {
			System.out.println("Nenhum professor do sexo feminino");
		}
		else {
			media_f = media_f / cont_f;
			System.out.println(media_f);
			
		}



	}

}

