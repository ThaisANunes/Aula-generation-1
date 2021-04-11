package ProjetoBloco1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtividadesFisica extends Listas{

	public AtividadesFisica()
	{
	
	}
	
	@Override
	public void listaGeneros() {
		System.out.println("\nDigite o código da Atividade desejada:"
				+ "\n1- Dança"
				+ "\n2- Aeróbicos"
				+ "\n3- Yoga"
				+ "\n4- Meditação"
				+ "\n5- Funcional"
				+ "\n6- Para Crianças");
	}

	@Override
	public List<String> lista1() {
		List<String> listaDanca = new ArrayList<String>();
		listaDanca.add("Irtylo Santos youTube");
		listaDanca.add("Playdance youTube");
		
		return listaDanca;
	}

	@Override
	public List<String> lista2() {
		List<String> listaAerobicos = new ArrayList<String>();
		listaAerobicos.add("Exercicio em casa YouTube");
		listaAerobicos.add("Carol Borba YouTube");
		
		return listaAerobicos;
	}

	@Override
	public List<String> lista3() {
		List<String> listaYoga = new ArrayList<String>();
		listaYoga.add("Yoga em casa YouTube");
		listaYoga.add("Pri Leite Yoga YouTube");
		
		return listaYoga;
	}

	@Override
	public List<String> lista4() {
		List<String> listaMeditacao = new ArrayList<String>();
		listaMeditacao.add("Camila Zen YouTube");
		listaMeditacao.add("Yoga para você YouTube");
		
		return listaMeditacao;
	}

	@Override
	public List<String> lista5() {
		List<String> listaFuncional = new ArrayList<String>();
		listaFuncional.add("Carol Borba YouTube");
		listaFuncional.add("Thiago Pugliesi YouTube");
		
		return listaFuncional;
	}

	@Override
	public List<String> lista6() {
		List<String> listaParaCriancas = new ArrayList<String>();
		listaParaCriancas.add("Robson Furlan - Ginástica Infantil YouTube");
		listaParaCriancas.add("Viva Saudável YouTube");
		
		return listaParaCriancas;		
	}
	

	
	
}
