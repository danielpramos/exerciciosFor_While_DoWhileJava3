package pacoteLacosRepeticao3;

import java.util.Scanner;

public class sistemaLeituraDadosWhile4 
{

	public static void main(String[] args) 
	{
		int idade, estado, calmo = 0,mulherNervosa = 0, homemAgressivo = 0, outrosCalmos = 0, sexo,
			somaCalmos = 0, homemAgressivo50 = 0, calmo18 = 0;
		String saida = "s";
		
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("\n\t========================================================");
		System.out.printf("\n\t\tPESQUISA DE CARACTERISTICAS PSICOLÓGICAS");
		System.out.printf("\n\t========================================================");
		
			while(saida.equals("s"))
			{
						
				System.out.printf("\n\nDigite sua idade: ");
				idade = leia.nextInt();
				System.out.printf("\n=======================");
				System.out.printf("\n1) para Masculino. ");
				System.out.printf("\n2) para Feminino. ");
				System.out.printf("\n3) para Outro. ");
				System.out.printf("\nEscolha a opcão do seu sexo: ");
				sexo = leia.nextInt();
				System.out.printf("\n=======================");
				System.out.printf("\n1) para Calmo(a) ");
				System.out.printf("\n2) para Nervoso(a) ");
				System.out.printf("\n3) para Agressivo(a) ");
				System.out.printf("\nQue tipo de pessoa você é? Escolha uma opção:");
				estado = leia.nextInt();
				 
				if(idade > 0 && idade <= 18)
				{
					if(estado == 1)
					{
						calmo ++;
						calmo18 ++;
					}
					else if(sexo == 2 && estado == 1)
					{
						mulherNervosa ++;
					}
					else if(sexo == 1 && estado == 3)
					{
						homemAgressivo ++;
					}
					else
					{
						outrosCalmos ++;
					}
				}
				else if(idade >= 40 && idade <= 100)
				{
					if(estado == 1)
					{
						calmo ++;
					}
					else if(sexo == 2 && estado == 1)
					{
						mulherNervosa ++;
					}
					else if(sexo == 1 && estado == 3)
					{
						homemAgressivo ++;
					}
					else
					{
						outrosCalmos ++;
					}
				}
				else 
				{		
					if(estado == 1)
					{
						calmo ++;
					}
					else if(sexo == 2 && estado == 1)
					{
						mulherNervosa ++;
					}
					else if(sexo == 1 && estado == 3)
					{
						homemAgressivo ++;
						homemAgressivo50 ++;
					}
					else
					{
						outrosCalmos ++;
					}
				}
				
				leia.nextLine();
				System.out.printf("\n\tDESEJA ADICIONAR NOVO CADASTRO? s/n ");
				saida = leia.nextLine();
			}
			
			
			somaCalmos = outrosCalmos + calmo;
			System.out.printf("\n========================================================");
			System.out.printf("\nO numero de pessoas calmas é de %d ",somaCalmos);
			System.out.printf("\nO numero de mulheres nervosas é de %d ",mulherNervosa);
			System.out.printf("\nO numero de homens  agressivos é de %d ",homemAgressivo);
			System.out.printf("\nO numero de outros calmos é de %d ",outrosCalmos);
			System.out.printf("\nO numero de pessoas nervosas com mais de 40 é de %d ",homemAgressivo50);
			System.out.printf("\nO numero de pessoas calmas com menos de 18 é de %d ",calmo18);
			System.out.printf("\n========================================================");
			
		
	}

}
