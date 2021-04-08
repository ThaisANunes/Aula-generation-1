package POO;

public class Cavalo extends Animal {
	
	private String velocidade;
	private String cor;
	private String relinchar;

	
	public Cavalo()
	{
		
	}
	
	public Cavalo (String velocidade,String cor,String relinchar)
	{
		this.velocidade = velocidade;
		this.cor = cor;
		this.relinchar = relinchar;
	}
	public Cavalo (String nome,String tempodevida,String classeAnimal,String habitat,String alimentacao)
	{
		super (nome,tempodevida,classeAnimal,habitat,alimentacao);
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
	public String getrelinchar()
	{
		return "iiirrrrí, rilinchin";
		
	}
	
	/*public void print()
	{
		System.out.println("iiirrrrí, rilinchin");
    }*/

}
