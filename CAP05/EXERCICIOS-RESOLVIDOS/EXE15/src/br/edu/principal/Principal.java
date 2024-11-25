package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        double i, preco = 0, custo_est = 0, imposto, preco_final, adicional, maior_p = 0, menor_p = 0, tot_imposto = 0, qtd_b = 0, qtd_n = 0, qtd_c = 0;
	        String refri = null, categoria = null;
	        
	        adicional = 0;

	      
	        for (i = 1; i <= 12; i++) {
	            System.out.println("Insira o preço: ");
	            preco = sc.nextDouble();
	            System.out.println("Insira e diga o tipo de refrigerante (S ou N): ");
	            refri = sc.next();
	            System.out.println("Insira a categoria escolhida (A, L, V): ");
	            categoria = sc.next();

	            
	            if (preco <= 20) {
	                if (categoria.equalsIgnoreCase("A")) {
	                    custo_est = 2;    
	                } else if (categoria.equalsIgnoreCase("L")) {
	                    custo_est = 3;                    
	                } else if (categoria.equalsIgnoreCase("V")) {
	                    custo_est = 4;
	                }                
	            }
	            if (preco > 20 && preco <= 50) {
	                if (refri.equalsIgnoreCase("S")) {
	                    custo_est = 6;                    
	                }
	            } else {
	                custo_est = 0;    
	            }
	            if (preco > 50) {
	                if (refri.equalsIgnoreCase("S")) {
	                    if (categoria.equalsIgnoreCase("A")) {
	                        custo_est = 5;
	                    } else if (categoria.equalsIgnoreCase("L")) {
	                        custo_est = 2;                        
	                    } else if (categoria.equalsIgnoreCase("V")) {
	                        custo_est = 4;
	                    }
	                }                
	            } else {
	                if (categoria.equalsIgnoreCase("A") || categoria.equalsIgnoreCase("V")) {
	                    custo_est = 0;
	                } else if (categoria.equalsIgnoreCase("L")) {
	                    custo_est = 1;                    
	                }
	            }

	          
	            if (!categoria.equalsIgnoreCase("A") && !refri.equalsIgnoreCase("S")) {
	                imposto = preco * 2 / 100;
	            } else {
	                imposto = preco * 4 / 100;            
	            }

	            
	            preco_final = preco + custo_est + imposto;

	        
	            System.out.println("Custo que está Estimado: " + custo_est);
	            System.out.println("Imposto: " + imposto);
	            System.out.println("Preço Final: " + preco_final);

	       
	            if (preco_final <= 20) {
	                qtd_b += 1;            
	            }
	            if (preco_final > 20 && preco_final <= 100) {
	                qtd_n += 1;
	                System.out.println("Classificado como Normal");
	            }
	            if (preco_final > 100) {
	                qtd_c += 1;
	                System.out.println("Classificado como Caro");
	            }

	         
	            adicional += custo_est + imposto;
	            tot_imposto += imposto;

	        
	            if (i == 1) {
	                maior_p = preco_final;
	                menor_p = preco_final;
	            } else {
	                if (preco_final > maior_p) {
	                    maior_p = preco_final;
	                }
	                if (preco_final < menor_p) {
	                    menor_p = preco_final;
	                }
	            }
	        }

	        adicional = adicional / 12;
	        System.out.println("Média de Adicional: " + adicional);
	        System.out.println("Maior Preço: " + maior_p);
	        System.out.println("Menor Preço: " + menor_p);
	        System.out.println("Total de Impostos: " + tot_imposto);
	        System.out.println("Quantidade de Produtos Baratos: " + qtd_b);
	        System.out.println("Quantidade de Produtos Normais: " + qtd_n);
	        System.out.println("Quantidade de Produtos Caros: " + qtd_c);

        }
        

	}


