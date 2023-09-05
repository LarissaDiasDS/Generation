package Projeto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Collection {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
	    Scanner leia = new Scanner(System.in);
	    
	    String cor;
	    
	    System.out.println("\nDigite 5 cores: ");
	    for(int indice = 0; indice < 5; indice++) {
	    	cor = leia.nextLine();
	    	cores.add(cor);
	    }
	    System.out.println("\nListar todas as cores: ");
        for (String indice : cores) {
        	System.out.println(indice);
        }
        Collections.sort(cores);
        System.out.println("\nListar de cores ordenadas: ");
        for (String indice : cores) {
        	System.out.println(indice);
        }
	}

}
