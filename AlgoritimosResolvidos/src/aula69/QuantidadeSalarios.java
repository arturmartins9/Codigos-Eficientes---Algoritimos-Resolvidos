package aula69;

import javax.swing.JOptionPane;

/*
 * C�digos Eficientes
 * Algoritmos Resolvidos [ Matem�tica ] - Quantidade de sal�rios ganhos
 * https://www.youtube.com/watch?v=4gRIEQqMQ0I
 * 
 * Fa�a um algoritmo que receba o valor do sal�rio m�nimo e o valor do sal�rio de um funcion�rio,
 * Calcule e mostre a quantidade de sal�rios m�nioms que ganha esse funcion�rio
 */
public class QuantidadeSalarios {

	public static void main(String[] args) {
		
		double salMinio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do sal�rio minio"));
		double salFunfionario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario do funcion�rio"));
		
		double quantidade = salFunfionario / salMinio;
		double sobra = salFunfionario % salMinio;
		
		if(salFunfionario < salMinio){
			JOptionPane.showMessageDialog(null, "O Salario do funcion�rio n�o chega a 1 Sal�rio M�nimo");
		}else if(sobra != 0){
			JOptionPane.showMessageDialog(null, String.format("O funcion�rio ganha %.0f sal�rio(s) e R$%.2f reais", quantidade,sobra));
		}else{
			JOptionPane.showMessageDialog(null, String.format("O funcion�rio ganha %.0f sal�rio(s)", quantidade));
		}

	}

}
