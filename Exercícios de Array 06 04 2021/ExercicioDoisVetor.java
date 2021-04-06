package Arrays;

import java.util.Scanner;

public class ExercicioDoisVetor {

	public ExercicioDoisVetor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		int [] vetor = new int [6];
		int somap=0,contim=0;
		String pares = "Números pares digitados: " ,impares = "Números ímpares digitados: ";
		
		for (int i=0;i<6;i++)
		{
			System.out.println("Número: ");
			vetor[i] = scanner.nextInt();
			
			if (vetor[i]%2==0)
			{ 
				
				pares = pares + vetor[i] + " ";
				somap = somap + vetor[i];
			}
			else
			{
				impares = impares +vetor[i] + " ";
				contim++;
			}
		}
		System.out.println(pares +"\n"+ impares);
		System.out.println("Números pares somados: "+somap);
		System.out.println("Quantidade de números ímpares digitados: "+contim);

	}

}
