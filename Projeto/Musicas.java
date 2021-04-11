package ProjetoBloco1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Musicas extends Listas{
	
	public Musicas()
	{
	
	}
	Scanner scanner = new Scanner(System.in);

	@Override
	public List<String> lista1()
	{
		List<String> listaPop = new ArrayList<String>();
		listaPop.add("You don't own me -SAYGRACE");
		listaPop.add("I knew you were trouble -Taylor Swift  ");
		listaPop.add("MONTERO - Lil Nas X");
		listaPop.add("Levitating - Dua Lipa");
		return listaPop;
	}
	@Override
	public List<String> lista2()
	{
		List<String> listaRock = new ArrayList<String>();
		listaRock.add("Guns N' Roses - Sweet Child O' Mine");
		listaRock.add("Metallica - One");
		listaRock.add("The Strokes - Reptilia");
		listaRock.add("Muse - Knights of Cydonia");
		return listaRock;
	}
	@Override
	public List<String> lista3()
	{
		List<String> listaSertanejo = new ArrayList<String>();
		listaSertanejo.add("Marilia Mendonça - Ciumeira");
		listaSertanejo.add("Jorge & Mateus -  Vogais e Consoantes");
		listaSertanejo.add("Luiza & Maurilio - S de Saudade");
		listaSertanejo.add("Lauana Prado - Cobaia");
		return listaSertanejo;
	}
	@Override
	public List<String> lista4()
	{
		List<String> listaSamba = new ArrayList<String>();
		listaSamba.add("Beth Carvalho - Agoniza Mas Não Morre");
		listaSamba.add("Cartola - As Rosas Não Falam");	
		listaSamba.add("João Nogueira - Além do Espelho");
		listaSamba.add("Reza - Maria Rita");

		return listaSamba;
	}
	@Override
	public List<String> lista5()
	{
		List<String> listaRap = new ArrayList<String>();
		listaRap.add("Racionais MC's - Capítulo 4 Versículo 3");
		listaRap.add("Emicida - Mandume");
		listaRap.add("Rashid - Esteriótipo");
		listaRap.add("Inquérito - Versos Vegetarianos");

		return listaRap;
	}
	@Override
	public List<String> lista6()
	{
		List<String> listaKpop = new ArrayList<String>();
		listaKpop.add("BTS - Spring Day");
		listaKpop.add("TXT - Nap of a Star ");
		listaKpop.add("PENTAGON - Shine");
		listaKpop.add("TWICE - I Can't Stop Me");
		return listaKpop;
	}
	
	

}
