package Laçosdedecisao;

import java.util.Scanner;

public class imparraiz {
	
	public static void main (String[] args) {
		
		double num, raiz,nqua;
		Scanner ler = new Scanner (System.in); 
		
		System.out.println("Número: ");
		num =ler.nextDouble();
		
		if (num%2==0)
		{
		   raiz = Math.sqrt(num);
		   System.out.println("Número par.\nRaiz: "+raiz);
		}
		else
		{
			nqua = Math.pow(num,2);
			System.out.println("Número ímpar.\nNúmero elevado ao quadrado:"+nqua);
		}
	}

}
