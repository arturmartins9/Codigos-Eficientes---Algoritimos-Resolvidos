package aula02;

import java.util.Scanner;

public class ValoresMultiplos {

	public static void main(String[] args) {
		// Elabarora um algoritomo que le 2 valores a e b e mostra mensagem se
		// s�o multiplos ou n�o
		
		Scanner leitor = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Digite o primeiro numero");
		a = leitor.nextDouble();
		
		System.out.println("Digite o Segundo numero");
		b = leitor.nextDouble();
		
		if(a % b == 0 || b % a == 0){
			System.out.println("S�o multiplos - AND");
		}else {
			System.out.println("N�o s�o multiplos");
		}

	}

}
