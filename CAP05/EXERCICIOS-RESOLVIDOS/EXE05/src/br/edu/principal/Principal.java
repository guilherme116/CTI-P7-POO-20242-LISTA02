package br.edu.principal;
public class Principal {

	public static void main(String[] args) {
		double fim, X, expoente, numero, denominador, deno, fat, S;
        numero = 4;
        X = 2;
        S = 0;
        denominador = 0;
        deno = 1;
        for (int i = 1;i <= numero;i++) {
            fim = deno;
            fat = 1;
            for (int j = 1;j<=fim;j++) {
                fat *= j;
            }
            expoente = i + 1;
            if (expoente%2 == 0) {
                S = S - Math.pow(X,expoente)/fat;
            }
            else {
                S = S + Math.pow(X,expoente)/fat;
            }
            if (deno == 4) {
                denominador = -1;
            }
            if (deno == 1) {
                denominador = 1;
            }
            if (denominador == 1) {
                deno += 1;
            }
            else {
                deno -= 1;
            }
        }
        System.out.println(S);
    
        

	}

}
