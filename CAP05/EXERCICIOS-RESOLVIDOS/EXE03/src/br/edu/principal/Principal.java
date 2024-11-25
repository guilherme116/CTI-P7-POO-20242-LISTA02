package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fat;
        int N, Numero;
        System.out.print("n: ");
        N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.print("Num"+i+": ");
            Numero = sc.nextInt();
            fat = 1;
            for (int j = 1; j <= Numero; j++) {
                fat = fat * j;
            }
            System.out.println(fat);
        }
        

	}

}
