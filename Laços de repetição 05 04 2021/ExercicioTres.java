package LacosDeRepeticao;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		
		int idade,cont21=0,cont50=0;
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Coloque sua idade: ");
		idade = scanner.nextInt();
		
		while (idade!=-99)
		{
			if(idade<21)
			{
			    cont21++;
		    }
			if (idade>50)
			{
				cont50++;
			}
			System.out.println("Coloque sua idade: ");
			idade = scanner.nextInt();
				
		}
		
		System.out.println("Total de pessoas com menos de 21 anos: "+cont21);
		System.out.println("Total de pessoas com mais de 50 anos: "+cont50);


	}

}
