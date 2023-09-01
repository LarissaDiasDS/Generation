package Projeto;

import java.util.Scanner;

public class IFelse {

	public static void main(String[] args) {
		
		 Scanner leia = new Scanner(System.in);
		int A, B, C, soma;
		
		System.out.println("Digite o valor de A: ");
		A = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		B = leia.nextInt();
		
		System.out.println("Digite o valor de C: ");
		C = leia.nextInt();
         
		soma = A + B;
		if(soma > C) {
			System.out.println(A + " + " +B+ " = " + soma + " > " + C );
			System.out.println("A Soma de A + B é Maior do que C");
		}else if(soma < C){
			System.out.println(A + " + " +B+ " = " + soma + " < " + C );
			System.out.println("A Soma de A + B é Menor do que C");
		}else {
			System.out.println(A + " + " +B+ " = " + soma + " = " + C );
			System.out.println("A Soma de A + B é Igual  C");
		}
		
	}

}

