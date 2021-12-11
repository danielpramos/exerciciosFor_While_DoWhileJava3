package pacoteLacosRepeticao3;

import java.util.Scanner;

public class somaNumerosDoWhile5 {

	public static void main(String[] args)
	{
		int num, contador = 0;
		
		Scanner ler = new Scanner(System.in);
		
		 System.out.printf("\nDigite um numero: ");
		 num = ler.nextInt();
		
		do
		{
			contador = contador + num ;
			
			if(num != 0)
			{
			
		    System.out.printf("Digite um numero: ");
			num = ler.nextInt();
			
			}
			
		}
		while(num != 0);
			System.out.printf("\n===================================================");
			System.out.printf("\nA soma dos numeros digitados é de %d ",contador);
			System.out.printf("\n===================================================");
		
	}
}
