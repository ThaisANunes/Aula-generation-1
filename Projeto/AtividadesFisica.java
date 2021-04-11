package ProjetoBloco1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtividadesFisica extends Listas{

	public AtividadesFisica()
	{
	
	}
	Scanner scanner = new Scanner(System.in);

	@Override
	public List<String> lista1()
	{
		List<String> listaAtividadeFisica = new ArrayList<String>();
		listaAtividadeFisica.add("Carol Borba YouTube");
		listaAtividadeFisica.add("Exercicio em casa YouTube");
		listaAtividadeFisica.add("Yoga em casa YouTube");
		listaAtividadeFisica.add("Namu YouTube");
		listaAtividadeFisica.add("Robson Furlan - Ginástica Infantil YouTube");
		listaAtividadeFisica.add("Camila Zen YouTube");
		return listaAtvidadeFisica;
	}
	

	
	
}
