package br.edu.principal;
public class Principal {

	public static void main(String[] args) {
		   int contador, N1, N2, res;
	        N1 = 0;
	        N2 = 1;
	        System.out.print(N1+" ");
	        System.out.print(N2+" ");
	        for (contador=3;contador<=8;contador++) {
	            res = N1+N2;
	            System.out.print(res+ " ");
	            N1 = N2;
	            N2 = res;

        }
        

	}

}
