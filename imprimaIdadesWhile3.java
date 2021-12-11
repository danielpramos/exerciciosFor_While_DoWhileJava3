package pacoteLacosRepeticao3;

import java.util.Scanner;

public class imprimaIdadesWhile3 
{

	public static void main(String[] args) 
	{
		/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		idade for =-99. (WHILE)*/
		
		int  idade, menor = 0, metade = 0, maior = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("Digite sua idade: ");
		idade = leia.nextInt();
		
		while(idade != -99)
		{
			System.out.printf("Digite sua idade: ");
			idade = leia.nextInt();
			
			 if(idade <= 21)
			 {
				 menor++ ;
			 }
			 else if(idade >= 50 )
			 {
				 maior++ ;
			 }
			 else
			 {
				 metade ++;
			 }
		}
		System.out.printf("\n===================================================");
		System.out.printf("\nTotal de pessoas com menos de 21 é de %d ",menor);
		System.out.printf("\nTotal de pessoas com mais de 50 é de %d ",maior);
		System.out.printf("\nTotal de pessoas entre 21 e 50 é de %d",metade);
		System.out.printf("\n===================================================");
		
		

	}

}
