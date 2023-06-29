package tareaDia18;

public class sumaDigitos {
	private int numero;
	private int suma;
	
	public  int suma(int numero)	
	{
		this.numero=numero;
		this.suma=0;
		
		int digito=0;
		double division=0.00;
		
		while(numero>0)
		{
			division=(double)numero/10.00;
			if(division>=1)
			{digito=(int)division;}
        	else
        	{digito=(int)(division*10.00);}
			
			suma+=digito;
			numero-=digito*10;
		}
		return suma;
	}

}
