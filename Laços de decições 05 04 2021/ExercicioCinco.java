package LacosDeRepeticao;

import java.util.Scanner;

public class ExercicioCinco {
	
	public static void main (String[] args) {
		
		int num,soma=0;
		Scanner scanner =new Scanner (System.in);
		
		System.out.println("Número: ");
		num = scanner.nextInt();
		
		do 
		{
			soma = soma + num;
			System.out.println("Número: ");
			num = scanner.nextInt();
		}
		while (num>1);
		System.out.println("Soma de todos os números: "+soma);
	}

}
