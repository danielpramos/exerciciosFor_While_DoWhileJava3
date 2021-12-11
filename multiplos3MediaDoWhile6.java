package pacoteLacosRepeticao3;

import java.util.Scanner;

public class multiplos3MediaDoWhile6
{

	public static void main(String[] args) 
	{
		int num, soma = 0, contador= 0, not = 0;
		float media = 0;
		
		Scanner ler = new Scanner(System.in);
		
		 System.out.printf("\nDigite um numero: ");
		 num = ler.nextInt();
			 
		 do
			{
				
				if(num != 0)
				{
					if(num % 3 == 0)
					{
						soma += num ;
						System.out.printf("Digite um numero: ");
						num = ler.nextInt();
						contador ++;
						media = soma / contador;
					}
					else
					{
						not ++;
						System.out.printf("Digite um numero: ");
						num = ler.nextInt();
						
					}
					
				}
				
			}
			while(num != 0);
		 
		 System.out.printf("\n=======================================================================");
		 System.out.printf("\nFoi digitado %d numeros multiplos de 3 e a média é de %.2f ", contador, media );
		 System.out.printf("\nForam digitados %d numeros que nao sao multiplos de 3.",not);
		 System.out.printf("\n=======================================================================");
	}

}
