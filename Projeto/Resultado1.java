package Projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Resultado1 extends Quiz{
	
	
	
	public Resultado1 ()
	{
	
	}
	Scanner scanner = new Scanner(System.in);

	@Override
	public List<String> lista1()
	{
		List<String> listaAcao = new ArrayList<String>();
		listaAcao.add("24h");
		listaAcao.add("Spy");	
		return listaAcao;
	}
	@Override
	public List<String> lista2()
	{
		List<String> listaTerror = new ArrayList<String>();
		listaTerror.add("Chuck");
		listaTerror.add("Us");	
		return listaTerror;
	}
	@Override
	public List<String> lista3()
	{
		List<String> listaRomance = new ArrayList<String>();
		listaRomance.add("Orgulho e Preconceito");
		listaRomance.add("Titanic");	
		return listaRomance;
	}
	@Override
	public List<String> lista4()
	{
		List<String> listaFiccaoFantasia = new ArrayList<String>();
		listaFiccaoFantasia.add("Star Wars");
		listaFiccaoFantasia.add("Star Trek");	
		return listaFiccaoFantasia;
	}

	@Override
	public void filmes (String filmes)
	{
		
			System.out.println("\nEscreva uns dos genero de filme:\n-Ação\n-Terror\n-Romance\n-Ficção e Fantasia");
			filmes = scanner.nextLine(); 
		switch (filmes)
		{
		case "Ação" :
			scanner.nextLine();
			System.out.println(lista1());
			//int filme1 = filme1 + 1;
			break;
		case "Terror" :
			scanner.nextLine();
			System.out.println(lista2());
			break;
		case "Romance" :
			scanner.nextLine();
			System.out.println(lista3());
			break;
		case "Ficção e Fantasia" :
			scanner.nextLine();
			System.out.println(lista4());
			break;
		    default:
			System.out.println("O que você escreveu não é uma das opções acima. Tente novamente!");
		    break;
		    
		}
		    if (filmes=="Ação")
		    {
		    	System.out.println(lista1());
		    }

		
	}
	@Override
	public void musica (String musica)
	{
		
	}


}
