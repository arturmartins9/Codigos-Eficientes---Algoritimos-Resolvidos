package aula64;

import javax.swing.JOptionPane;

/*
 * C�digos Eficientes
 * Algoritmos Resolvidos [ Matem�tica ] - Sal�rio de funcion�rio e comiss�o
 * https://www.youtube.com/watch?v=uDVaKbPgnAk
 * 
 * Um funcion�rio recebe um sal�rio fixo mais 4% de comiss�o sobre as vendas. Fa�a um
 * algoritmo que receba o sal�rio fixo de um funcion�rio e o valor de suas vendas,
 * calcule e mostre a comiss�o e o sal�rio final do funcion�rio.
 * 
 * 
 */
public class SalaarioEComissao {

	public static void main(String[] args) {
		
		double salario = Double.parseDouble(
				JOptionPane.showInputDialog("Digite o sal�rio do funcion�rio"));
		double vendas = Double.parseDouble(
				JOptionPane.showInputDialog("Digite o valor de suas vendas"));
		
		double comissao = vendas * 0.04;
		
		JOptionPane.showMessageDialog(null, 
				String.format("A comiss�o do funcionario � de R$%.2f"
							+ "\n seu sal�rio final � R$%.2f", comissao, salario+comissao));

	}

}
