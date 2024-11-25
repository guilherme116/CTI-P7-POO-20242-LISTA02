package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        double numero_op, peças_op, numero_maior = 0, cont_m = 0, cont_final = 0, total_peças = 0, cont, media_m = 0, salario_maior = 0, media_f = 0, salario_op = 0, tot_folha = 0;
        String sexo_op;

        for (cont = 0; cont < 15; cont++) {
            System.out.print("Insira o número referente ao operario: ");
            numero_op = sc.nextDouble();
            System.out.print("nós fale qual é o gênero do operário (m/f): ");
            sexo_op = sc.next();
            System.out.print("Insira a quantidade de peças que foram fabricadas pelo operário: ");
            peças_op = sc.nextDouble();

            if (peças_op <= 30) {
                salario_op = 450;
            } else if (peças_op > 30 && peças_op <= 50) {
                salario_op = 450 + ((peças_op - 30) * 3 / 100.0 * 450);
            } else if (peças_op > 50) {
                salario_op = 450 + ((peças_op - 30) * 5 / 100.0 * 450);
            }

           
            System.out.println("O operário de número " + numero_op + " recebe o salário: R$ " + salario_op);
          
            total_peças += peças_op;
            tot_folha += salario_op;
   
            if (sexo_op.equalsIgnoreCase("M")) {
                media_m += peças_op;
                cont_m++;
            } else {
                media_f += peças_op;
                cont_final++;
            }

          
            if (cont == 0 || salario_op > salario_maior) {
                salario_maior = salario_op;
                numero_maior = numero_op;
            }
        }
        System.out.println("o valor total da folha de pagamento: R$ " + tot_folha);
        System.out.println("o total de peças fabricadas no mês: " + total_peças);

       
        if (cont_m == 0) {
            System.out.println("não há nenhum homem.");
        } else {
            media_m /= cont_m;
            System.out.println("Média das peças fabricadas pelos homens: " + media_m);
        }


        if (cont_final == 0) {
            System.out.println("não nenhuma mulher mulher.");
        } else {
            media_f /= cont_final;
            System.out.println("Média de peças fabricadas pelas mulheres: " + media_f);
        }


        System.out.println("O número do operário com maior salário é: " + numero_maior + " (Salário: R$ " + salario_maior + ")");
		


        }
        

	}


