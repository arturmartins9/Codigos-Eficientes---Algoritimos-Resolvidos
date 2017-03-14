package aula62;

import javax.swing.JOptionPane;

/*
 * C�digos Eficientes
 * Algoritmos Resolvidos [ Matem�tica ] - Partes de �gua e suco para refresco
 * https://www.youtube.com/watch?v=7nDd2keHBi4
 * 
 * Um tonel de refresco � feito com 8 partes de �gua e 2 partes de suco de maracuj�.
 * Fa�a um algoritmo para calcular quantos litros de �gua e de suco s�o necess�rios
 * para se fazer X litros de refresco (informados pelo usu�rio)
 * 
 */
public class PartesAguaSucoPRefresco {

	public static void main(String[] args) {
		
		double litros = Double.parseDouble(
				JOptionPane.showInputDialog("Digite quantos litros de refresco ser�o feitos")) ;
		
		
		double partes = litros / 10;
		
		double agua = partes * 8 ;
		double suco = partes * 2;
		
		JOptionPane.showMessageDialog(null, String.format("Ser�o necess�rios %.2f litros de agua e \n "
														+ "%.2f litros de suco para fazer \n"
														+ "%.2f litros de refresco.", agua, suco, agua + suco));
		

	}

}
