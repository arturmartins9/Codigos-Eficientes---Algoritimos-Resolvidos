package aula68;

import javax.swing.JOptionPane;

/*
 * C�digo Eficientes
 * Algoritmos Resolvidos [ Matem�tica ] - C�lculo da �rea do losango
 * https://www.youtube.com/watch?v=9X_O71V0osQ
 * 
 * Fa�a um algoritmo que calcule e mostre a �rea de um losango.
 * Sabe-se que: A = (DiagonalMaior * DiagonanalMenor) / 2
 * 
 */
public class AreaLosango {
	public static void main(String[] args) {
		
		double dMaior = Double.parseDouble(
				JOptionPane.showInputDialog("Digite o valor da diagonal Maior do losango"));
		double dMenor = Double.parseDouble(
				JOptionPane.showInputDialog("Digite o valor da diagonal Menor do losango"));
		
		double area = (dMaior * dMenor) /2;
		
		JOptionPane.showMessageDialog(null, 
				String.format("A �rea do losando � %.2f", area));
	}
}
