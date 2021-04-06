package Arrays;

import java.util.Scanner;

public class ExercicioUmVetor {

	public ExercicioUmVetor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soma=0;
		Scanner scanner = new Scanner(System.in);
		
		int [] A = {1,0,5,-2,-5,7};
	
			soma = A[0] + A[1] + A[5];
			A[4] = 100;
			
		System.out.println("Soma das posições A[0], A[1] e A[5] é: "+soma);
		System.out.println(A[0]+"\n"+A[1]+"\n"+A[2]+"\n"+A[3]+"\n"+A[4]+"\n"+A[5]);

	}

}
