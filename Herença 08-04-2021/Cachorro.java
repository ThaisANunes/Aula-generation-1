package POO;

public class Cachorro extends Animal{
	
	private String raca;

	public Cachorro()
	{
		
	}
	public Cachorro(String nome,String tempodevida,String classeAnimal,String habitat,String alimentacao)
	{
		super (nome,tempodevida,classeAnimal,habitat,alimentacao);
	}
	public Cachorro(String nome,String tempodevida,String classeAnimal,String habitat,String alimentacao,String raca)
	{
		super (nome,tempodevida,classeAnimal,habitat,alimentacao);
		this.raca = raca;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public void emitirSom()
	{
		System.out.println("au au au");
	}
	
	
	
	
}
