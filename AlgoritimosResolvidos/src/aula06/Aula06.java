package aula06;

import javax.swing.JOptionPane;

public class Aula06 {
	/*
	 * construir um algoritimo que calcule a m�dia aritimetica de v�rios valores
	 * interiors positivos, lidos externamente. o final da leitura acontecer�
	 * quando for lido um valor negativo
	 */
	public static void main(String[] args) {
		double valor = 0;
		double media = 0;
		int cont = 0;
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor. Para sair digite '-1'"));
		
		while(valor >= 0){
			media += valor;
			valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor. Para sair digite '-1'"));
			cont++;
		}
		JOptionPane.showMessageDialog(null, "A m�dia dos valores lidos � :" + (media/cont));
	}

}
