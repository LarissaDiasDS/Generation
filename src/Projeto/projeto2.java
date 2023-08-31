package Projeto;

import java.util.Scanner;

public class projeto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner ler = new Scanner(System.in);
		float nota1, nota2, nota3, nota4, media;
       
       System.out.println("Digite a primeira nota: ");
       nota1 = ler.nextFloat();
       
       System.out.println("Digite a segunda nota: ");
       nota2 = ler.nextFloat();
       
       System.out.println("Digite a terceira nota: ");
       nota3 = ler.nextFloat();
       
       System.out.println("Digite a quarta nota: ");
       nota4 = ler.nextFloat();
       
       media = (nota1 + nota2 + nota3 + nota4) / 4;
       System.out.printf("Sua nota final é: %.1f " , media);
	}

}
