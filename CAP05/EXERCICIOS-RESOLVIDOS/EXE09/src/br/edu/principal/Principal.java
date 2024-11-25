package br.edu.principal;
public class Principal {

	public static void main(String[] args) {
		 double cont, N1, N2, Media, t_alunos, t_exame, t_reprovados;
	        double media_class, total_class;
	        total_class = 0;
	        t_alunos = 0;
	        t_exame = 0;
	        t_reprovados = 0;
	        for (cont=1;cont<=6;cont ++) {
	            N1 = 4 + cont;
	            N2 = 2 + cont;
	            Media = (N1+N2)/2;
	            System.out.print("média: "+Media+" - ");
	            if (Media<=3) {
	                t_reprovados += 1;
	                System.out.print("Reprovado\n");
	            }
	            else if (Media>3 & Media<7) {
	                t_exame	 += 1;
	                System.out.print("Exame\n");
	            }
	            else if (Media >= 7) {
	                t_alunos += 1;
	                System.out.print("Aprovado\n");
	            }
	            total_class += Media;
	        }
	        System.out.println("t_reprovados: "+t_reprovados);
	        System.out.println("t_exame: "+t_exame);
	        System.out.println("t_alunos: "+t_alunos);
	        media_class = total_class/6;
	        System.out.println("média da classe: "+media_class);

		


        }
        

	}


