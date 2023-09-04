package Projeto;

import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int matriz[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int soma = 0;
        int somaSec = 0;
        
        System.out.println("Elemento da diagonal principal é: ");
        
        for(int indice = 0; indice < matriz.length; indice++) {
        	System.out.println( matriz[indice][indice] + " " );
        	soma += matriz[indice][indice];
        }
        System.out.println("Elemento da diagonal secundaria é: ");
        
        for(int indice = 0; indice < matriz.length; indice++) {
        	System.out.println(matriz[indice][matriz.length -1 -indice] + " ");
        	somaSec += matriz[indice][matriz.length -1 -indice];
        }
        System.out.println(" A soma dos elemento da diagonal principal é: " + soma);
        
        System.out.println(" A soma dos elemento da diagonal secundaria é: " + somaSec);
        

	}
	

}
