package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o dia (DD): ");
        int dia = scanner.nextInt();

        System.out.println("Insira o mês (MM): ");
        int mes = scanner.nextInt();

        System.out.println("Insira o ano (AAAA): ");
        int ano = scanner.nextInt();

       
        System.out.print("Data Atual: " + dia + "/" + mes + "/" + ano + " – ");

        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Mês inválido");
                return; 
        }

        System.out.println("Insira a hora (HH): ");
        int hora = scanner.nextInt();

        System.out.println("Insira o minuto (MM): ");
        int minuto = scanner.nextInt();

        System.out.println("Hora Atual: " + hora + ":" + (minuto < 10 ? "0" + minuto : minuto));

    }
}