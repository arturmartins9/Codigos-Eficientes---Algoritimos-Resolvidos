package aula38;

import javax.swing.JOptionPane;

/*
 * O departamento que controla o �ndice de polui��o do meio ambiente
 * mant�m 3 grupos de industrias que s�o altamente poluentes do meio
 * ambiente. O �dice de polu��o aceit�vel caria de 0.05 ate 0,25.
 * Se o �ndice sobe para 0.3 as ind�strias do 1� grupo s�o intimadas
 * a supenderem as atividades, se o �ndice cresce para 0,4 as do 1� e 2�
 * grupo s�o intimadas a suspenderem duas atividades e se o indice atigir
 * 0,5 todos os 3 grupos devem ser notificadas a paralisarem
 * suas atividades. Escrever um algoritmo que l� o �ndice de polui��o m�dio
 * e emite a notifica��o aos diferentes grupos de empresas.
 * 
 * 
 */
public class Indice_poluicao_empresas {

	public static void main(String[] args) {
		
		double indicePoluicao = Double.parseDouble(JOptionPane.showInputDialog("Digite o �ndice da polui��o atual"));
		
		if(indicePoluicao > 0){
			if(indicePoluicao >=0.5){
				System.out.println("Todos os 3 grupos intimados a suspederem as atividades");
			}else if(indicePoluicao >= 0.4){
				System.out.println("O 1 e 2 grupo est�o intimados a suspenderem as atividades");
			}else if(indicePoluicao >= 0.3){
				System.out.println("O 1 grupo est� intimado a suspender suas atividades");
			}else{
				System.out.println("�ndice de polui��o aceitavel para todos os grupos");
			}
		}else{
			System.out.println("�ndice de polui��o inv�lido");
		}
		
		

	}

}
