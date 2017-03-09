package aula56;

import javax.swing.JOptionPane;

/*
 * C�digos Eficientes
 * https://www.youtube.com/watch?v=g9YGMoeOY0Y
 * 
 * Alguns pa�ses medem temperaduras em graus Celsius, e outros em graus
 * Fahrenheit.
 * Fa�a um algoritmo para ler uma temperatura Celsius e imprimi-la em Fahrenheit.
 * 
 */
public class DeCelsiusPFahrenheit {

	public static void main(String[] args) {
		
		double grau = Double.parseDouble( JOptionPane.showInputDialog("Digite a temperatura em graus Celsius"));
		
		double fahrenheit = ( grau * 1.8 ) + 32 ;
		
		JOptionPane.showMessageDialog(null, String.format("%.2f graus Celsius equivalem a %.2f Fahrenheit", grau, fahrenheit));

	}

}
