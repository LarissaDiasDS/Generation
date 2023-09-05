package Projeto;

import java.util.Scanner;
import java.util.Stack;

public class Proxima {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Stack<String> livro = new Stack<String>();
		
		int opcao;
		
		System.out.println("1: Adicionar um novo livro.");
		System.out.println("2: Listar todos os livros.");
		System.out.println("3: retirar um livro da pilha"); 
		System.out.println("0: O programa deve ser finalizado.");
					
		
		 do {
			 System.out.println("Digite a opção desejada: ");
			 opcao = leia.nextInt();
			 
		 switch (opcao) {

		 case 1:
          System.out.println("Adicionar novo livro.");
          String nome = leia.next();
          livro.add(nome);
          System.out.println( nome + " livro adicionado");

		 break;

		 case 2:
			 if(livro.isEmpty()) {
				 System.out.println("A lista esta vazia.");
			 }else {
				 System.out.println("Lista de livros.");
				 for (String i : livro) {
					  System.out.println(i);
					 
					}
			 }

		 break;

		 case 3:
			 livro.pop();
			 if(livro.isEmpty()) {
				 System.out.println("A lista esta vazia.");
			 }else {
				 System.out.println("Lista de livros atualizada.");
				 for (String i : livro) {
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
