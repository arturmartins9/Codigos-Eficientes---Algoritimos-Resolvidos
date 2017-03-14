package aula63;

import javax.swing.JOptionPane;

/*
 * C�dogos eficientes
 * Algoritmos Resolvidos [ Matem�tica ] - Volume de caixa d'�gua
 * https://www.youtube.com/watch?v=ts1aWhklzkA
 * 
 * Calcule o volume de uma caixa d'�gua cilindrica.
 * 
 * 
 */
public class VolumeCaidaDagua {

	public static void main(String[] args) {
		
		double raio = Double.parseDouble(
				JOptionPane.showInputDialog("Digite o raio da caixa d'�gua"));
		
		double altura = Double.parseDouble(
				JOptionPane.showInputDialog("Digite a altura da caixa d'�gua"));
		
		double volume = Math.PI * Math.pow(raio, 2) * altura;
		
		JOptionPane.showMessageDialog(null, 
				String.format("O volume da caida d'�gua � %.2f litros", volume));
		
		

	}

}
