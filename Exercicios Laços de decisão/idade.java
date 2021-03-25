package Laçosdedecisao;

import java.util.Scanner;

public class idade {
	
	public static void main (String[] args) {
		
		int ida,inf,juv,adu;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Idade: ");
		ida = ler.nextInt();
		
		//System.out.println("Idade: "+ida);
		
		if (ida >= 10 && ida <=14)
		{
			System.out.println("Categoria infatil.");
		}
		else if (ida >= 15 && ida <= 17)
		{
			System.out.println("Categoria juvenil.");
		}
		else if (ida >=18 && ida <= 25)
		{
			System.out.println("Categoria adulto.");
		}
		else 
		{
			System.out.println("Idade não consta.");
		}
	}
}
