package aula71;

import javax.swing.JOptionPane;

/*
 * C�digos Eficientes
 * Algoritmos Resolvidos [ Matem�tica ] - Sal�rio e contas atrasadas
 * https://www.youtube.com/watch?v=IgWWGiZ_IW8
 * 
 * Marcos recebeu seu sal�rio de R$ 1200,00 e precisa pagar duas contas
 * c1 = R$ 200,00 e c2 = R$ 120,00) que est�o atrasadas. Como as contas est�o
 * atrasadas, Marcos ter� de pagar multa de 2% sobre cada conta.
 * Fa�a um algoritmo que calcule e mostre quanto restar� do sal�rio do Marcos.
 * 
 */
public class SalarioeContas {

	public static void main(String[] args) {
		
		double total = 1200 - ( (200 +(200 * 0.02)) + (120 + (120 * 0.02)) ); 
		JOptionPane.showMessageDialog(null, String.format("Do sal�rio de Marcos restar� R$%.2f", total));
		

	}

}
