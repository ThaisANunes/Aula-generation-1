programa
{
	
	funcao inicio()
	{
		inteiro ndado[10],x,cont=0,cont6=0
		real soma=0.0

		para (x=0;x<10;x++)
		{
			escreva(" ")
			escreva(ndado[x]=sorteia(1,6))
			soma= soma + ndado[x]
			cont++
	
		 se (ndado[x]==6)
		    {
		    	cont6++
		    }
		}   
		soma = soma/cont
		escreva("\nMédia: ",soma)
		escreva("\nOcorrência de maior pontuação; ",cont6)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 366; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */