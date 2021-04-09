package POO;

public class CachorroPolimorfismo extends AnimalPolimorfismo {
	
	private String raca;

	public CachorroPolimorfismo()
	{
		
	}
	public CachorroPolimorfismo(String nome,String tempodevida,String classeAnimal,String habitat,String alimentacao)
	{
		super (nome,tempodevida,classeAnimal,habitat,alimentacao);
	}
	public CachorroPolimorfismo(String nome,String tempodevida,String classeAnimal,String habitat,String alimentacao,String raca)
	{
		super (nome,tempodevida,classeAnimal,habitat,alimentacao);
		this.raca = raca;
	}
	
	@Override
	public void som (int emitirSom)
	{
		System.out.println("au au au.... au au au.... au au au....");
	}
	
	@Override
	public void acao (int acao)
	{
		System.out.println("Correr...");
	}
	
	
	
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}


}
