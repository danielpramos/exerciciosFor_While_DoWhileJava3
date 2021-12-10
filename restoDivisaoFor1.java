package pacoteLacosRepeticao3;

public class restoDivisaoFor1 
{

	public static void main(String[] args) 
	{
		int contador, contVezes = 0;
		
		for(contador = 1000; contador < 2000; contador++)
		{
			if(contador % 11 == 5)
			{
				contVezes++ ;
				System.out.printf("\nO numero %d dividido por 11 tem o resto da divisão de 5",contador);
				
			}
		}
		
		System.out.println("\n");
		System.out.printf("\n=======================================");
		System.out.printf("\n %d numeros tem resto 5",contVezes);
		System.out.printf("\n=======================================");
	}

}
