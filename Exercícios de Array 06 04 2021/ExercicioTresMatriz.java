package Arrays;

import java.util.Scanner;

public class ExercicioTresMatriz {

	public ExercicioTresMatriz() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
		int [][] valores = new int [3][3];
		int cont10=0;
		String maior10 = "E esses valore são: ";
		
		for (int l=0;l<3;l++)
		{
			for (int c=0;c<3;c++)
			{
				System.out.println("Coloque um valor: ");
				valores[l][c] = scanner.nextInt();
				
				if (valores[l][c]>10)
				{
					maior10 = maior10 + valores[l][c] + " ";
					cont10++;
				}
			}
			
		}
		System.out.println("Valores maiores que 10: "+cont10+". "+maior10);
	}

}
