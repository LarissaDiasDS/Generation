package funcionario;

public class Funcionario {

		private String nome;
		private String profissao;
		private int idade;
		private int identificacao;
		private String sexo;
		
		
	
		public Funcionario(String nome, String profissao, int idade, int identificacao, String sexo) {
			super();
			this.nome = nome;
			this.profissao = profissao;
			this.idade = idade;
			this.identificacao = identificacao;
			this.sexo = sexo;
		}

		public String getNome() {
				return nome;
		}
	
		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getProfissao() {
			return profissao;
		}

		public void setProfissao(String profissao) {
			this.profissao = profissao;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public int getIdentificacao() {
			return identificacao;
		}


		public void setIdentificacao(int identificacao) {
			this.identificacao = identificacao;
		}


		public String getSexo() {
			return sexo;
		}


		public void setSexo(String sexo) {
			this.sexo = sexo;
		}





	public void visualizar() {
		System.out.println("Nome" + nome);
		System.out.println("Profissão" + profissao);
		System.out.println("Idade" + idade);
		System.out.println("Identificação" + identificacao);
		System.out.println("Sexo" + sexo);
	}
	
			
	
		
	
	}
