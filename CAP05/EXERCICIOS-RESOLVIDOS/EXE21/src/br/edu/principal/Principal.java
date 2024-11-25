package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int numero, soma = 0, qtd = 0, maior = 0, menor = 0, somaPar = 0, qtdPar = 0, qtdImpar = 0;
	        double media, mediaPar, perc;

	        Scanner scanner = new Scanner(System.in);

	      
	        System.out.print("insira um número (30000 para o encerramento): ");
	        numero = scanner.nextInt();

	        
	        while (numero != 30000) {
	         
	            if (qtd == 0) {
	                maior = menor = numero;
	            } else {
	                if (numero > maior) maior = numero;
	                if (numero < menor) menor = numero;
	            }

	            soma += numero;
	            qtd++;

	            if (numero % 2 == 0) {
	                somaPar += numero;
	                qtdPar++;
	            } else {
	                qtdImpar++;
	            }

	            System.out.print("insira um número (30000 para o encerramento): ");
	            numero = scanner.nextInt();
	        }
	        if (qtd == 0) {
	            System.out.println("Nenhum número foi digitado.");
	        } else {
	            System.out.println("Soma desses dois números: " + soma);
	            System.out.println("Quantidade dos números: " + qtd);
	            media = (double) soma / qtd;
	            System.out.println("Média desses números: " + media);
	            System.out.println("Maior número: " + maior);
	            System.out.println("Menor número: " + menor);

	            if (qtdPar == 0) {
	                System.out.println("Nenhum número par.");
	            } else {
	                mediaPar = (double) somaPar / qtdPar;
	                System.out.println("Média dos números pares: " + mediaPar);
	            }

	            perc = ((double) qtdImpar / qtd) * 100;
	            System.out.println("Porcentagem de números ímpares: " + perc + "%");
	        }



	}

}

