package aula58;

import javax.swing.JOptionPane;

/*
 * C�digos Eficientes
 * Algoritmos Resolvidos [ Matem�tica ] - Novelos gastos em blusas
 * https://www.youtube.com/watch?v=JypfUN5IgAs
 * 
 * Quest�o:
 * Um confec��o produz X blusas de l� e para isso gasta uma certa
 * quantiadde de novelos.
 * Fa�a um algoritmo para calcula quantos novelos de l� ela gasta
 * por blusa.
 * 
 */
public class NovelosGastosBlusas {

	public static void main(String[] args) {
		
		int blusas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de blusas produzidas"));
		
		double novelos = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de novelos gastos"));
		
		double total = novelos/blusas;
		
		JOptionPane.showMessageDialog(null, String.format("S�o gastos %.2f novelos em cada blusa", total));
		
		

	}

}
