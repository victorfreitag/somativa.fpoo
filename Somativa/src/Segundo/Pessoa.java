package Segundo;

public class Pessoa {
	
	private String nome1;
	private int idade;
	public Pessoa(String nome, int idade) {
		super();
		this.nome1 = nome;
		this.idade = idade;
	}
	public String getNome() {
		return nome1;
	}
	public void setNome(String nome) {
		this.nome1 = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

}
