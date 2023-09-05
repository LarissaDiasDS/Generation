package Projeto;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1 {
 
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Queue<String> povo = new LinkedList<String>();
		
		int opcao;
		
		System.out.println("1: Adicionar um novo Cliente na fila.");
		System.out.println("2: Listar todos os Clientes na fila.");
		System.out.println("3: Chamar (retirar) uma pessoa da fila"); 
		System.out.println("0: O programa deve ser finalizado.");
					
		
		 do {
			 System.out.println("Digite a opção desejada: ");
			 opcao = leia.nextInt();
			 
		 switch (opcao) {

		 case 1:
          System.out.println("Adicionar novo cliente.");
          String nome = leia.next();
          povo.add(nome);
          System.out.println( nome + " Cliente adicionado");

		 break;

		 case 2:
			 if(povo.isEmpty()) {
				 System.out.println("A lista esta vazia.");
			 }else {
				 System.out.println("Lista de clientes.");
				 for (String i : povo) {
					  System.out.println(i);
					 
					}
			 }

		 break;

		 case 3:
			 povo.remove();
			 if(povo.isEmpty()) {
				 System.out.println("A lista esta vazia.");
			 }else {
				 System.out.println("Lista de clientes atualizada.");
				 for (String i : povo) {
					  System.out.println(i);
				 }
					}
		 

		 break;
		 
		 case 0:
			 System.out.println("Programa finalizado.");
			 
			 break;

		 default:

		  System.out.println("Opção invalida");

		 }
		 }
		 while (opcao != 0);
	}

}
