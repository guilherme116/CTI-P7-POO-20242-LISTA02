package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Hora_i, Minuto_i, Hora_f, Minuto_f, Hora_d, Minuto_d;
		System.out.println("Insira o horário de inicio");
		System.out.println("hora:");
		Hora_i = sc.nextInt();
		System.out.println("minuto:");
		Minuto_i = sc.nextInt();
		System.out.println("Insira o horário de fim");
		System.out.println("hora:");
		Hora_f = sc.nextInt();
		System.out.println("Minuto:");
		Minuto_f = sc.nextInt();
		
		if(Minuto_i>Minuto_f) {
			Minuto_f = Minuto_f+60;
			Hora_f = Hora_f-1;
		}
		else if(Hora_i>Hora_f) {
			Hora_f = Hora_f+24;
		}
		Minuto_d = Minuto_f-Minuto_i;
		
		Hora_d = Hora_f-Hora_i;
		System.out.println("O jogo teve uma duração "+Hora_d+" hora(s) e "+Minuto_d+" minuto(s)");
		}

	}