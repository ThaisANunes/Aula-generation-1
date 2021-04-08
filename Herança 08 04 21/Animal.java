package POO;

public class Animal {
	
	private String nome;
	private String tempodevida;
	private String classeAnimal;
	private String alimentacao;
	private String habitat;
	
	
	public Animal()
	{
		
	}

	public Animal(String nome,String tempodevida, String classeAnimal,String habitat,String alimentacao)
	{
		this.nome = nome;
		this.tempodevida = tempodevida;
		this.classeAnimal = classeAnimal;
		this.alimentacao = alimentacao;
		this.habitat = habitat;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTempodevida() {
		return tempodevida;
	}

	public void setTempodevida(String tempodevida) {
		this.tempodevida = tempodevida;
	}

	public String getClasseAnimal() {
		return classeAnimal;
	}

	public void setClasseAnimal(String classeAnimal) {
		this.classeAnimal = classeAnimal;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}
	
}
