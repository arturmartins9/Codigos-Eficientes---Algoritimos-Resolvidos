package aula55;

import javax.swing.JOptionPane;

/*
 * C�digos Eficientes
 * https://www.youtube.com/watch?v=3FunaX8mBL0
 * 
 * Quest�o:
 * A lanchonete Kilanche vende apenas um tipo de sandu�che, cujo o recherio inclui duas fatias de 
 * queijo, uma fatia de preseunto e uma rodela de hamb�rgue.
 * Sabendo que cada fatia de queijo ou preseunto pesa 50 gramas, e que a rodela de hamb�gue pesa 100 gramas,
 * fa�a um algoritmo em que o dono forne�a a quantidade de sandu�ches a fazer, e a maquina
 * informe as quantidades (em quilos) de queijo e presunto e carne necess�rios
 * para compra.
 * 
 * 
 */
public class QuilosDeTrios {

	public static void main(String[] args) {

		int quantidade = Integer.parseInt( JOptionPane.showInputDialog("Digite a quantidade de sanduiches a fazer"));
		double queijo    = quantidade * (0.050 * 2);
		double presunto  = quantidade * 0.050;
		double hamburger = quantidade * 0.100;
		
		JOptionPane.showMessageDialog(null, String.format("Ser�o necess�rios \n"
														+ "%.3f Kg de queijo \n"
														+ "%.3f Kg de presunto \n"
														+ "%.3f Kg de hamburger	", queijo,presunto,hamburger));

	}

}
