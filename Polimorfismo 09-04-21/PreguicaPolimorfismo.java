package POO;

public class PreguicaPolimorfismo extends AnimalPolimorfismo{
	
	public PreguicaPolimorfismo ()
	{
		super ("Slow","30 a 40 anos","Mamifero","Floresta, arvores","Folhas de arvores");
	}
	
	@Override
	public void som (int emitirSom)
	{
		
		System.out.println("ahahahah...... ahahahah...... ahahahah......");

	}
	
	@Override
	public void acao (int acao)
	{
		System.out.println("Subir na árvore...");
	}
	

}
