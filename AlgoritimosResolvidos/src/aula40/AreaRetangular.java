package aula40;

import javax.swing.JOptionPane;

/*
 * Uma imobiliarea vende apenas terrenos retangulares.
 * Fa�a um algoritmo para ler as dimens�es de um terreno
 * e depois exibir sua �rea.
 */
public class AreaRetangular {

	public static void main(String[] args) {
		
		double largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do terreno"));
		double profundidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a profundidade"));
		double area = largura * profundidade;
		
		System.out.printf("A �re � = %.2f m�",area);

	}

}
