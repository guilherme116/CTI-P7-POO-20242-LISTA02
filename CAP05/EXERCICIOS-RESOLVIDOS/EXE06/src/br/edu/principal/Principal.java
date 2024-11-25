package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	        double codigo, nht, valor, salario_minimo, salario_inicial, auxilio, salario_final;
	        String turno, categoria;
	        salario_minimo = 450;
	        for (int cont = 1; cont <= 10; cont++) {
	            System.out.print("Codigo: ");
	            codigo = sc.nextDouble();
	            System.out.print("nht: ");
	            nht = sc.nextDouble();
	            System.out.print("Turno: ");
	            turno = sc.next();
	            System.out.print("Categoria: ");
	            categoria = sc.next();
	            while (turno.equalsIgnoreCase("m") & turno.equalsIgnoreCase("v") & turno.equalsIgnoreCase("n")) {
	            	System.out.print("turno: ");
	                turno = sc.next();
	            }
	            while (categoria.equalsIgnoreCase("g") & categoria.equalsIgnoreCase("O")) {
	            	System.out.print("categoria: ");
	                categoria = sc.next();
	            }
	            if (categoria == "g") {
	                if (turno == "n") {
	                    valor = salario_minimo * 18/100;
	                }
	                else {
	                    valor = salario_minimo * 15/100;
	                }
	            }
	            else {
	                if (turno == "n") {
	                    valor = salario_minimo * 13/100;
	                }
	                else {
	                    valor = salario_minimo *10/100;
	                }
	            }
	            salario_inicial = nht * valor;
	            if (salario_inicial <= 300) {
	                auxilio = salario_inicial * 20/100;
	            }
	            else {
	                if (salario_inicial < 600) {
	                    auxilio = salario_inicial * 15/100;
	                }
	                else {
	                    auxilio = salario_inicial * 5/100;
	                }
	            }
	          
	            salario_final = salario_inicial + auxilio;
	            System.out.println("Codigo: "+codigo);
	            System.out.println("nht: "+nht);
	            System.out.println("Valor: "+valor);
	            System.out.println("Salário inicial: "+salario_inicial);
	            System.out.println("Auxilios: "+auxilio);
	            System.out.println("Salário final: "+salario_final);
	        }
 

	}

}
