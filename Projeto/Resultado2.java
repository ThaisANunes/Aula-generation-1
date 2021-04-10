package Projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Resultado2 extends Quiz{
	
	Scanner scanner = new Scanner(System.in);
	
	@Override
	public List<String> lista1()
	{
		List<String> listaPop = new ArrayList<String>();
		listaPop.add("You don't own me");
		listaPop.add("I knew you were trouble ");	
		return listaPop;
	}
	@Override
	public List<String> lista2()
	{
		List<String> listaRock = new ArrayList<String>();
		listaRock.add(" I got you babe");
		listaRock.add("Bang bang");	
		return listaRock;
	}
	@Override
	public List<String> lista3()
	{
		List<String> listaSertanejo = new ArrayList<String>();
		listaSertanejo.add("Evidencias");
		listaSertanejo.add("Meteoro da paixão");	
		return listaSertanejo;
	}
	@Override
	public List<String> lista4()
	{
		List<String> listaSamba = new ArrayList<String>();
		listaSamba.add("Preciso me encontrar");
		listaSamba.add("O mundo é um moinho");	
		return listaSamba;
	}
	
	@Override
	public void filmes (String filmes)
	{
		
	}
	@Override
	public void musica (String musica)
	{
		do {
			System.out.println("\nEscreva uma das opções abaixa de genero de musica :\n-Pop\n-Rock\n-Sertanejo\n-Samba");
			musica = scanner.nextLine(); 
		switch (musica)
		{
		case "Pop" :
			scanner.nextLine();
			System.out.println(lista1());
			break;
		case "Rock" :
			scanner.nextLine();
			System.out.println(lista2());
			break;
		case "Sertanejo" :
			scanner.nextLine();
			System.out.println(lista3());
			break;
		case "Samba" :
			scanner.nextLine();
			System.out.println(lista4());
			break;
		    default:
			System.out.println("O que você escreveu não é uma das opções acima. Tente novamente!");
		    break;         
		}
		}while (musica!="0");
		
	}
}
