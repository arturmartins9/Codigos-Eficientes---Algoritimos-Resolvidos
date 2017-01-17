package aula42;

import javax.swing.JOptionPane;

/*
 * Uma padaria vende uma certa quantidade de p�es franceses e uma quantidade de broas a cada dia;
 * Cada p�ozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o dono que saber quanto
 * arrecadou com a venda dos p�es e broas (juntos), e quanto deve guardar numa conta de poupan�a
 * (10% do total arrecadado). Voc� foi contratado para fazer os c�lculos para o dono.
 * Com base nestes fatos, fa�a um algoritmo, para ler as quantidades de p�es e broas e depois
 * calcula os dados solicitados.
 */
public class CalculoVendaPaesEBroas {
	public static void main(String[] args) {
		int pao  = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de p�o"));
		int broa = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Broa"));
		
		float total = ( 0.12f * pao ) + (1.50f * broa);
		float poupanca = total - (total * 0.90f);
		
		System.out.printf("O tatal arrecadado R$%.2f , devendo ser guardado R$%.2f",total, poupanca);
	}
}
