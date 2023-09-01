package Projeto;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num1, num2, contador;
		
		System.out.println("Digite o primeiro número do intervalo: ");
		num1 = ler.nextInt();
		System.out.println("Digite o último número do intervalo: ");
		num2 = ler.nextInt();
		
		if(num1 < num2) {
			for(contador = num1; contador <num2; contador++) {
				if(contador % 3 == 0 && contador % 5 == 0) {
					System.out.println(contador + " é multiplo de 3 e de 5.");
				}
			}
		}
		else {
			System.out.println("Valor invalido. ");
		}

	}

}
