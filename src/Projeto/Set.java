package Projeto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Set {

	public static void main(String[] args) {

		HashSet<Integer> valor = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		int numero;
		
		for(int indice = 0; indice < 10; indice++) {
			System.out.print("Digite o " + (indice + 1) + "º numero: " );
			numero = leia.nextInt();
			valor.add(numero);
		}
		Iterator<Integer> it = valor.iterator();
		while(it.hasNext()) {
			  System.out.println(it.next());
			}

	}

}
