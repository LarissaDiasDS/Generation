package Projeto;

import java.util.Scanner;

public class segundoTeste {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int Num1;
		double positivo, negativo;
		
		
		System.out.println("\nDigite um número: ");
		Num1 = leia.nextInt();
		
		
		 if( Num1 % 2 == 0 && Num1 > 0) {
			 System.out.println("\nEste número é Par e Positivo. "); 
		 }else if( Num1 % 2 == 1 && Num1 > 0) {
			 System.out.println("\nEste número é Impar e Positivo. ");
		 }else if(Num1 % 2 == 0 && Num1 < 0) {
			 System.out.println("\nEste número é Par e Negativo. ");
		 }
		 else {
			 System.out.println("\nEste número é Impar e Negativo.");
		 }
		 
		 
				 

		 
		
	     
		

	}

}
