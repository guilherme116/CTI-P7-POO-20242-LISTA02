package br.edu.principal;
public class Principal {

	public static void main(String[] args) {
		double cont_time, cont_jog, idade;
        double peso, altura, qtde, media_idade, media_altura, porc, tot80;
        qtde = 0;
        tot80 = 0;
        media_altura = 0;
        for (cont_time = 1;cont_time<= 5; cont_time ++) {
            media_idade = 0;
            for (cont_jog = 1;cont_jog<= 11;cont_jog ++) {
                idade = 17;
                peso = cont_jog*cont_time + 50;
                altura = (160 + 4 * cont_jog)/100;
                if (idade<18) {
                    qtde += 1;
                    media_idade += idade;
                    media_altura += altura;
                }
                if (peso > 80) {
                    tot80 += 1;
                }
                
            }
            media_idade = media_idade/11;
            System.out.println("média de idade: "+media_idade);
        }
        System.out.println("qtde: "+qtde);
        media_altura = media_altura/55;
        System.out.println("Média altura: "+media_altura);
        porc = tot80 * 100/55;
        System.out.println("Porc: "+porc);
	
        }
        

	}


