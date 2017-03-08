package aula54;

import javax.swing.JOptionPane;

/*
 * C�digos Eficientes -> https://www.youtube.com/watch?v=AppTuto5d7c
 * 
 * Exerc�cio 54
 * 
 * Tr�s amigos, Carlos, Andr� e Felipe. Decidiram rachar igualmente a conta de um bar. Fa�a um
 * algoritmo para ler o valor total de uma conta e imprimir quanto cada um deve pagar,
 * mas fa�a com que Calas e Andr� n�o paguem centavos. 
 * Ex.: Um conta de R$ 101,53
 * 
 */
public class ContaDeBarDividida {

	public static void main(String[] args) {

		double totalConta = Double.parseDouble(JOptionPane.showInputDialog("Digite o total a pagar"));
		
		double sobra = totalConta % 3;
		
		double valorCarlos = (totalConta - sobra) / 3 ;
		double valorAndre  = (totalConta - sobra) / 3 ;
		double valorFelipe = ((totalConta - sobra) / 3) + sobra;
		
		JOptionPane.showMessageDialog(null, String.format("Carlos paga R$ %.2f \n Andr� paga R$ %.2f \n Felipe paga R$ %.2f", valorCarlos,valorCarlos,valorFelipe));

	}

}
