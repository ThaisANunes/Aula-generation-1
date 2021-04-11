package ProjetoBloco1;

import java.util.Scanner;

public class TesteProjeto {

	public static void main(String[] args) {
		String filmes, sugestao=null;
		Scanner scanner = new Scanner(System.in);
		Filmes filmes1 = new Filmes();
		Series series = new Series();
		
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
			System.out.println(series.lista1());
			break;
		case "Filme":
			sugestao = "Ação";
			//System.out.println(filmes1.lista1());
			break;
		}
		break;
	case  "Terror" :
		scanner.nextLine();
		System.out.println(series.lista2());
		break;
	case"Romance" :
		scanner.nextLine();
		System.out.println(series.lista3());
		break;
	case "Ficção e Fantasia" :
		scanner.nextLine();
		System.out.println(series.lista4());
		break;
	    default:
		System.out.println("O que você escreveu não é uma das opções acima. Tente novamente!");
	    break;
	}
	if (sugestao =="Ação")
	{
		System.out.println(series.lista1());
	}

	}

}
