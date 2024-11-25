package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        String sexo;    
	        double i, numero_crianca, meses, porc_final, porc_meses, tot_final = 0, tot_meses = 0, total_24 = 0, porc_24;

	        System.out.println("Insira o numero de crianças que foram nascidas nesse periodo: ");
	        numero_crianca = sc.nextDouble();

	        if (numero_crianca == 0) {
	            System.out.println("Nenhuma criança apareceu digitada.");
	          
	        }
	        for (i = 1; i <= numero_crianca; i++) {
	            System.out.print("insira o sexo da " + i + "° Criança: ");
	            sexo = sc.next();
	            System.out.print("insira o tempo de vida (em meses) da " + i + "° Criança: ");
	            meses = sc.nextDouble();

	    
	            if (sexo.equalsIgnoreCase("M")) {
	                tot_meses++;
	            }
	            if (sexo.equalsIgnoreCase("F")) {
	                tot_final++;
	            }

	            if (meses <= 24) {
	                total_24++;
	            }
	        }


	        porc_meses = (tot_meses * 100) / numero_crianca;
	        porc_final = (tot_final * 100) / numero_crianca;
	        porc_24 = (total_24 * 100) / numero_crianca;

	 
	        System.out.println("Percentual de crianças do sexo feminino mortas: " + porc_final + "%");
	        System.out.println("Percentual de crianças do sexo masculino mortas: " + porc_meses + "%");
	        System.out.println("Percentual de crianças com 24 meses ou menos mortas no período: " + porc_24 + "%");

	


	}

}
