package aula02.src.SisAluno;

public class Aluno {

	private String nome;
	private String email;
	private String idade;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdadeInt() {
		return Integer.parseInt(idade);
	}
	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	
	
	
	
}
