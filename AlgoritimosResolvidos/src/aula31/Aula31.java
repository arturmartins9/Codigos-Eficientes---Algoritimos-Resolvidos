package aula31;

/*
 * Fa�a um procedimento que retorna, por par�metro,
 * um vetor(5) com os 5 primeiros n�meros perfeitos.
 * 
 * 5 primeiros n�meros perfeitos: 6, 28, 496,8128,33.550.336, ....
 * 
 * Um n�mero se diz perfeito se � igual � soma de seus divisores pr�prios. 
 * Divisores pr�prios de um n�mero positivo N s�o todos os divisores inteiros positivos de N exceto o pr�prio N.
 *	 Por exemplo, o n�mero 6, seus divisores pr�prios s�o 1, 2 e 3, cuja soma � igual � 6.
 *    				1 + 2 + 3 = 6
 *    Ref.:http://www.matematica.br/historia/nperfeitos.html 
 * 
 * https://www.youtube.com/watch?v=CBSZFahGM5g
 */
public class Aula31 {

	public static void main(String[] args) {
		//

		int[] vetorA = new int[5];
		int contador = 0;
		int valor = 3;
		int total = 0;

		for (int i = 2; i < valor; i = i + 2) {
			for (int j = i; j > 0; j--) {
				// System.out.println(i + " " + j );
				if (j < i && i % j == 0) {
					total += j;
					// System.out.println(i + " " + j );
				}
			}
			if (total == i) {
				vetorA[contador] = i;
				System.out.print(vetorA[contador] + " -> ");
				contador++;
				if (contador < 5) {
					valor = valor + 2;
				}
			} else {
				valor = valor + 2;
			}
			total = 0;
		}

	}

}
