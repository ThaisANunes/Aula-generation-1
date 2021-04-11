package ProjetoBloco1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Filmes extends Listas {
	
	public Filmes()
	{
	
	}
	Scanner scanner = new Scanner(System.in);

	@Override
	public List<String> lista1()
	{
		List<String> listaAcao = new ArrayList<String>();
		listaAcao.add("24h");
		listaAcao.add("Spy");	
		listaAcao.add("Spy");
		return listaAcao;
	}
	@Override
	public List<String> lista2()
	{
		List<String> listaTerror = new ArrayList<String>();
		listaTerror.add("Chuck");
		listaTerror.add("Us");	
		listaTerror.add("Us");
		return listaTerror;
	}
	@Override
	public List<String> lista3()
	{
		List<String> listaRomance = new ArrayList<String>();
		listaRomance.add("Orgulho e Preconceito");
		listaRomance.add("Titanic");	
		listaRomance.add("Titanic");
		return listaRomance;
	}
	@Override
	public List<String> lista4()
	{
		List<String> listaFiccaoFantasia = new ArrayList<String>();
		listaFiccaoFantasia.add("Star Wars");
		listaFiccaoFantasia.add("Star Trek");	
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
			System.out.println("Serie ou filme");
			String op = scanner.nextLine();
			switch (op)
			{
			case "Serie":
				System.out.println(lista2());
			case "Filme":
				System.out.println(lista1());
			//System.out.println(lista1());
			break;
		case  "Terror" :
			scanner.nextLine();
			System.out.println(lista2());
			break;
		case"Romance" :
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
		}
		
	}	


}
