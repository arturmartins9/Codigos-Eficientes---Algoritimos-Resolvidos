package aula11;

/*
 * Fa�a um algoritimo que copie o conteudo de um vetor em um segundo vetor
 */
public class Aula11 {
	public static void main(String[] args) {
		
		String[] vetorUm = {"Ceveja", "caipirinha","cacha�a"};
		String[] vetorDois = new String[vetorUm.length];
		
		for(int i = 0 ; i < vetorUm.length ; i++){
			vetorDois[i] = vetorUm[i];
			
			System.out.print(vetorDois[i] + " ");
		}
		
	}
}
