package aula61;

import javax.swing.JOptionPane;

/*
 * C�digos Eficientes
 * 
 * Algoritmos Resolvidos [ Matem�tica ] - Medindo pr�dio, usando sombras
 * https://www.youtube.com/watch?v=oVweEziLEk8
 * 
 * Num dia de sol, voce deseja media a altura de um pr�dio, por�m, a trena n�o � suficiente longa.
 * Assumindo que seja poss�vel medir sua sombra e a do pr�dio no ch�o, e que voce lembre
 * da sua altura, fa�a um algoritmo para ler os dados necess�rios e calcula a altura do pr�dio.
 */
public class MedindoPredioSombra {

	public static void main(String[] args) {
		
		final double minhaAltura = 1.00;
		double minhaSombra = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho da sua sombra"));
		double PredioSombra = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho da Sombra do PREDIO"));
		
		double alturaPredio = (PredioSombra / minhaSombra) * minhaAltura;
		
		JOptionPane.showMessageDialog(null, String.format("O pr�dio mede %.2f metros de altura", alturaPredio));

	}

}
