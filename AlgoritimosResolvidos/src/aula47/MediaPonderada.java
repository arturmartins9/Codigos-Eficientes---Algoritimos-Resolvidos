package aula47;

import javax.swing.JOptionPane;

/*
 * 
 * Fa�a um algoritmo para ler tr�s notas de um alino em uma disciplina e
 * imprimir a sua m�dia ponderada (as notas tem pesos respectivos 1,2 e 3)
 * 
 */
public class MediaPonderada {

	public static void main(String[] args) {
		
		double[] nota = new double[3];
		double total = 0;
		
		for(int i = 0 ; i < nota.length ; i++){
			nota[i] = Double.parseDouble(JOptionPane.showInputDialog(String.format("Digite a %d� nota do aluno", i + 1)));
		}
		
		total = (((nota[0]*1)+(nota[1]*2)+(nota[2]*3)) / (1+ 2+ 3));
		
		JOptionPane.showMessageDialog(null, String.format("A m�dia ponderada do aluno � %.2f ", total));

	}

}
