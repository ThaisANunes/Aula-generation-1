programa
{
	
	funcao inicio()
	{
		inteiro mat[3][3],l,c,soma=0, somadi=0
		
		para (l=0;l<3;l++)
		{
			para (c=0;c<3;c++)
			{
				escreva("Valores:")
				leia(mat[l][c])
				soma = soma + mat[l][c]
			}
		}
		somadi = somadi + mat[0][0] + mat[1][1] + mat[2][2]
		escreva("Soma de todos os valores: ",soma,"\nSoma da diagonal principal: ",somadi)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {mat, 6, 10, 3}-{soma, 6, 24, 4}-{somadi, 6, 32, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */