package aula67;

import javax.swing.JOptionPane;

/*
 * C�digos Eficientes
 * Algoritmos Resolvidos [ Matem�tica ] - C�lculo da �rea do trap�zio
 * https://www.youtube.com/watch?v=SbNRtJqlc1g
 * 
 * Fa�a um algoritmo que calcule a �rea de um trap�zio.
 * Sabe-se que: A = ((base maior + base menor) * altura ) / 2;
 * 
 * 
 */
public class AreaTrapezio {

	public static void main(String[] args) {
		
		double baseMaior = Double.parseDouble(
				JOptionPane.showInputDialog("Digite a base maior do trap�zio"));
		double baseMenor = Double.parseDouble(
				JOptionPane.showInputDialog("Digite a base menor do trap�zio"));
		double altura = Double.parseDouble(
				JOptionPane.showInputDialog("Digite a base Altura do trap�zio"));
		
		double area = ((baseMaior + baseMenor)*altura) / 2;
		
		JOptionPane.showMessageDialog(null, String.format(
				"A �rea do trap�zio � de %.2f", area));

	}

}
