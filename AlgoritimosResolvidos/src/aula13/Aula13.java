package aula13;

/*
 * 
 * Fa�a um algoritmo que fa�a a uni�o de dois
 * vetores de  mesmo tamanho e mesmo tipo em um terceiro
 * vetor com o dobro do tamanho.
 * 
 * 
 */
public class Aula13 {
	public static void main(String[] args) {
		String[] frutas = {"banana", "ma��", "P�ra"};
		String[] adicionais = {"A�ucar", "mel", "leite"};
		String[] salada = new String[frutas.length + adicionais.length];
		
		
		for(int i = 0, j = 0; i < salada.length ; i+=2 , j++){
			System.out.print(salada[i] = frutas[j]);
			System.out.print( " " );
			System.out.print(salada[i + 1] = adicionais[ j ]);
			System.out.print(" ");
		}
		
		
		
		
		
	}
}
