package POO;

public class Preguica extends Animal {
	
	private String somp;
	private String tamanho;
	
	public Preguica()
	{
		
	}
	public Preguica (String somp,String tamanho)
	{
		this.somp = somp;
		this.tamanho = tamanho;
	}
	public Preguica (String nome,String tempodevida,String classeAnimal,String habitat,String alimentacao)
	{
		super (nome,tempodevida,classeAnimal,habitat,alimentacao);
	}
	public String getSomp() {
		somp = "ahahahah";
		return somp;
	}
	public void setSomp(String somp) {
		this.somp = somp;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	

}
