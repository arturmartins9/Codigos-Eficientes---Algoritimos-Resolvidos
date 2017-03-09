package aula57;

import javax.swing.JOptionPane;

/*
 * C�digos Eficientes
 * Algoritmos Resolvidos [ Matem�tica ] - Despesas de granja com frangos
 * https://www.youtube.com/watch?v=hqppmD-76r0
 * 
 * Quest�o:
 * A granje Frangus possui um controle automatizado de cada frango da sua produ��o.
 * No p� direito do frango h� um anem com um chip de identifica��o; no p� esquerdo s�o 
 * dois aneis para indicar o tipo de alimente que ele deve consumir.
 * Sabendo que o anel com chipe custa R$ 4,00 e o anel de alimento custa R$ 3,50,
 * fa�a um algoritmo para calcula o gasto total de granja para marcar todos os frangos.
 * 
 * 
 * 
 */
public class DespesasGranjaFrangos {

	public static void main(String[] args) {
		
		int quantidadeFrangos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de frangos"));
		
		double total = (quantidadeFrangos * 4.00 ) + ((quantidadeFrangos * 3.50) * 2);
		
		JOptionPane.showMessageDialog(null, String.format("o total gasto com os %d frangos s�o R$ %.2f reais", quantidadeFrangos,total));

	}

}
