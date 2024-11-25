package br.edu.principal;
public class Principal {

	public static void main(String[] args) {
		  int I, num_termos, N1, N2, N3;
	        num_termos = 17;
	        N1 = 2;
	        N2 = 7;
	        N3 = 3;
	        System.out.print(N1+" ");
	        System.out.print(N2+" ");
	        System.out.print(N3+" ");
	        I = 4;
	        while (I!=num_termos) {
	            N1 *= 2;
	            System.out.print(N1+" ");
	            I ++;
	            if (I!=num_termos) {
	                N2 *= 3;
	                System.out.print(N2+" ");
	                I ++;
	                if (I!=num_termos) {
	                    N3 *= 4;
	                    System.out.print(N3+" ");
	                    I ++;
	                }
	            }


        }
        

	}

}
