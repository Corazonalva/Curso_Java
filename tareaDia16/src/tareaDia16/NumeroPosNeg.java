package tareaDia16;

import java.util.Scanner;

public class NumeroPosNeg {	
	private int numero;
	
	public int getNumero() {
		return numero;
	}
	
	public void ingresaDatos()
	{
		Scanner iEntrada=new Scanner(System.in);
		System.out.println("Ingresa un número:");
		numero=iEntrada.nextInt();
		//iEntrada.close();		
	}
	
	public String positivoNegativoCero()
	{
		String resultado="";
		if(numero==0)
		{
			resultado="CERO";
		}
		else
		{
			if(numero>0)
			{
				resultado="POSITIVO";
			}
			else
			{
				resultado="NEGATIVO";
			}			
		}
		return resultado;
	}
	
	public String parImpar()
	{
		String resultado="";
		if(numero%2==0)
		{
			resultado="NUMERO PAR";
		}
		else
		{			 
			resultado="NUMERO IMPAR"; 
		}
		return resultado;
	}
	
	public String primoNoprimo()
	{
		String resultado="NUMERO PRIMO";
		if(numero<=1)
		{
			resultado="NUMERO NO PRIMO";
		}
		else
		{			
			for(int c=1;c<numero;c++)
			{
				if(numero==0)
				{
					resultado="NUMERO NO PRIMO";
					break;
				}
			}
		}
		return resultado;
	}
	

}
