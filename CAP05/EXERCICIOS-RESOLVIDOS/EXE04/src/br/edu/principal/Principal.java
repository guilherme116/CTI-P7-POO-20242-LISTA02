package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int codigo, numero_veiculos, numero_acidentes;
	        int maior, cidade_maior, menor, cidade_menor;
	        int media_veiculo, soma_veiculo, media_acidente;
	        int soma_acidente, contagem_acidente;
	        soma_veiculo = 0;
	        soma_acidente = 0;
	        contagem_acidente = 0;
	        maior = 0;
	        menor = 0;
	        cidade_maior = 0;
	        cidade_menor = 0;
	        
	        for (int cont = 1; cont <= 5; cont ++) {
	            System.out.print("codigo da cidade: ");
	            codigo = sc.nextInt();
	            System.out.print("número de veiculos: ");
	            numero_veiculos = sc.nextInt();
	            System.out.print("número de acidentes: ");
	            numero_acidentes = sc.nextInt();
	            System.out.println();
	            if (cont == 1) {
	                maior = numero_acidentes;
	                cidade_maior = codigo;
	                menor = numero_acidentes;
	                cidade_menor = codigo;
	            }
	            else {
	                if (numero_acidentes > maior) {
	                    maior = numero_acidentes;
	                    cidade_maior = codigo;
	                }
	                else if (numero_acidentes < menor) {
	                    menor = numero_acidentes;
	                    cidade_menor = codigo;
	                }
	            }
	            soma_veiculo += numero_veiculos;
	            if (numero_veiculos < 2000) {
	                soma_acidente += numero_acidentes;
	                contagem_acidente += 1;
	            }
	        }
	        System.out.println("um maior número de acidentes: "+maior +"\ncodigo da cidade: "+cidade_maior);
	        System.out.println("um menor número de acidentes: "+menor +"\ncodigo da cidade: "+cidade_menor);
	        media_veiculo = soma_veiculo/5;
	        System.out.println("média dos veiculos: "+media_veiculo);
	        if (contagem_acidente == 0) {
	            System.out.println("não foi colocado e inserido nenhuma cidade que contenha menos de 200 veículos");
	        }
	        else {
	            media_acidente = soma_acidente/contagem_acidente;
	            System.out.println("média dos acidentes "+media_acidente);
	        }


	}

}
