package POO;

public class Cliente {
	
	private String nome;
	private String idade;
	private String CPF;
	private String Email;
	private String telefone;
	private String endereco;
	
	public Cliente (String nome,String idade,String CPF,String Email,String telefone,String endereco)
	{
		this.nome = nome;
		this.idade = idade;
		this.CPF =CPF;
		this.Email = Email;
		this.telefone = telefone;
		this.endereco = endereco;
	}
		public String getInfDoCliente()
		{
			String infDoCliente = "Nome: "+nome+"\nIdade: "+idade+"\nCPF: "+CPF+"\nE-mail: "+Email+"\nTelefone: "+telefone+"\nEndereço: "+endereco;
			return infDoCliente;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getIdade() {
			return idade;
		}
		public void setIdade(String idade) {
			this.idade = idade;
		}
		public String getCPF() {
			return CPF;
		}
		public void setCPF(String cPF) {
			CPF = cPF;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		
}		