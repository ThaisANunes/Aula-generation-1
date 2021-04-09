package POO;

public class CavaloPolimorfismo extends AnimalPolimorfismo {
	
	private String velocidade;
	private String cor;
	
	public CavaloPolimorfismo()
	{
		
	}
	
	public CavaloPolimorfismo (String velocidade,String cor)
	{
		this.velocidade = velocidade;
		this.cor = cor;
	}
	public CavaloPolimorfismo (String nome,String tempodevida,String classeAnimal,String habitat,String alimentacao)
	{
		super (nome,tempodevida,classeAnimal,habitat,alimentacao);
	}
	
	@Override
	public void som (int emitirSom)
	{
		System.out.println("iiirrrrí, rilinchin...... iiirrrrí, rilinchin...... iiirrrrí, rilinchin......");
	}
	
	@Override
	public void acao (int acao)
	{
		System.out.println("Correr...");
	}

	public String getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(String velocidade) {
		this.velocidade = velocidade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
}
