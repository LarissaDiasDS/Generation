package Projeto;

import java.util.Scanner;

public class projeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner leia = new Scanner(System.in);
		double salario;
		double abono;
		double novoSalario;
        
        System.out.println("Digite seu salário: ");
        salario = leia.nextDouble();
        
        System.out.println("Digite o abono: ");
        abono = leia.nextDouble();
        
        novoSalario = salario + abono;
        System.out.println("Seu novo salário será: " + novoSalario);
	}

}
