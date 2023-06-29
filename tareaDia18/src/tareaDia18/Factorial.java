package tareaDia18;

public class Factorial {
	private int numero;
	private long resultado;
	
	public Factorial(int numero)
	{
		this.numero=numero;
	}
	
	public void calculaFactorial()
	{
		if(numero<0)
		{
			System.out.println(String.format("No existe el factorial de %d",numero));
		}
		else
		{
			int c=1;
			resultado=1;
			do
			{
				resultado*=c;
				c++;

			}while(c<=numero); 
			System.out.println(String.format("El factorial de %d es : %d",numero,resultado));
		}
		
	}

}
