package aula46;

import javax.swing.JOptionPane;

/*
 * Entrar com o dia e o mes de uma data e informar quantos dias 
 * se passaram desde o inicio do ano.
 * Esque�a a quest�o dos anos bissextos e considere
 * que um m�s possui 30 dias.
 * 
 * 
 */
public class DiasPassadosDesdeInicio {

	public static void main(String[] args) {

		int dias = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia"));
		int  mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes"));
		int diasTotais = 0;
		
		if(mes == 1)
			diasTotais = dias;
		else
			diasTotais = ((mes - 1)*30)+dias;
		
		JOptionPane.showMessageDialog(null, String.format("Passaram-se %d dias desde o come�o do ano", diasTotais));
		
	}

}
