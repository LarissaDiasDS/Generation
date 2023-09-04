package Projeto;

import java.util.Scanner;

public class ArrayVet {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vetorNumero[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		System.out.println("Digite o número que deseja encontrar: ");
		int numero = leia.nextInt();
		
		
		int recebe = -1;
		for(int indice = 0; indice < vetorNumero.length; indice++) {
			if (vetorNumero[indice] == numero) {
				recebe = indice;
			}
		}
		
		if(recebe != -1) {
			System.out.println(" O numero " + numero + " está localizado na posição " + recebe);
			
		}else {
			System.out.println(" O numero " + numero + " nao foi encontrado. ");
		}

	}

}
