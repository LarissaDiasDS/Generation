package Projeto;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tentando {

	public static void main(String[] args) {
		Queue<String> povo = new LinkedList<String>();
		Scanner leia = new Scanner (System.in);
		
		 int opcao;

		 while (true) {
			 System.out.println("Digite: ");
			 System.out.println("1: Adicionar cliente na fila: ");
			 System.out.println("2: Listar todos os Clientes na fila: ");
			 System.out.println("3: Retirar cliente da fila:");
			 System.out.println("0: Sair do programa");
			 
			 
			switch (opcao) {
			 case 1:
				 System.out.print("Digite o nome do Cliente: ");
				 String nomeCliente = leia.nextLine();
				 povo.add(nomeCliente);
				 System.out.println("Cliente adicionado a fila.");
				 break;
				 
			 case 2:
				 if (povo ()) {
					 System.out.println("A fila está vazia.");
				 }else {
					 System.out.println("Clientes na fila: ");
					 for (String cliente : povo) {
						 System.out.println(cliente);
					 }
				 }
		
				 
			 case 3:
				 if (povo.isEmpty()) {
					 System.out.println("A fila está vazia. Não é possível retirar um cliente.");
				 }else {
					 String clienteChamado = povo.poll();
					 System.out.println("Cliente chamado e retirado da fila: " + povo);
					 }

			 case 0:
				 System.out.println("Programa finalizado.");
				 povo.peek();
				 System.exit(0);
				 break;
				 
			 
			 }
			 
		 } 

	}

}

