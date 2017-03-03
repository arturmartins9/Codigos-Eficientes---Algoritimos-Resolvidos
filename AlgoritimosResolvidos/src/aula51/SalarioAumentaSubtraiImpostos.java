package aula51;

import javax.swing.JOptionPane;

/*
 * Fa�a um algoritmo para ler o salario de um funcion�rio e aument�-lo em 15%. 
 * Ap�s o aumento, desconte 8% de impostos.
 * Imprima o sal�rio inicial, o sal�rio com o aumenta e o sal�rio final.
 * 
 */
public class SalarioAumentaSubtraiImpostos {

	public static void main(String[] args) {
	
		double salario = Double.parseDouble( JOptionPane.showInputDialog("Digite o salario do funcion�rio"));
		double salarioAumentado = salario + (salario * 0.15);
		double salarioFinal = salarioAumentado - (salario * 0.08);
		
		JOptionPane.showMessageDialog(null, String.format("Sal�rio inicial: %.2f\n "
														+ "Sal�rio com aumento %.2f\n"
														+ "Sal�rio final %.2f", 
														salario,salarioAumentado,salarioFinal));
		

	}

}
