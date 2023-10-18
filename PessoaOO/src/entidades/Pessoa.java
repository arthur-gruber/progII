package entidades;

public class Pessoa {
	public String nome;
	public Integer idade;
	

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void fazAniversario(){
		this.idade += 1;	
		
	}
}