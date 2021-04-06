package Arrays;

import java.util.Scanner;

public class ExercicioQuatro {

	public ExercicioQuatro() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float [][] matriz1 = new float [2][2];
		float [][] matriz2 = new float [2][2];
		float [][] matriz3 = new float [2][2];
		int menu,constante;
		
		Scanner scanner = new Scanner(System.in);
		
		for (int l=0;l<2;l++)
		{
			for (int c=0;c<2;c++)
			{
				System.out.printf("Coloque o Valor da Matriz 1 [%d][%d]: ",l+1,c+1);
				matriz1[l][c] = scanner.nextFloat();
			}
		}	
		for ( int l=0;l<2;l++)
		{
			for (int c=0;c<2;c++)
			{
				System.out.printf("Coloque o Valor da Matriz 2 [%d][%d]: ",l+1,c+1);
				matriz2[l][c] = scanner.nextFloat();
			}
		}	
		System.out.println("Coloque a constante: ");
		constante = scanner.nextInt();
		
		System.out.println("Menu: \n1-Somar as duas matrizes."
				+ "\n2-Subtrair a primeira matriz da segunda. "
				+ "\n3-Adicionar uma constante as duas matrizes."
				+ "\n4-Imprimir as matrizes.");
		menu = scanner.nextInt();
		
		switch(menu)
		{
		case 1:
			System.out.println("Soma das matrizes: \n");
			for (int l=0;l<2;l++)
			{
				for (int c=0;c<2;c++)
				{
					matriz3[l][c] = matriz1[l][c] + matriz2[l][c];
					System.out.print("\t"+matriz3[l][c]);
				}
				System.out.println();
			}
			break;
		case 2:
			System.out.println("Subtração das matrizes: \n");
			for (int l=0;l<2;l++)
			{
				for (int c=0;c<2;c++)
				{
					matriz3[l][c] = matriz1[l][c] - matriz2[l][c];
					System.out.print("\t"+matriz3[l][c]);
				}
				System.out.println();
			}
			break;
		case 3:
			System.out.println("Soma das matrizes com a constante matriz 1: \n");
			for (int l=0;l<2;l++)
			{
				for (int c=0;c<2;c++)
				{
					 matriz1[l][c] = matriz1[l][c] + constante;
					System.out.print("\t"+matriz1[l][c]);
				}
				System.out.println();
			}
			System.out.println("Soma das matrizes com a constante matriz 2: \n");
			for (int l=0;l<2;l++)
			{
				for (int c=0;c<2;c++)
				{
					 matriz2[l][c] = matriz2[l][c] + constante;
					System.out.print("\t"+matriz2[l][c]);
				}
				System.out.println();
			}
			break;
		case 4:
			System.out.println("Matriz 1: \n");
			for (int l=0;l<2;l++)
			{
				for (int c=0;c<2;c++)
				{
					System.out.print("\t"+matriz1[l][c]);
				}
				System.out.println();
			}
			System.out.println("Matriz 2: \n");
			for (int l=0;l<2;l++)
			{
				for (int c=0;c<2;c++)
				{
					System.out.print("\t"+matriz2[l][c]);
				}
				System.out.println();
			}
		    break;
		    default: 
		    System.out.println("Opção escolhida invalida!!!");
		}
		
  }	 
}  
 
	