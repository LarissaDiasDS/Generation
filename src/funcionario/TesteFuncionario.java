package funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		 Funcionario novoFunc = new Funcionario("Larissa", "Dev Java jr", 25, 16292, "Feminino");
		 

	
	
		System.out.println("Nome do Funcionario: " + novoFunc.getNome());
		System.out.println("Cargo do Funcionario: " + novoFunc.getProfissao());
		System.out.println("Idade do Funcionario: " + novoFunc.getIdade());
		System.out.println("Identificação do Funcionario: " + novoFunc.getIdentificacao());
		System.out.println("Genero que se identifica : " + novoFunc.getSexo());
	

	}

}
