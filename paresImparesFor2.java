package pacoteLacosRepeticao3;

import java.util.Scanner;

public class paresImparesFor2 {

	public static void main(String[] args) 
	{
		int contador, contImpar = 0, contPar = 0, num;
		
		Scanner ler = new Scanner(System.in);
		
		for(contador = 1; contador <= 10; contador++)
		{
			System.out.printf("Digite o " + contador + "° numero: ");
			num = ler.nextInt();
			
			if(num % 2 == 0)
			{
				contPar ++ ;
			}
			else
			{
				contImpar ++ ;
			}
		}
		
		System.out.printf("\n=============================================================");
		System.out.printf("\nForam Digitados %d numero(s) ìmpar(es) e %d numero(s) par(es).",contImpar, contPar);
		System.out.printf("\n=============================================================");
	}

}
