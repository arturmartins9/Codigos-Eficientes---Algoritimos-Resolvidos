package aula45;

import javax.swing.JOptionPane;

/*
 * Um restaurante cobra R$ 12 reais por cada kilo de refei��o. Escreva
 * um algoritmo que leia o peso do prato pelo cliente(em quilos)
 * e imprima o valor a pagar. Assuma que a balan�a j� desconte o peso do prato.
 */
public class PrecoDaRefeicaPeso {

	public static void main(String[] args) {
		
		final double preco = 12.00;
		double peso = Double.parseDouble((
				JOptionPane.showInputDialog("Digite o peso do prato montado")));
		JOptionPane.showMessageDialog(null, String.format("O valor a pagar pelo prato � R$ %.2f", preco * peso));
		

	}

}
